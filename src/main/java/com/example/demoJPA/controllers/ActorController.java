/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demoJPA.controllers;

import com.example.demoJPA.entities.Actor;
import com.example.demoJPA.services.ActorService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author josemeva
 */
@RestController
@RequestMapping(path = "/api")
public class ActorController {

    @Autowired
    private ActorService actorService;

//    private final  ActorService actorService;
//
//    public ActorController(ActorService actorService) {
//        this.actorService = actorService;
//    }
    @GetMapping(path = "/actor")
    List<Actor> getActors() {

        return actorService.getActors();
    }

    @GetMapping(path = "/actor/{id}")
    Optional<Actor> getActor(@PathVariable("id") Short id) {

        return actorService.getActor(id);
    }

    @PostMapping(path = "/actor")
    void addActors(@RequestBody Actor actor) {

        actorService.addActors(actor);
    }

    @DeleteMapping(path = "/actor/{id}")
    void deleteActors(@PathVariable("id") Short id) {

        actorService.deleteActors(id);
    }

    @PutMapping(path = "/actor/{id}")
    void updateActor(@PathVariable("id") Short id,
            @RequestParam(required = false) String name
    ) {

        actorService.updateActor(id, name);
    }
}
