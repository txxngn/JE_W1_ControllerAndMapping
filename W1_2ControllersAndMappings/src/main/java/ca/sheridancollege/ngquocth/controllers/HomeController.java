package ca.sheridancollege.ngquocth.controllers;  //sub package

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  //sau khi tạo controller class thì phải add cái @Controller này
public class HomeController {
	
	@GetMapping("/")			//localhost:8080 (root directory/root page)
	public String rootPage() {
		return "meow.html";  //nếu dùng meow.html nó sẽ bị lỗi vì themeleaf chỉ run ở templates filder
	}

	/*
	 * Status error
	 * 500 series -> error (Stack trace)
	 * 400 series -> client error, request error
	 * 302 -> redirection
	 * 200 -> everything is ok 
	 * */
	
	//tất cả html đều phải tạo trong templates
	//nếu bị lỗi localhost 8080 in used, stop running application then run again
	
	//can access anything in static folder by /file name, but cannot do this way in templates folder
	
	
	@GetMapping("/woof")
	public String abcPage() {
		return "woof.html";
	}
	
	
	@GetMapping("/ew")
	public String testAgain() {
		return "ewew.html";
	}
	
	
	
}
