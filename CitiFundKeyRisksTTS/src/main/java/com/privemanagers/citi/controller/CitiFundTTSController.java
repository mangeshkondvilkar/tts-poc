/**
 * 
 */
package com.privemanagers.citi.controller;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.privemanagers.citi.service.IMyTestService;
import com.privemanagers.citi.util.URLConstants;

/**
 * @author Mangesh K.
 * 
 *         Purpose: A front controller which will be called first when Citi-User
 *         clicks on the Permalink provided by Prive. It is responsible to
 *         redirect an user to an external window wherein User can select a
 *         language and take further actions.
 */
@Controller
@RequestMapping("/")
public class CitiFundTTSController {

	private static ModelMap commonModelMap = new ModelMap();
	

	@Autowired
	IMyTestService testService;

	/**
	 * @param isin
	 *            - Unique No. to identify a Citi-Fund
	 * @param modelMap
	 * @return - External window view name to which user will be redirected
	 */
	@RequestMapping(value = URLConstants.PERMALINK_URL_PATH, method = RequestMethod.GET)
	public String handlePermalinkRequest(@RequestParam(value = "isin", required = true) String isin) {
		
		// Fetch twilio number, generate random pin and redirect
		
		String twilioNo = testService.fetchTwilioNumber();
		commonModelMap.addAttribute("twilioNo", twilioNo);

		return "citi-tts-home";
	}

	@RequestMapping(value="/generatePin", method=RequestMethod.GET)
	public String generateSessionPIN(){
		Random random = new Random();
		int randomInt = random.nextInt(999);
		commonModelMap.addAttribute("mpin", randomInt);
		return "citi-tts-home";
	}
	
	@RequestMapping(value="/generatePin1", method=RequestMethod.GET)
	public String generateSessionPIN1(){
		Random random = new Random();
		int randomInt = random.nextInt(999);
		commonModelMap.addAttribute("mpin", randomInt);
		return "citi-tts-home";
	}
	
}
