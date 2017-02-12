/**
 * 
 */
package com.avijit.busticketbooking.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.avijit.busticketbooking.dao.IFareDAO;
import com.avijit.busticketbooking.model.Fare;

/**
 * @author AVI
 *
 */
public class FareService implements IFareService {

	private static final Logger logger = LoggerFactory.getLogger(FareService.class);

	@Autowired
	private IFareDAO iFareDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.avijit.busticketbooking.service.IFareService#addFare(com.avijit.
	 * busticketbooking.model.Fare)
	 */
	@Override
	public int addFare(Fare fare) {
		int result = iFareDAO.addFare(fare);
		if(result > 0)
			logger.info("addFare", "Fare " + fare.getId() + " successfuly added");
		else
			logger.error("addFare", "Error adding " + fare.getId());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.avijit.busticketbooking.service.IFareService#getFare(int)
	 */
	@Override
	public Fare getFare(int fareID) {
		Fare tempFare = iFareDAO.getFare(fareID);
		if(tempFare != null)
			logger.info("getFare", "Fare " + fareID + " details successfuly retrived");
		else
			logger.error("getFare", "Error retriving " + fareID);
		return tempFare;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.avijit.busticketbooking.service.IFareService#updateFare(com.avijit.
	 * busticketbooking.model.Fare)
	 */
	@Override
	public boolean updateFare(Fare fare) {
		boolean result = iFareDAO.updateFare(fare);
		if (result)
			logger.info("updateFare", "Fare " + fare.getId() + " successfuly updated");
		else
			logger.error("updateFare", "Error updating " + fare.getId());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.avijit.busticketbooking.service.IFareService#deleteFare(int)
	 */
	@Override
	public boolean deleteFare(int fareID) {
		logger.info("deleteFare");
		boolean result = iFareDAO.deleteFare(fareID);
		if (result)
			logger.info("deleteFare", "Fare " + fareID + " deleted successfuly");
		else
			logger.error("deleteFare", "Error deleting " + fareID);
		return result;
	}

}
