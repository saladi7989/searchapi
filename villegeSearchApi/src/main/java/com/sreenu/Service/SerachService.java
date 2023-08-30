package com.sreenu.Service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sreenu.Controler.SearchController;
import com.sreenu.Repository.SearchRepository;


@Service
public class SerachService {

	Logger log = LogManager.getLogger(SerachService.class);
	@Autowired
	SearchRepository searchRepository;
	public void searchApi(String query,String name, String country, String state, String district,String mandal) {
		log.debug("Before Call SearchApi()");
		searchRepository.search(query);
		log.debug("After Call SearchApi()");
		
	}

	

}
