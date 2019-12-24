package com.ctsi.lombok.demo;

import org.junit.Test;

import com.ctsi.lombok.demo.entity.Data;

/**
 * Unit test for simple App.
 */
public class AppTest {
	/**
	 * Rigorous Test :-)
	 */
	@Test
	public void shouldAnswerWithTrue() {
		Data data = new Data();
		data.setData("data");
		System.out.println(data.getData());
	}
}
