package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.sun.istack.internal.logging.Logger;
import com.sun.org.apache.regexp.internal.recompile;

import entity.Bill;
import entity.Provider;
import entity.User;
import service.UserMapperService;

@Controller
public class Controller1 {
	@Autowired
	private UserMapperService userMapperService;
	@RequestMapping("login.do")
	public String login(HttpServletRequest request, HttpServletResponse response){
		String userCode=request.getParameter("userCode");
		String userPassword=request.getParameter("userPassword");
		System.out.println(userCode);
		System.out.println(userPassword);
		User user=new User();
		user.setUserCode(userCode);
		user.setUserPassword(userPassword);
		System.out.println(user.getUserCode());
		int a=0;
		try {
			//			ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml"); 
			//			UserMapperService userMapperService = (UserMapperService)ctx.getBean("userMapperService");
			a=userMapperService.Login(user);
			if (a>0) {
				System.out.println("成功");
				HttpSession session=request.getSession();
				session.setAttribute("userSession",user);
				return "frame";
			}
			System.out.println(a);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
	}
	
	@RequestMapping("/bill.dodo")
	public String billdodo(Bill bill){
		System.out.println("新增");
		int a= userMapperService.billadd(bill);
		if (a>0) {
			return "redirect:/bill.do";
		}
		return null;
	}
	@RequestMapping("/delete1.do")
	@ResponseBody
	public Object delete1(String id){
		System.out.println("传了一个id");
		HashMap<String, String>hashMap=new HashMap<String,String>();
		int a=userMapperService.delete1(id);
		System.out.println(a);
		if (a>0) {
			hashMap.put("delResult", "true");
		}else {
			hashMap.put("delResult","false");
		}
		System.out.println(JSONArray.toJSONString(hashMap));
		return JSONArray.toJSONString(hashMap);
	}
	@RequestMapping("/update1.do")
	public String update1(Bill bill){
	if (userMapperService.uodate1(bill)>0) {
		return "redirect:/bill.do";
	}else {
		return "redirect:/update1.do";
	}	
	}
	@RequestMapping("/bill.do")
	public String bill(HttpSession session,HttpServletRequest request){
		String queryProviderId=request.getParameter("queryProviderId");
		String queryIsPayment=request.getParameter("queryIsPayment");
		String pag1=request.getParameter("pag");
		if (pag1==null||pag1==""||Integer.valueOf(pag1)<=0) {
			pag1="1";
		}
		String pag=(Integer.valueOf(pag1)-1)*2+"";
		List<Bill> list=userMapperService.Billselect(queryProviderId,queryIsPayment,pag1);
		List<Provider> list2=new ArrayList<Provider>();
		list2=userMapperService.providerList();
		session.setAttribute("providerList",list2);
		session.setAttribute("billList",list);
		request.setAttribute("pag", Integer.valueOf(pag1));
		return "billlist";
	}
	@RequestMapping("/provider.do")
	public String provider(HttpSession session){
		//		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		//		UserMapperService userMapperService = (UserMapperService)ctx.getBean("userMapperService");
		List<Provider>list=userMapperService.Providerselect();
		session.setAttribute("providerList",list);
		return "providerlist";
	}
	@RequestMapping("/user.do")
	public String user(Model model){
		//		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		//		UserMapperService userMapperService = (UserMapperService)ctx.getBean("userMapperService");
		List<User>list=userMapperService.Userselect();
		model.addAttribute("userList",list);
		return "userlist";
	}
}

