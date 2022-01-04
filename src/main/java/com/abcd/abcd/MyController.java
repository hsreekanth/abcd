package com.abcd.abcd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
@GetMapping(path="/")
public String index() {
return "HelloWorld";
		}
@GetMapping(path="/hello")
public String index1() {
return "Hello geek";
		}
}
