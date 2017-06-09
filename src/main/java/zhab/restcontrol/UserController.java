package zhab.restcontrol;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.omg.CORBA.Object;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import zhab.dao.UserMapper;
import zhab.model.*;
import zhab.util.ConstantUtils;

import javax.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;


/**
 * Created by XZN on 2017/3/15.
 */

@RestController
@RequestMapping("/userInfo")
public class UserController {

    @Autowired
    UserMapper userMapper;

    public static final ObjectMapper mapper = new ObjectMapper();

    @Value("${interfaceUrl.ipUrl}")
    protected String ipUrl;

    @Value("${interfaceUrl.ftpUrl}")
    protected String ftpUrl;

    @RequestMapping(value = "/getUserList", method = RequestMethod.GET)
    public ResponseObj<List<UserModel>> getUserList(@RequestParam String pdId) {
        try {

            List<UserModel> result = userMapper.selectUsers();
            return new ResponseObj<List<UserModel>>(result, null);

        } catch (Exception e) {
            e.printStackTrace();
            //服务器返回异常
            return new ResponseObj(null, new Error("服务器请求异常"));
        }
    }

    /*
     *根据外包人员或外包公司（公司表，传回外包人员表COM_ID）筛选出人员信息
     */
    @RequestMapping(value = "getOutSourceUsers", method = RequestMethod.GET)
    public ResponseObj<List<UserModel>> getOutSourceUsers(int userType, String comId, String search, int minId, int
            maxId) {

        try {
            if (search == null) search = "";
            search = "%" + search + "%";
            List<UserModel> result = new ArrayList<UserModel>();
            if (0 == userType)
                result = userMapper.selectOutSourceUsers(search, minId, maxId);
            else if (1 == userType)
                result = userMapper.selectOutSourceUsersById(comId, search, minId, maxId);

            return new ResponseObj<List<UserModel>>(result, null);
        } catch (Exception e) {
            e.printStackTrace();
            //服务器返回异常
            return new ResponseObj(null, new Error("服务器请求异常"));
        }
    }


    @RequestMapping(value = "/getUserPassword", method = RequestMethod.GET)
    public ResponseObj<String> getUserPassword(@RequestParam String userName, @RequestParam String password) {
        try {
            String tag = "0";
            String result = userMapper.selectUserPassword(userName);
            //密码正确，tag置为1
            if (result.equals(password)) {
                tag = "1";
            }
            return new ResponseObj<String>(tag, null);

        } catch (Exception e) {
            e.printStackTrace();
            //服务器返回异常
            return new ResponseObj(null, new Error("服务器请求异常"));
        }
    }

    @RequestMapping(value = "/setUserPassword", method = RequestMethod.GET)
    public ResponseObj<Object> setUserPassword(@RequestParam String password2, @RequestParam String userName) {
        try {

            userMapper.updateUserPassword(password2, userName);
            return new ResponseObj(null, null);

        } catch (Exception e) {
            e.printStackTrace();
            //服务器返回异常
            return new ResponseObj(null, new Error("服务器请求异常"));
        }
    }


    @RequestMapping(value = "/getOutsourceList", method = RequestMethod.GET)
    public ResponseObj<List<UserModel>> getOutsourcList(@RequestParam String comId) {
        try {

            List<UserModel> result = userMapper.getOutsourcList(comId);
            return new ResponseObj<List<UserModel>>(result, null);

        } catch (Exception e) {
            e.printStackTrace();
            //服务器返回异常
            return new ResponseObj(null, new Error("服务器请求异常"));
        }
    }


    @RequestMapping(value = "/getCheckList", method = RequestMethod.GET)
    public ResponseObj<List<UserModel>> getCheckList(@RequestParam String comId, @RequestParam int type) {
        try {
            List<UserModel> result = new ArrayList<>();
            if (0 == type) {
                result = userMapper.getCheckListByInter(comId);
            } else if (1 == type) {
                result = userMapper.getCheckListByMgr(comId);
            }
            return new ResponseObj<List<UserModel>>(result, null);

        } catch (Exception e) {
            e.printStackTrace();
            //服务器返回异常
            return new ResponseObj(null, new Error("服务器请求异常"));
        }
    }

    @Transactional
    @RequestMapping(value = "/userCheck", method = RequestMethod.POST)
    public ResponseObj userCheck(HttpServletRequest request) {
        try {
            ObjectMapper omapper = new ObjectMapper();
            String users = request.getParameter("users");
            List<UserModel> userArr = null;
            try {
                userArr = omapper.readValue(users, new TypeReference<List<UserModel>>() {
                });
            } catch (IOException e) {
                return new ResponseObj(null, new Error("数据格式不正确"));
            }
            if (userArr != null) {
                for (UserModel user : userArr) {
                    userMapper.checkUser(user.getUserId(), user.getStatus());
                }
            }
            return new ResponseObj(null, null);
        } catch (Exception e) {
            e.printStackTrace();
            //服务器返回异常
            return new ResponseObj(null, new Error("服务器请求异常"));
        }
    }



}
