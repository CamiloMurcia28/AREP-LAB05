/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.accessingdatajpa.controller;

import com.example.accessingdatajpa.model.Property;
import com.example.accessingdatajpa.services.PropertiesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author camilo.murcia-e
 */
@RestController
@RequestMaping("/properties")
public class RealStateController {
    
    @Autowired
    public PropertiesService ps;
    
    @GetMapping
    public ResponseEntity<List<Property>> getAllProperties(){
        List<Property> properties = ps.getAllProperties();
        return new ResponseEntity<>(properties, HttpStatus.OK);
    }    
}
