package com.avijit.busticketbooking;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.avijit.busticketbooking.bean.SearchBus;
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

	@Autowired
	private SearchController searchController;

	/**
	 * Simply selects the home view to render by returning its name.
	 *
	 * @param locale
	 * @param model
	 * @return string
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		List<Stop> listStop = searchController.getStops();
		model.addAttribute("listStop", listStop);
		return "home";
	}

	/**
	 * Gets the buses.
	 *
	 * @param local
	 * @param model
	 * @param searchBus
	 * @return buses
	 */
	@RequestMapping(value = "/buses", method = RequestMethod.GET)
	public String getBuses(Locale locale, Model model, @ModelAttribute("searchBus") SearchBus searchBus) {
		return "bus-selection-view";
	}

	/**
	 * Select seat.
	 *
	 * @param locale
	 * @param model
	 * @return string
	 */
	@RequestMapping(value = "/seats", method = RequestMethod.POST)
	public String selectSeat(Locale locale, Model model) {
		return "seat-selection-view";
	}
}
