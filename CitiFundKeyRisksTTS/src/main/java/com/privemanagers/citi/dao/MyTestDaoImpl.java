/**
 * 
 */
package com.privemanagers.citi.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.privemanagers.citi.dto.CitiFundListTTS;

/**
 * @author Mangesh K
 *
 */
@Repository
public class MyTestDaoImpl implements IMyTestDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<String> getDaoData() {

		List<String> lists = new ArrayList<String>();
		lists.add("Mangesh");
		lists.add("Kondvilkar");

		return lists;
	}

	@Override
	public void saveTTS() {
		Random random = new Random();
		int key = random.nextInt(999999);
		int pin = random.nextInt(999);
		String sql = "insert into dev1.CITIFUNDLIST_TTS values (" + key + ",'CITI FUND 2', '2222'," + pin
				+ ", 'CAN', 'http://fund2tts.php',SYSDATE(),SYSDATE())";

		jdbcTemplate.update(sql);
	}

	@Override
	public List<CitiFundListTTS> fetchTTSData() {
		
		List<CitiFundListTTS> citiFundListTtsList = new ArrayList<CitiFundListTTS>();
		
		String sql = "SELECT * FROM dev1.CITIFUNDLIST_TTS";
		
		citiFundListTtsList = jdbcTemplate.query(sql, new ResultSetExtractor<List<CitiFundListTTS> >() {

			@Override
			public List<CitiFundListTTS> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<CitiFundListTTS> list = new ArrayList<CitiFundListTTS>();;
				
				 while (rs.next())
	                {
					 CitiFundListTTS citiFundTts = new CitiFundListTTS();
					 
					 citiFundTts.setIsin(rs.getString(1));
					 citiFundTts.setFundName(rs.getString(2));
					 citiFundTts.setFundCode(rs.getString(3));
					 citiFundTts.setSessionPin(rs.getInt(4));
					 citiFundTts.setLanguage(rs.getString(5));
					 citiFundTts.setTtsFileLocation(rs.getString(6));
					 citiFundTts.setCreatedDate(rs.getDate(7));
					 citiFundTts.setLastUpdateDate(rs.getDate(8));
					 
					 list.add(citiFundTts);
	                }
	             return list;
			}
		});
		
		return citiFundListTtsList;
	}

	@Override
	public String fetchTwilioNumber() {
		return "+852 3939 5656";
	}

}
