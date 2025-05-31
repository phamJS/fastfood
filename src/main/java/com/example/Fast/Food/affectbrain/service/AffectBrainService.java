package com.example.Fast.Food.affectbrain.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AffectBrainService {

    public Integer calculateSumOfTwoNumbers(Integer a, Integer b) {
        return a + b;
    }
}
