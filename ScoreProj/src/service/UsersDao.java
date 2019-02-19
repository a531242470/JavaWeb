package service;

import java.util.List;

import entity.DepScore;
import entity.Department;
import entity.Users;

//用户业务逻辑接口
public interface UsersDao {
//用户登录
	public boolean userLogin(Users user);
	public Users searchUser(String user);
	public List<Users> searchUserByDep(Department department);
	public List<Users> searchAllUser();
	public List<Department> searchAllDepartment();
	public boolean deleteDepScore(int id);
	
	public List<Users> searchUserScore(String userName);
	public Users searchUserByName(String name);
	
	public boolean addScore(DepScore depScore);
	public DepScore searchDepScoreByName(String userName);
	public boolean updateDepScore(DepScore depscore);
	public List<DepScore> searchAllDepScore();
	public DepScore searchDepScoreById(int id);
	
}
