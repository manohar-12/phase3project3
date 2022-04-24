package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@Autowired
	LoginDao Feedbackdao;

	// @GetMapping("/listProducts")
	@RequestMapping(value = "/showlogin", method = RequestMethod.GET)
	public List<LoginEntity> listProducts() {
		List<LoginEntity> list = Feedbackdao.getlogin();
		return list;
	}

	@PostMapping("/login")
	public String addProduct(@RequestBody LoginEntity entity) {
		if(Feedbackdao.addlogin(entity)>0)
			return "Data Inserted";
		else
			return "error while Inserting DATA";
	}

}