package com.zq.restapi;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zq.dao.User;
import com.zq.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping("/view/login")
	@ResponseBody
	public String login(HttpServletRequest request,@RequestParam String name,@RequestParam String password){
		User user = userService.selectByNameAndPassword(name, password);
		if(user != null){
			//request.getSession().setAttribute("name", name);
			return "login_success";
		}
		Map<String,String> map = new HashMap<String,String>();
		map.put("1", "张三");
		
		return "index.jsp";
	}
}
