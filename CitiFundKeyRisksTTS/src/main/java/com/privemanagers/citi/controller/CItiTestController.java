package com.privemanagers.citi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.privemanagers.citi.dto.CitiFundListTTS;
import com.privemanagers.citi.service.IMyTestService;

@Controller
@RequestMapping("/")
public class CItiTestController {

	@Autowired
	IMyTestService testService;

	/*@RequestMapping(value = "/citifundtts", method = RequestMethod.GET)
	public String handleTestRequest(@RequestParam(value = "isin", required = true) String isin, ModelMap model) {

		model.addAttribute("isin", isin);
		return "index";
	}*/

	@RequestMapping(value = "/citifundtts/lists", method = RequestMethod.GET)
	public String handleMyTestService(final ModelMap model) {
		
		List<String> myList = testService.getDaoData();

		model.addAttribute("myList", myList);

		return "list";
	}

	@RequestMapping(value = "/citifundtts/fetchtts", method = RequestMethod.GET)
	public String getAllTTSData(final ModelMap model) {

		List<CitiFundListTTS> ttsList = testService.fetchTTSData();
		model.addAttribute("ttsList", ttsList);
		
		return "list";
	}
}
