/**
 * 
 */
package com.avijit.busticketbooking.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.avijit.busticketbooking.model.Bus;

/**
 * @author AVI
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

	/* (non-Javadoc)
	 * @see com.avijit.busreservation.dao.IBusDAO#addBus(com.avijit.busreservation.model.Bus)
	 */
	@Override
	public boolean addBus(Bus bus) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(bus);
		return true;
	}

	/* (non-Javadoc)
	 * @see com.avijit.busreservation.dao.IBusDAO#getBus(int)
	 */
	@Override
	public Bus getBus(int busID) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<Bus> listBus = (List<Bus>) sessionFactory.getCurrentSession()
				.createCriteria(Bus.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listBus.get(0);
	}

	/* (non-Javadoc)
	 * @see com.avijit.busreservation.dao.IBusDAO#updateBus(com.avijit.busreservation.model.Bus)
	 */
	@Override
	public boolean updateBus(Bus bus) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(bus);
		return true;
	}

	/* (non-Javadoc)
	 * @see com.avijit.busreservation.dao.IBusDAO#deleteBus(int)
	 */
	@Override
	public boolean deleteBus(int busID) {
		// TODO Auto-generated method stub
		return false;
	}

}
