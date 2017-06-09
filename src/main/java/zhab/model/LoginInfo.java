package zhab.model;

/**
 * Created by LOG on 2017/4/4.
 */
public class LoginInfo {
    UserModel userModel;
    String token;


    public LoginInfo(UserModel userModel, String token ){
        this.setUserModel(userModel);
        this.setToken(token);
    }

    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
