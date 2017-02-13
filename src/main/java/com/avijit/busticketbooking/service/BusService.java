/**
 * 
 */
package com.avijit.busticketbooking.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.avijit.busticketbooking.dao.IBusDAO;
import com.avijit.busticketbooking.model.Bus;

/**
 * @author AVI
 *
 */
public class BusService implements IBusService {

	private static final Logger logger = LoggerFactory.getLogger(BusService.class);

	@Autowired
	private IBusDAO iBusDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.avijit.busticketbooking.service.IBusService#addBus(com.avijit.
	 * busticketbooking.model.Bus)
	 */
	@Override
	public int addBus(Bus bus) {
		int result = iBusDAO.addBus(bus);
		if (result > 0)
			logger.info("addBus", "Bus " + bus.getId() + " successfuly added");
		else
			logger.error("addBus", "Error adding " + bus.getId());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.avijit.busticketbooking.service.IBusService#getBus(int)
	 */
	@Override
	public Bus getBus(int busID) {
		Bus tempBus = iBusDAO.getBus(busID);
		if (tempBus != null)
			logger.info("getBus", "Bus " + busID + " details successfuly retrived");
		else
			logger.error("getBus", "Error retriving " + busID);
		return tempBus;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.avijit.busticketbooking.service.IBusService#updateBus(com.avijit.
	 * busticketbooking.model.Bus)
	 */
	@Override
	public boolean updateBus(Bus bus) {
		boolean result = iBusDAO.updateBus(bus);
		if (result)
			logger.info("updateBus", "Bus " + bus.getId() + " successfuly updated");
		else
			logger.error("updateBus", "Error updating " + bus.getId());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.avijit.busticketbooking.service.IBusService#deleteBus(int)
	 */
	@Override
	public boolean deleteBus(int busID) {
		boolean result = iBusDAO.deleteBus(busID);
		if (result)
			logger.info("deleteBus", "Bus " + busID + " deleted successfuly");
		else
			logger.error("deleteBus", "Error deleting " + busID);
		return result;
	}

}
