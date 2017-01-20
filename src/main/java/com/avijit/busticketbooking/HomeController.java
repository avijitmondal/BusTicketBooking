package com.avijit.busticketbooking;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.avijit.busticketbooking.dao.IBusDAO;
import com.avijit.busticketbooking.dao.IRouteDAO;
import com.avijit.busticketbooking.model.Bus;
import com.avijit.busticketbooking.model.Route;
import com.avijit.busticketbooking.model.SearchBus;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Autowired
	private IBusDAO iBusDao;
	@Autowired
	private IRouteDAO iRouteDAO;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	/**
	 * @param locale
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {		
		
//		List<Bus> listUsers = iBusDao.listBuses();
//		System.out.println(listUsers);
/*		Bus bus = new Bus();
		bus.setBusNumber("jgkjgfkg");
		bus.setCapacity(30);
		iBusDao.addBus(bus);*/
		
		//List<Route> list = iRouteDAO.findAllRoutes();
		//System.out.println(list);
		return "home";
	}

	@RequestMapping(value = "/buses", method = RequestMethod.GET)
	public String getBuses(Locale locale, Model model, @ModelAttribute("searchBus") SearchBus searchBus) {
		System.out.println(searchBus);
		return "bus-selection-view";
	}

	@RequestMapping(value = "/seats", method = RequestMethod.POST)
	public String selectSeat(Locale locale, Model model) {
		return "seat-selection-view";
	}
}
