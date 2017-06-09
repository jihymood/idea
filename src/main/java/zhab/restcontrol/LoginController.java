package zhab.restcontrol;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import zhab.dao.UserMapper;
import zhab.model.BasePointModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zxm on 2017/4/10.
 *
 *
 * android studio中使用retrofit请求数据，地址为"http://172.16.108.137:10002/user1/getStringList"
 * control控制类中根据请求的地址到相应的方法中，该方法中有到包下的Mapper接口，
 * 然后该接口类在对应的resources包下的.xml文件，这里是关于数据库的增删改查
 *
 *
 *
 *
 *
 */

@RestController
@RequestMapping("/user1")
public class LoginController {

    @Autowired
    UserMapper userMapper;

    public static final ObjectMapper mapper = new ObjectMapper();

    @Value("${interfaceUrl.ipUrl}")
    protected String ipUrl;

    /*
     * 获取所属地市
     */
    @RequestMapping(value = "/getCom", method = RequestMethod.GET)
    public ResponseObj<String> getCom() {
        try {

//            List<OrgModel> result = userMapper.getOrgNameById("0");
//            return new ResponseObj<List<OrgModel>>(result, null);
            return new ResponseObj<String>("sssssss", null);

        } catch (Exception e) {
            e.printStackTrace();
            //服务器返回异常
            return new ResponseObj(null, new Error("服务器请求异常"));
        }
    }

    @RequestMapping(value = "/getPointList", method = RequestMethod.GET)
    public ResponseObj<List<BasePointModel>> getPointList() {
        try {
//            List<String> basePoint = userMapper.getPointList();
//            return new ResponseObj<List<String>>(basePoint, null);
            List<BasePointModel> list = new ArrayList<>();
            list.add(new BasePointModel(1, 22f, 22f, "ddxx", "dd", "dd", "dd", "dd"));
            return new ResponseObj<List<BasePointModel>>(list, null);
        } catch (Exception e) {
            e.printStackTrace();
            //服务器返回异常
            return new ResponseObj(null, new Error("服务器请求异常"));
        }
    }

    @RequestMapping(value = "/getStringList", method = RequestMethod.GET)
    public ResponseObj<List<String>> getStringList() {
        try {
            List<String> basePoint = userMapper.getStringList();
            return new ResponseObj<>(basePoint, null);
        } catch (Exception e) {
            e.printStackTrace();
            //服务器返回异常
            return new ResponseObj(null, new Error("服务器请求异常"));
        }
    }


    /**
     * 这里的@RequestMapping(value = "/getBase1", method = RequestMethod.GET) 一句里 接下：
     * getBase1前面要加斜杠"/"
     *
     * @return
     */
    @RequestMapping(value = "/getStrs", method = RequestMethod.GET)
    public ResponseObj<String> getStrs() {
        try {
            return new ResponseObj<String>("测试侧四", null);
        } catch (Exception e) {
            e.printStackTrace();
            //服务器返回异常
            return new ResponseObj(null, new Error("服务器请求异常"));
        }
    }


}
