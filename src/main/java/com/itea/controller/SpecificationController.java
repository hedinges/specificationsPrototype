package com.itea.controller;

import com.itea.domain.Specification;
import com.itea.domain.SpecificationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static java.lang.Boolean.TRUE;

@Controller
@EnableAutoConfiguration
public class SpecificationController {


    @RequestMapping("/greeting")
    public Specification greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Specification(SpecificationType.TEXT, "country.iso3", TRUE,"ZERTYRE");
    }
}
