package com.avijit.busticketbooking;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.avijit.busticketbooking.bean.SearchBean;
import com.avijit.busticketbooking.controller.SearchController;
import com.avijit.busticketbooking.model.Stop;

/**
 * Handles requests for the application home page.
 * 
 * @author avijit
 * 
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private SearchController searchController;

	/**
	 * Simply selects the home view to render by returning its name.
	 *
	 * @param model
	 * @return ModelAndView
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(Model model) {
		logger.info("home");
		List<Stop> listStop = searchController.getStops();
		model.addAttribute("listStop", listStop);
		return new ModelAndView("home", "model", new SearchBean());
	}

	/**
	 * Gets the buses.
	 *
	 * @param searchBean
	 * @return buses
	 */
	@RequestMapping(value = "/buses", method = RequestMethod.POST)
	public String getBuses(@ModelAttribute("searchBean") SearchBean searchBean) {
		logger.info("getBuses");
		System.out.println(searchBean.getSource());
		System.out.println(searchBean.getDestination());
		System.out.println(searchBean.getDate());
		System.out.println(searchBean.getFromTime());
		System.out.println(searchBean.getToTime());
		return "bus-selection-view";
	}

	/**
	 * Select seat.
	 *
	 * @param model
	 * @return string
	 */
	@RequestMapping(value = "/seats", method = RequestMethod.POST)
	public String selectSeat(Model model) {
		logger.info("selectSeat");
		return "seat-selection-view";
	}
}
