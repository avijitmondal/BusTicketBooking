/**
 * 
 */
package com.avijit.busticketbooking.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.avijit.busticketbooking.dao.IStopDAO;
import com.avijit.busticketbooking.model.Stop;

/**
 * @author AVI
 *
 */
public class StopService implements IStopService {

	private static final Logger logger = LoggerFactory.getLogger(StopService.class);

	@Autowired
	private IStopDAO iStopDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.avijit.busticketbooking.service.IStopService#addStop(com.avijit.
	 * busticketbooking.model.Stop)
	 */
	@Override
	public int addStop(Stop stop) {
		int result = iStopDAO.addStop(stop);
		if (result > 0)
			logger.info("addStop", "Stop " + stop.getId() + " successfuly added");
		else
			logger.error("addStop", "Error adding " + stop.getId());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.avijit.busticketbooking.service.IStopService#getStop(int)
	 */
	@Override
	public Stop getStop(int stopID) {
		Stop tempStop = iStopDAO.getStop(stopID);
		if (tempStop != null)
			logger.info("getStop", "Stop " + stopID + " details successfuly retrived");
		else
			logger.error("getStop", "Error retriving " + stopID);
		return tempStop;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.avijit.busticketbooking.service.IStopService#updateStop(com.avijit.
	 * busticketbooking.model.Stop)
	 */
	@Override
	public boolean updateStop(Stop stop) {
		boolean result = iStopDAO.updateStop(stop);
		if (result)
			logger.info("updateStop", "Stop " + stop.getId() + " successfuly updated");
		else
			logger.error("updateStop", "Error updating " + stop.getId());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.avijit.busticketbooking.service.IStopService#deleteStop(int)
	 */
	@Override
	public boolean deleteStop(int stopID) {
		boolean result = iStopDAO.deleteStop(stopID);
		if (result)
			logger.info("deleteStop", "Stop " + stopID + " deleted successfuly");
		else
			logger.error("deleteStop", "Error deleting " + stopID);
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.avijit.busticketbooking.service.IStopService#getAllStops()
	 */
	@Override
	public List<Stop> getAllStops() {
		List<Stop> listStop = iStopDAO.getAllStops();
		if (listStop != null)
			logger.info("getAllStops", "All Stop details successfuly retrived");
		else
			logger.error("getAllStops", "Error retriving stop");
		return listStop;
	}

}
