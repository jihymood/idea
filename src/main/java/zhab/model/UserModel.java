package zhab.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import zhab.util.ConstantUtils;

/**
 * Created by XZN on 2017/3/8.
 */

public class UserModel  {

    //id
    String userId;
    //用户名
    String userName;
    //密码
    String password;
    //所属公司id，电信就是部门名称，外包就是公司名称
    String deptId;
    //所属公司，电信就是部门名称，外包就是公司名称
    String deptName;
    //手机号
    String phone;
    //类型
    int type;//0,1,2
    //状态 1 2 3
    String status;
    //电信审核时：电信公司Code
    String checkCity;
    //创建时间
    long createTime;
    String createTimeStr;


    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }


    public UserModel() {
    }

    public UserModel(String userId, String userName, String password, String deptName, String
            phone, int type, String status) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.deptName = deptName;
        this.phone = phone;
        this.type = type;
        this.status = status;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @JsonIgnore
    public String getPassword() {
        return password;
    }

    @JsonIgnore
    public void setPassword(String password) {
        this.password = password;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCheckCity() {
        return checkCity;
    }

    public void setCheckCity(String checkCity) {
        this.checkCity = checkCity;
    }

    public long getCreateTime() {
        long tl = 0;
        SimpleDateFormat sdf = new SimpleDateFormat(ConstantUtils.DATA_FORMAT2);//小写的mm表示的是分钟
        if (createTimeStr != null && !"".equals(createTimeStr)) {
            try {
                tl = sdf.parse(createTimeStr).getTime();
            } catch (ParseException e) {

            }
        }
        return tl;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
        SimpleDateFormat sdf = new SimpleDateFormat(ConstantUtils.DATA_FORMAT);
        this.createTimeStr = sdf.format(createTime);
    }

    public String getCreateTimeStr() {
        return createTimeStr;
    }

    public void setCreateTimeStr(String createTimeStr) {
        this.createTimeStr = createTimeStr;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", deptName='" + deptName + '\'' +
                ", phone='" + phone + '\'' +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                '}';
    }


}
