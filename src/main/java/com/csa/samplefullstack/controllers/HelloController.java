/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csa.samplefullstack.controllers;

import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Idan Paguio
 */
@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class HelloController {
    
    @RequestMapping("/hello")
    public String hello(){
        return "hi spring!";
    }
}
