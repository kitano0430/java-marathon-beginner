package jp.co.rakus.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController5 {

	@ModelAttribute
	public UserForm5 setUpForm() {
		return new UserForm5();
	}

	@RequestMapping("/toInput")
	public String toInput() {
		return "inputuserinfo5";
	}

	@RequestMapping("/create")
	public String create(Model model, UserForm5 form) {

		User user = new User();
		BeanUtils.copyProperties(form, user);

		model.addAttribute("user", user);
		return "outputuserinfo5";
	}

}
