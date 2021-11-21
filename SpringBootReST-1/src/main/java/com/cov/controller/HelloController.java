package com.cov.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class HelloController {
	@ResponseBody
	@RequestMapping("/hello/{name}/{tech}")
	public String sayHello(@PathVariable String name, @PathVariable String tech) {

		return "Hello" + name + " ,working with" + tech;
	}

	@ResponseBody
	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public String otherSayHello(@RequestParam String name, @RequestParam String tech) {
		return "Hello" + name + " ,working with" + tech;

	}
	@ResponseBody
	@RequestMapping(value = "/hello", method = RequestMethod.PUT)
	public String meth1() {
		return  "this is PUT method";
	}
	@ResponseBody
	@RequestMapping(value = "/hello", method = RequestMethod.DELETE)
	public String meth2() {
		return  "this is DELETE method";
		
		
	}

}
