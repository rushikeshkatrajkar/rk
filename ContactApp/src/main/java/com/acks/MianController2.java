//package com.acks;
//
//import java.util.List;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.view.RedirectView;
//
//import com.acks.service.UserService;
//
//@Controller
//public class MianController2 {
//	
//	@Autowired
//	private UserService userService;
//	
//	
//	@RequestMapping
//	public String login(ModelMap model)
//	{
//		
//		return "admin";
//		
//	}
//	@RequestMapping("/register")
//	public String registration()
//	{
//		
//		return "adminregister";
//	}
//	
//	
//	
//	
//		
//	
//	
//	
//	//admin login
//	@RequestMapping(path = "/login1",method = RequestMethod.POST)
//	public String loginuser( @ModelAttribute Admin1 admin1,Model model
//			,@RequestParam("username") String username,@RequestParam("password") String password)
//	{
//		
//		System.out.println(username);
//		System.out.println(password);
//		Admin1 user13 = userService.validationuser1(username, password);	
//
//		
//		if(user13!=null)
//		{
//			System.out.println("successfull");
//		return "sucess";
//		}
//		else
//		{
//			System.out.println("failed");
//		
//		return "admin";
//		}		
//		
//	}
//	
//
//	//admin insert
//	@RequestMapping("/ad/{phone}")
//	public String admininsert(@ModelAttribute Admin1 admin,@PathVariable("phone") int phone,Model model)
//
//	{
//		
//		System.out.println("phone1");
//		List<Admin1> all = userService.all();
////			
////		Admin1 getsingle = userService.getsingle(phone);
////		model.addAttribute("all", getsingle);
////		System.out.println(getsingle);
//		if(all ==null)
//		{
//			String insertAdmin = userService.insertAdmin(admin);
//			System.out.println("not insert value");
//			return "admin";
//		}
//		else
//		{
//			System.out.println("inserted");
//			String insertAdmin = userService.insertAdmin(admin);
//			return "adminregister";
//		}
//		
//		}	
//	
//	
//	//show all data(select)
//		@RequestMapping(path = "/show",method = RequestMethod.POST )
//		public RedirectView getall(@ModelAttribute Admin1 product,Model model,HttpServletRequest request)
//		{
//			
//			userService.all();
//			
//			System.out.println(product);
//			List<Admin1> all = userService.all();
//			model.addAttribute("all", all);
//			System.out.println(all);
//				RedirectView view = new RedirectView();
//				view.setUrl(request.getContextPath());
//			return view;
//		}
//}
