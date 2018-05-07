package com.brad;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class OrderJSONServiceImpl implements OrderJSONService {
	
	@Override
	public List<Order> readJson() {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Order> orders = new ArrayList<>();
		try {
			orders = Arrays.asList(objectMapper.readValue(new File("src/main/resources/trans.json"), 
					Order[].class));
		} catch (IOException e) {
			e.printStackTrace();
		}
        return orders;
    }

}
