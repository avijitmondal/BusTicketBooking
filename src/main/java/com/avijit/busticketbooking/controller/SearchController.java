/**
 * 
 */
package com.avijit.busticketbooking.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.avijit.busticketbooking.model.Stop;
import com.avijit.busticketbooking.service.IStopService;

/**
 * @author AVI
 *
 */
public class SearchController implements IController {

	private static final Logger logger = LoggerFactory.getLogger(SearchController.class);

	@Autowired
	private IStopService iStopService;

	public List<Stop> getStops() {
		List<Stop> listStop = iStopService.getAllStops();
		if (listStop != null) {
			logger.info("getStops", "Stops found");
			return listStop;
		}
		logger.info("getStops", "Stops not found");
		return listStop;
	}
}
