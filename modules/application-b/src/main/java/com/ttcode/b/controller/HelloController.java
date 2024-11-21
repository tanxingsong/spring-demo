package com.ttcode.b.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright 2022-2099 the original author or authors.
 * Changan Learning Platform Source Code Confidentiality Agreement.
 * Subject to Licensee's strict compliance with the terms and conditions of this Agreement,
 * Plucom Technology hereby grants to Licensee (i) a non-exclusive, non-transferable, limited
 * license under Plucom Technology copyrights in the Source Code to internally reproduce the
 * Source Code and create derivative works based upon the Source Code for the sole purposes
 * of providing maintenance support or developing new functionalities, features, procedures,
 * routines, or customizations that are not available in the Compiled Application ("Enhancements"),
 * (ii) a non-exclusive, non-transferable, limited license to use the Enhancement for internal
 * purposes in connection with Licensee use of the Plucom Technology Software ("Software"),
 * and (iii) a non-exclusive, non-transferable, limited license to sublicense the use of
 * the Enhancement to Licensee clients who are also properly licensed to use the Plucom Technology
 * Software ("Permitted Clients").
 *
 * @author tanxingsong
 */
@RestController
public class HelloController {
    Logger log = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("hello")
    public String hello(String params) {
        log.info("Hello this is application b, params: {}", params);
        return "it's b , and you?";
    }
}
