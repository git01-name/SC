package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.Bill;
import entity.Provider;
import entity.User;

public interface UserMapper {
	public List<User> getlist();
	public int add(User user);
	public List<User> like(@Param("userName")String userName);
	/*
	 * 登入
	 * */
	public int Login(User user);
	/**
	 * bill查询
	 */
	public List<Bill>Billselect(@Param("productName")String productName,@Param("isPayment")String isPayment,@Param("pag")String pag);
	/**
	 * provider查询
	 */
	public List<Provider>Providerselect();
	/**
	 * user查询
	 */
	public List<User>Userselect();
	public List<Provider> providerList();
	public String BillByid(@Param("billCode")String billCode);
	public Bill Billdjy(@Param("id")String id);
	public int billadd(Bill bill);
	//删除
	public int delete1(String id);
	public int uodate1(Bill bill);
}
