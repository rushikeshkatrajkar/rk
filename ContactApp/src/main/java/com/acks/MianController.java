
package com.acks;

import java.util.ArrayList;

import javax.naming.AuthenticationException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.el.stream.Optional;
import org.apache.tomcat.util.net.jsse.openssl.Authentication;
import org.jboss.logging.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.acks.service.UserService;

@Controller
public class MianController {

	@Autowired
	private UserService userService;

	@RequestMapping(path = "/loginuser")
	public String login1(ModelMap model) {

		return "login";

	}

	@RequestMapping(value = "/regi", method = RequestMethod.GET)
	public String registration1(Model model) {

		model.addAttribute("login", new User1());

		return "registration";
	}

	@RequestMapping(value = "/userreg", method = RequestMethod.POST)
	public String userinsert1(@Valid @ModelAttribute("user1") User1 user1, BindingResult result,
			@RequestParam("name") String name, @RequestParam("phone") String phone, @RequestParam("email") String email,
			@RequestParam("address") String address, @RequestParam("username") String username,
			@RequestParam("password") String password, Model model) {

		model.addAttribute("name", name);
		model.addAttribute("phone", phone);
		model.addAttribute("email", email);
		model.addAttribute("address", address);
		model.addAttribute("username", username);
		model.addAttribute("password", password);

		System.out.println("request param retrive data in controller" + name);

		if (result.hasErrors()) {
			System.out.println(result);
			System.out.println(user1);
			return "registration";
		}

		User1 user2 = userService.validation(username);

		if (user2 != null) {
			model.addAttribute("username1", username + "\t" + "username alredy exit");

			return "registration";

		}

		if (user2 != null) {

			return "registration";

		}

		else {
			String insert1 = userService.insert(user1);
			return "login";
		}

	}

	@RequestMapping(path = "/login1", method = RequestMethod.POST)
	public String loginuser(@ModelAttribute User1 user1, Model model, @RequestParam("username") String username,
			@RequestParam("password") String password) {

		System.out.println(username);
		System.out.println(password);
		User1 user13 = userService.getsingle(username, password);

		if (user13 != null) {
			System.out.println("successfull");
			return "DashboardCont";
		} else {
			System.out.println("failed");

			return "login";
		}

	}

}
