package jp.co.rakus.controller;

import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 名前を受け取るコントローラー.
 * 
 * @author maiko.kitano
 *
 */
@Controller
@RequestMapping("/name")
public class NameReceiveController {

	/**
	 *　入力画面を表示する.
	 * 
	 * @return 入力画面
	 */
	@RequestMapping("/index")
	public String index() {
		return "inputname";
	}

	/**
	 * フォームオブジェクトをリクエストパラメータにセットする.
	 * 
	 * @return フォームオブジェクト
	 */
	@Autowired
	@ModelAttribute
	public User setUpForm() {
	return new User();
}

	/**
	 * 受け取った名前を出力する.
	 * 
	 * @param model モデル
	 * @param name　リクエストパラメータで送られてくる名前
	 * @return　出力画面
	 */
	@RequestMapping("/toOutput")
	public String toOutput(Model model,String name) {

		
		model.addAttribute("name",name);
	
		
		return "outputname";
	}

}
