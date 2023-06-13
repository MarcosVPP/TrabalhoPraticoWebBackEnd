package com.api.gamingcontrol.controllers;

import com.api.gamingcontrol.models.Raca;
import com.api.gamingcontrol.services.RacaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class SpringBdController {
    @Autowired
    private RacaService racaService;

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public ModelAndView insert() {
        return new ModelAndView("insert", "raca", new Raca());
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String submitInsert(@Valid @ModelAttribute("raca")Raca raca, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        racaService.insertRaca(raca);
        return "redirect:";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public ModelAndView delete(Integer id) {
        return new ModelAndView("delete", "raca", racaService.getRacaById(id).get());
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String submitDelete(@Valid @ModelAttribute("raca")Raca raca, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        racaService.deleteRacaById(raca.getId());
        return "redirect:";
    }

    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public ModelAndView update(Integer id) {
        return new ModelAndView("update", "raca", racaService.getRacaById(id).get());
    }


    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String submitUpdate(@Valid @ModelAttribute("raca")Raca raca, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        racaService.updateRaca(raca);
        return "redirect:";
    }

    @RequestMapping(value = "/read", method = RequestMethod.GET)
    public ModelAndView read() {
        ModelAndView mav = new ModelAndView("read");
        mav.addObject("racas", racaService.getAllRacas());
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("racas", racaService.getAllRacas());
        return mav;
    }
}