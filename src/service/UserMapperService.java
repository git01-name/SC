package service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.Bill;
import entity.Provider;
import entity.User;

public interface UserMapperService {
	public List<User> getlist();
	public int add(User user);
	public List<User>like(String userName);
	/**
	 * 登入
	 * @param user
	 * @return
	 */
	public int Login(User user);
	/**
	 * bill查询
	 */
	public List<Bill> Billselect(String productName,String isPayment,String pag);
	/**
	 * Provider查询
	 */
	public List<Provider> Providerselect() ;
	/**
	 * user查询
	 */
    public List<User> Userselect();
    public List<Provider> providerList();
	public String BillByid(@Param("billCode")String billCode);
	public Bill Billdjy(String id);
	public int billadd(Bill bill);
	public int delete1(String id);
	public int uodate1(Bill bill);
}
