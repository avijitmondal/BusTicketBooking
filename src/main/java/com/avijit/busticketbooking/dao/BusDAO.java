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
	public void addBus(Bus bus) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(bus);
	}

	/* (non-Javadoc)
	 * @see com.avijit.busreservation.dao.IBusDAO#listBuses()
	 */
	@Override
	public List<Bus> listBuses() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<Bus> listBus = (List<Bus>) sessionFactory.getCurrentSession()
				.createCriteria(Bus.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listBus;
	}

	/* (non-Javadoc)
	 * @see com.avijit.busreservation.dao.IBusDAO#updateBus(com.avijit.busreservation.model.Bus)
	 */
	@Override
	public void updateBus(Bus bus) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(bus);
	}

	/* (non-Javadoc)
	 * @see com.avijit.busreservation.dao.IBusDAO#deleteBus(int)
	 */
	@Override
	public void deleteBus(int id) {
		// TODO Auto-generated method stub

	}

}
