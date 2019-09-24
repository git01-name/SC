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
	 * ����
	 * */
	public int Login(User user);
	/**
	 * bill��ѯ
	 */
	public List<Bill>Billselect(@Param("productName")String productName,@Param("isPayment")String isPayment,@Param("pag")String pag);
	/**
	 * provider��ѯ
	 */
	public List<Provider>Providerselect();
	/**
	 * user��ѯ
	 */
	public List<User>Userselect();
	public List<Provider> providerList();
	public String BillByid(@Param("billCode")String billCode);
	public Bill Billdjy(@Param("id")String id);
	public int billadd(Bill bill);
	//ɾ��
	public int delete1(String id);
	public int uodate1(Bill bill);
}
