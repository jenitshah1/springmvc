package com.springmvcdemo.model;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.web.client.RestTemplate;

import com.springmvcdemo.constant.EMPRestAPIConstant;


public class TestSpringRestExample {

	public static final String SERVER_URI = "http://localhost:8080/springmvc";
	
	public static void main(String args[]){
		System.out.println("*****");
		testGetAllEmployee();
	}

	private static void testGetAllEmployee() {
		RestTemplate restTemplate = new RestTemplate();
		
		List<LinkedHashMap> emps = restTemplate.getForObject(SERVER_URI+EMPRestAPIConstant.GET_ALL_EMP, List.class);
		System.out.println(emps.size());
		for(LinkedHashMap map : emps){
			System.out.println("ID="+map.get("id")+",Name="+map.get("name")+",CreatedDate="+map.get("createdDate"));;
		}
	}	
}