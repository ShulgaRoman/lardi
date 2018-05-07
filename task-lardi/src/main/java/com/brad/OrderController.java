package com.brad;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class OrderController {

	@Autowired
	OrderJSONService  orderService;
	
	@RequestMapping(value = "/orders", 
			produces = { MediaType.APPLICATION_JSON_VALUE }, 
			method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Order>> getOrders() {

		List<Order> orders = orderService.readJson();

		return new ResponseEntity<List<Order>>(orders, HttpStatus.OK);
	}
	
	@RequestMapping(value="/view", produces = {
			MediaType.TEXT_HTML_VALUE},  
			method = RequestMethod.GET)
	public String viewOrders () {
		return "order-listing";
	}
}
