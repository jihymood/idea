package zhab.dao;

import zhab.model.*;

import java.util.List;

public interface UserMapper {

	public List<BasePointModel> getPointList(); //点信息

	public List<String> getStringList();




	public List<UserModel> selectUsers();

	public List<UserModel> selectOutSourceUsers(String search, int sinceId, int maxId);

	public List<UserModel> selectOutSourceUsersById(String comId,String search, int sinceId, int maxId);


	public List<String> selectUserAccount(String account);

	public String selectUserPassword(String userName);

	public void updateUserPassword(String password ,String userName);

	public List<UserModel> getOutsourcList(String mgrId);


	public List<UserModel> getUserByOrgCode(String orgCode);

	public UserModel getUserModelById(String userId);

	public List<UserModel> getCheckListByInter(String comId);

	public List<UserModel> getCheckListByMgr(String comId);

	public void checkCom(String comId);

	public void checkUser(String userId,String tag);

}
