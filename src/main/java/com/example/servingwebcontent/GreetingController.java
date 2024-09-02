package com.example.servingwebcontent;

import com.example.model.EmailTestModel;
import com.example.model.GcpEvent;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {

	@PostMapping("/greeting")
	public ModelAndView greeting(@RequestBody GcpEvent gcpEvent) {
		ModelAndView greeting = new ModelAndView("greeting");
		System.out.println("InsertId is"  + gcpEvent.getInsertId());
		greeting.addObject("gcpEvent", gcpEvent);
		return greeting;

	}

}
