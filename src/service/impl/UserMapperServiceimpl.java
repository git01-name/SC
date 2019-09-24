package service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import dao.UserMapper;
import entity.Bill;
import entity.Provider;
import entity.User;
import service.UserMapperService;
@Service("userMapperService")
public class UserMapperServiceimpl implements UserMapperService{
	@Autowired
	@Qualifier("userMapper")
	private UserMapper userMapper;
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	@Override
	public List<User> getlist() {
		return userMapper.getlist();
	}
	@Override
	public int add(User user) {
		return userMapper.add(user);
	}
	@Override
	public List<User> like(String userName) {
		// TODO Auto-generated method stub
		return userMapper.like(userName);
	}
	@Override
	public int Login(User user) {
		System.out.println("进来了");
		return userMapper.Login(user);
	}
	@Override
	public List<Bill> Billselect(String productName,String isPayment,String pag) {
		
		return userMapper.Billselect(productName,isPayment,pag);
	}
	@Override
	public List<Provider> Providerselect() {
		return userMapper.Providerselect();
	}
	@Override
	public List<User> Userselect() {
		System.out.println("进来了?");
		return userMapper.Userselect();
	}
	@Override
	public List<Provider> providerList() {
		// TODO Auto-generated method stub
		return userMapper.providerList();
	}
	@Override
	public String BillByid(@Param("billCode")String billCode){
		System.out.println(userMapper.BillByid(billCode));
		return userMapper.BillByid(billCode);
	}
	@Override
	public Bill Billdjy(String id) {
		System.out.println(id+"ididididididididdi");
		Bill bill=userMapper.Billdjy(id);
	
		return userMapper.Billdjy(id);
	}
	@Override
	public int billadd(Bill bill) {
		System.out.println(bill.getProductName());
		
		return userMapper.billadd(bill);
	}
	@Override
	public int delete1(String id) {
		return userMapper.delete1(id);
	}
	@Override
	public int uodate1(Bill bill) {
		return userMapper.uodate1(bill);
	}
	
}
