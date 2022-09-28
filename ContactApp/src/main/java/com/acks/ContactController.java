package com.acks;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.acks.service.Contaservice;

@Controller
public class ContactController {
	@Autowired
	private Contaservice contactService;
	
	@RequestMapping
	public String home()
	{
		return "dashbordhome";
	}
	
	@RequestMapping("/con")
	public String contact()
	{
		return "contact";
	}
	
	
	
	@RequestMapping(path = "/contact1", method = RequestMethod.POST)
	public RedirectView user(@ModelAttribute Contact contact,HttpServletRequest request) {

		 contactService.insert(contact);
//        RedirectView view = new RedirectView();
//  	  view.setUrl(request.getContextPath()+"/login1");
		  RedirectView view = new RedirectView();
		  view.setUrl(request.getContextPath()+"/show");
		  return view;
	}
	
	//show all data(select)
		@RequestMapping(path = "/show" )
		public ModelAndView getall(@ModelAttribute Contact contact)
		{
			
			 contactService.all();
			
			System.out.println(contact);
			ModelAndView view = new ModelAndView();
			List<Contact> all = contactService.all();
			view.addObject("all", all);
			System.out.println(all);

			view.setViewName("sucess");
			return view;
			
		}
		
		//delete data
		@RequestMapping("/user/{id}")
		public RedirectView getdelete(@PathVariable("id") int id,HttpServletRequest request)
		{
			contactService.getdelete(id);
			RedirectView view = new RedirectView();
			  view.setUrl(request.getContextPath()+"/show");
			  return view;
			
		}
		
//single
		//single data
		@RequestMapping("/update1/{id}")
		public ModelAndView getsingle(@PathVariable("id") int id)
		{
			Contact singledata = contactService.singledata(id);
			ModelAndView view = new ModelAndView();
			view.addObject("singledata", singledata);
			view.setViewName("update");
			System.out.println(singledata); 
			return view;
			
		}
}
