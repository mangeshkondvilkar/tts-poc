/**
 * 
 */
package com.privemanagers.citi.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.privemanagers.citi.dto.CitiFundListTTS;

/**
 * @author Mangesh K
 *
 */
@Repository
public interface IMyTestDao {

	public List<String> getDaoData();

	public void saveTTS();

	public List<CitiFundListTTS> fetchTTSData();

	public String fetchTwilioNumber();
}
