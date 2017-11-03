/**
 * 
 */
package com.privemanagers.citi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.privemanagers.citi.service.IMyTestService;

/**
 * @author Mangesh K
 *
 */

@RestController
@RequestMapping("/")
public class MyRestController {

	@Autowired
	IMyTestService testService;

	
	@RequestMapping(value = "/citifundtts/savetts")
	public void saveTTSData(){
		testService.saveTTS();
	}
}
