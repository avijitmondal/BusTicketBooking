/**
 * 
 */
package com.avijit.busticketbooking.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.avijit.busticketbooking.model.Bus;

/**
 * Access Bus table data
 * 
 * @author avijit
 *
 */
public class BusDAO implements IBusDAO {
	private static final Logger logger = LoggerFactory.getLogger(BusDAO.class);
	private SessionFactory sessionFactory;

	/**
	 * @param sessionFactory
	 */
	public BusDAO(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.avijit.busreservation.dao.IBusDAO#addBus(com.avijit.busreservation.
	 * model.Bus)
	 */
	@Override
	public int addBus(Bus bus) {
		logger.info("addBus");
		Session session = sessionFactory.getCurrentSession();
		return (Integer) session.save(bus);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.avijit.busreservation.dao.IBusDAO#getBus(int)
	 */
	@Override
	public Bus getBus(int busID) {
		logger.info("getBus");
		Session session = sessionFactory.getCurrentSession();
		return (Bus) session.get(Bus.class, busID);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.avijit.busreservation.dao.IBusDAO#updateBus(com.avijit.busreservation
	 * .model.Bus)
	 */
	@Override
	public boolean updateBus(Bus bus) {
		logger.info("updateBus");
		Session session = sessionFactory.getCurrentSession();
		Bus tempBus = (Bus) session.get(Bus.class, bus.getId());
		if (tempBus == null)
			return false;

		tempBus.setBusNumber(bus.getBusNumber());
		tempBus.setCapacity(bus.getCapacity());
		session.update(tempBus);
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.avijit.busreservation.dao.IBusDAO#deleteBus(int)
	 */
	@Override
	public boolean deleteBus(int busID) {
		logger.info("deleteBus");
		Session session = sessionFactory.getCurrentSession();
		Bus bus = (Bus) session.get(Bus.class, busID);
		if (bus == null)
			return false;

		session.delete(bus);
		return true;
	}

}
