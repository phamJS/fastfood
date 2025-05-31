package com.example.Fast.Food.affectbrain.service;

import static org.junit.jupiter.api.Assertions.*;

class AffectBrainServiceTest {

    private AffectBrainService affectBrainService;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        affectBrainService = new AffectBrainService();
    }

    @org.junit.jupiter.api.Test
    void calculateSumOfTwoNumbers() {
        Integer a = 5;
        Integer b = 10;
        Integer expectedSum = 15;

        Integer actualSum = affectBrainService.calculateSumOfTwoNumbers(a, b);

        assertEquals(expectedSum, actualSum);
    }

}