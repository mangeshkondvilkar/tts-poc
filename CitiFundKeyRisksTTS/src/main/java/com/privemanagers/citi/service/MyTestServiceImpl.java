/**
 * 
 */
package com.privemanagers.citi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.privemanagers.citi.dao.IMyTestDao;
import com.privemanagers.citi.dto.CitiFundListTTS;

/**
 * @author Mangesh K
 *
 */
@Service
public class MyTestServiceImpl implements IMyTestService{

	@Autowired
	IMyTestDao testDao;
	
	@Override
	public List<String> getDaoData() {
		
		return testDao.getDaoData();
	}

	@Override
	@Transactional
	public void saveTTS() {
		testDao.saveTTS();
	}

	@Override
	public List<CitiFundListTTS> fetchTTSData() {
		return testDao.fetchTTSData();
	}

	@Override
	public String fetchTwilioNumber() {
		return testDao.fetchTwilioNumber();
	}

}
