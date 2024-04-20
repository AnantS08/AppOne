package com.org.proj.apponeapi.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
public class AppOneControllerApi {

    @GetMapping(value = "/first-filter")
    public String getFirstFilter()
    {
        return "First Filter";
    }

}
