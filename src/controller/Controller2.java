package controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSONArray;

import entity.Bill;
import service.UserMapperService;

@Controller
public class Controller2 extends BaseController{
	@Autowired
	private UserMapperService userMapperService;
	@RequestMapping("/billadd")
	public String add(){
		return "billadd";
	}
	@RequestMapping("/billaddd")
	@ResponseBody
	public Object billadddo(HttpServletRequest request){
		String billCode= request.getParameter("billCode");
		System.out.println(billCode);
		String yy=userMapperService.BillByid(billCode);
		HashMap<String, String> rHashMap=new HashMap<String,String>();
		rHashMap.put("xx",yy);
		return JSONArray.toJSONString(rHashMap);
	}
	@RequestMapping("/djy")
	public String djy(@RequestParam("id") String id,Model model){
		System.out.println("id:"+id);
		Bill bill=userMapperService.Billdjy(id);
		System.out.print("aaa"+bill.getProductName());

		if (bill != null) {
			model.addAttribute("bill",bill);
			return "billview";
		}
		return "billlist";
	}
	@RequestMapping("/djy02")
	public String djy02(@RequestParam("id") String id,Model model){
		System.out.println("id:"+id);
		Bill bill=userMapperService.Billdjy(id);
		System.out.print("aaa"+bill.getProductName());
		if (bill != null) {
			model.addAttribute("bill",bill);
			return "billmodify";
		}
		return "billlist";
	}
	@RequestMapping(value="/djy03",method=RequestMethod.GET,
			produces={"application/json;charset=UTF-8"})
	@ResponseBody
	public Object djy03(@RequestParam("id") String id){
		Bill bill=userMapperService.Billdjy(id);
		System.out.println("sssssssssssss="+JSONArray.toJSONString(bill));
		return JSONArray.toJSONString(bill);
	}


	@RequestMapping("/upload2")
	public String upload2(@RequestParam("myfiles")MultipartFile[] myfiles, HttpServletRequest request) throws IOException{
		System.out.println("name="+request.getParameter("name"));
		System.out.println("name="+request.getParameter("pwd"));
		System.out.println("myfiles.length="+myfiles.length);
		String realPath = request.getSession().getServletContext().getRealPath("upload");
		System.out.println(realPath+"***************");
		for (MultipartFile multipartFile : myfiles) {
			FileUtils.copyInputStreamToFile(multipartFile.getInputStream(),new File(realPath, multipartFile.getOriginalFilename()));
		}
		System.out.println("上传成功~~~~~~~~");
		return "index";
	}
	/**
     * 文件下载
     * @throws IOException 
     */
    @RequestMapping(value="/download",method=RequestMethod.GET)
    public void download(@RequestParam(value="filename")String filename,
            HttpServletRequest request,
            HttpServletResponse response) throws IOException {
        //模拟文件，myfile.txt为需要下载的文件  
        String path = request.getSession().getServletContext().getRealPath("images/n.png")+"\\"+filename;  
        //获取输入流  
        InputStream bis = new BufferedInputStream(new FileInputStream(new File(path)));
        //转码，免得文件名中文乱码  
        filename = URLEncoder.encode(filename,"UTF-8");  
        //设置文件下载头  
        response.addHeader("Content-Disposition", "attachment;filename=" + filename);    
        //1.设置文件ContentType类型，这样设置，会自动判断下载文件类型    
        response.setContentType("multipart/form-data");   
        BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());  
        int len = 0;  
        while((len = bis.read()) != -1){  
            out.write(len);  
            out.flush();  
        }  
        out.close();  
    }

}
