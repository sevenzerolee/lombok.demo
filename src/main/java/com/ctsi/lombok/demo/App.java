package com.ctsi.lombok.demo;

import com.ctsi.lombok.demo.entity.Data;

import lombok.extern.java.Log;

/**
 * Hello world!
 *
 */
@Log
public class App {
	
	public static void main(String[] args) {
		log.info("start");
		System.out.println("Hello World!");
		
		Data data = new Data();
		data.setData("data");
		log.info(data.getData());
		
		log.info("end");
	}
	
}
