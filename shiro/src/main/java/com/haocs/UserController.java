package com.haocs;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class UserController {

	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request, Model model) {
		System.out.println(1);
		return "index";
	}
}