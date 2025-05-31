package com.example.Fast.Food.affectbrain;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AffectBrainController {

    @GetMapping("/api/get/affect")
    public String index() {

        return "escape unhealthy diet cycle";
    }

}
