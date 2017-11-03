/**
 * 
 */
package com.privemanagers.citi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.privemanagers.citi.dto.CitiFundListTTS;

/**
 * @author Mangesh K
 *
 */
@Service
public interface IMyTestService {

	public List<String> getDaoData();

	public void saveTTS();

	public List<CitiFundListTTS> fetchTTSData();

	public String fetchTwilioNumber();
}
