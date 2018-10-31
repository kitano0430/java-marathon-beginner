package jp.co.rakus.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * グッズの価格を受け取るコントローラー.
 * 
 * @author maiko.kitano
 *
 */

@Controller
@RequestMapping("/register")
public class RegisterControler15 {

	@Autowired
	private ServletContext application;

	/**
	 * 入力画面を表示する.
	 * 
	 * @return 入力画面
	 */
	@Autowired
	@RequestMapping("/toBuy")
	public String toBuy() {
		return "buygoods";
	}

	/**
	 * 受け取った金額を出力する.
	 * 
	 * @param goods1 グッズ1の金額
	 * @param goods2 グッズ2の金額
	 * @param goods3 グッズ3の金額
	 * @return 出力画面
	 */
	@RequestMapping("/toTotal")
	public String toTotal(String goods1, String goods2, String goods3) {

		int subtotal = Integer.parseInt(goods1) + Integer.parseInt(goods2) + Integer.parseInt(goods3);
		int total = (int) ((subtotal) * 1.08);

		application.setAttribute("subtotal", subtotal);
		application.setAttribute("total", total);

		return "totalprice";
	}

}
