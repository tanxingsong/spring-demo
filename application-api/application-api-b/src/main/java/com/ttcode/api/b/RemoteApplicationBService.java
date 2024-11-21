package com.ttcode.api.b;

import com.ttcode.api.b.factory.RemoteApplicationBFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
@FeignClient(contextId = "RemoteApplicationBService", value = "application-b",url = "http://localhost:8081", fallbackFactory = RemoteApplicationBFactory.class)
public interface RemoteApplicationBService {
    @GetMapping("hello")
    String hello(@RequestParam("params") String params);
}
