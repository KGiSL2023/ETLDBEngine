package com.kgisl.dbEngine.service;

import java.util.List;
import java.util.Map;

public interface DBEngineService {

	Map<String, List<String>> getSourceForUI() throws Exception;

	Map<String, List<String>> getDestinationForUI() throws Exception;

}
