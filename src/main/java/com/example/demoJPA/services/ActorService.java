/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demoJPA.services;

import com.example.demoJPA.entities.Actor;
import com.example.demoJPA.models.ActorRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author josemeva
 */
//@Component
@Service
public class ActorService {

    @Autowired
    private  ActorRepository actorRepository;
    
//    private final ActorRepository actorRepository;
//
//    public ActorService(ActorRepository actorRepository) {
//        this.actorRepository = actorRepository;
//    }

    public List<Actor> getActors() {
        return actorRepository.findAll();
//        return List.of(
//                new Actor(1, "Juan", "Ossa", LocalDate.of(2021, Month.JANUARY, 5)),
//                new Actor(2, "Gloria", "Ossa", LocalDate.now())
//        );
    }
    
    public Optional<Actor> getActor(Short id) {
        return actorRepository.findById(id);
//        return 
//                new Actor(1, "Juan", "Ossa", LocalDate.of(2021, Month.JANUARY, 5);
//           
//        
    }

    public void addActors(Actor a) {
        System.out.println(a);
        actorRepository.save(a);

    }

    public void deleteActors(Short id) {

        boolean exist = actorRepository.existsById(id);
        if (!exist) {
            throw new IllegalStateException("Actor id " + id + " No existe");
        } else {
            actorRepository.deleteById(id);
        }
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Transactional
    public void updateActor(Short id, String name) {

        Actor a = actorRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("Actor id " + id + " No existe"));

        a.setFirstName(name);
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
