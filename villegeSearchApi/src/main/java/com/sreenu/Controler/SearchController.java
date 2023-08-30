package com.sreenu.Controler;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sreenu.Service.SerachService;

@Controller
public class SearchController {

	Logger log = LogManager.getLogger(SearchController.class);
	@Autowired
	SerachService serachService;

	@GetMapping("/searchApi")
	public void searchApi(@RequestParam(required = true) int id, @RequestParam(required = false) String name,
			@RequestParam(required = false) String country, @RequestParam(required = false) String state,
			@RequestParam(required = false) String district, @RequestParam(required = false) String mandal,
			@RequestParam(required = false) String villege) {
		log.debug("Before Call searchapi");
		serachService.searchApi(name,country,state,district,mandal,villege);
		log.debug("After Call searchApi");

	}
}
