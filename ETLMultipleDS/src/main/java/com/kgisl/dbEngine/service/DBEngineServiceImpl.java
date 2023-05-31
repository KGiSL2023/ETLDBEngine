package com.kgisl.dbEngine.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kgisl.dbEngine.dest.dao.DBEngineDestRepoImpl;
import com.kgisl.dbEngine.src.dao.DBEngineSourceRepoImpl;

@Service
public class DBEngineServiceImpl implements DBEngineService {

	@Autowired
	DBEngineSourceRepoImpl sourceDao;
	
	@Autowired
	DBEngineDestRepoImpl destDao;
	
	@Override
	public Map<String, List<String>> getSourceForUI() throws Exception {
		return sourceDao.getTables();
	}

	@Override
	public Map<String, List<String>> getDestinationForUI() throws Exception {
		return destDao.getTables();
	}

}
