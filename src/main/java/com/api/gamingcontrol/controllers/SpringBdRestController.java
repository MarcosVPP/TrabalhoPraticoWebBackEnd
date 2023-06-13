package com.api.gamingcontrol.controllers;

import com.api.gamingcontrol.models.Raca;
import com.api.gamingcontrol.services.RacaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SpringBdRestController {
    @Autowired
    private RacaService racaService;
    @RequestMapping(value = "/rest/getAll", method = RequestMethod.GET)
    public List<Raca> getRacas() {
        return racaService.getAllRacas();
    }
    @RequestMapping(value = "/rest/get/{id}", method = RequestMethod.GET)
    public Optional<Raca> getRaca(@PathVariable("id") Integer id) {
        return racaService.getRacaById(id);
    }
    @RequestMapping(value = "/rest/deleteAll", method = RequestMethod.DELETE)
    public void deleteRacas() {
        racaService.deleteAllRacas();
    }
    @RequestMapping(value = "/rest/delete/raca{id}", method = RequestMethod.DELETE)
    public void deleteRaca(@PathVariable("id") Integer id) {
        racaService.deleteRacaById(id);
    }
    @RequestMapping(value = "/rest/update/{id}", method = RequestMethod.POST)
    public void updateRaca(@RequestBody Raca raca, @PathVariable("id") Integer id) {
        racaService.updateRacaById(id, raca);
    }
    @RequestMapping(value = "/rest/insert", method = RequestMethod.POST)
    public void Raca(@RequestBody Raca raca) {
        racaService.insertRaca(raca);
    }
}

