package jp.co.rakus.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/multi")
public class MultiController {

	@Autowired
	private HttpSession session;

	@Autowired
	@RequestMapping("/multi")
	public String multi() {

		return "inputnum";

	}

	@RequestMapping("/toOutput")
	public String toOutput(String num1,String num2) {

		Multi multi = new Multi();
		
		multi.setNum1(Integer.parseInt(num1));
		multi.setNum2(Integer.parseInt(num2));
		
		
		
		//int num1 = Integer.parseInt(multi.getNum1());
		//int num2 = Integer.parseInt(multi.getNum2());

		int answer = Integer.parseInt(num1) *Integer.parseInt(num2);
		

		session.setAttribute("multi",multi );
		session.setAttribute("answer",answer);

		return "outputnum";
	}

	@RequestMapping("toOutput2")
	public String toOutput2() {

		// int num1 = Integer.parseInt(multi.getNum1());
		// int num2 = Integer.parseInt(multi.getNum2());

		// int answer = num1 * num2;

		// model.addAttribute("answer", answer);

		// System.out.println("a");
		return "/outputnum2";
	}

}
