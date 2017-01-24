/**
 * 
 */
package com.avijit.busticketbooking.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.avijit.busticketbooking.model.Bus;

/**
 * @author avijit
 *
 */
public class BusDAO implements IBusDAO {
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
		Session session = sessionFactory.getCurrentSession();
		Bus bus = (Bus) session.get(Bus.class, busID);
		if (bus == null)
			return false;

		session.delete(bus);
		return true;
	}

}
