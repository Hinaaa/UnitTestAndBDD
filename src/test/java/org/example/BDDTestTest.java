package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BDDTestTest {

    @Test
    void Fizz_shouldReturnTrue_WhenNumberIs6() {
        String expected = "Fizz";
        String actual = BDDTest.fizzBizz(6);
        assertEquals(expected,actual);
    }
    @Test
    void Buzz_shouldReturnTrue_WhenNumberIs10() {
        String expected = "Buzz";
        String actual = BDDTest.fizzBizz(10);
        assertEquals(expected,actual);
    }
    @Test
    void FizzBuzz_shouldReturnTrue_WhenNumberIs15() {
        String expected = "FizzBuzz";
        String actual = BDDTest.fizzBizz(15);
        assertEquals(expected,actual);
    }
    @Test
    void FizzBuzz_shouldReturn1_WhenNumberIs1() {
        int number = 1;
        String expected ="1";
        String actual = BDDTest.fizzBizz(1);
        assertEquals(expected,actual);
    }
}