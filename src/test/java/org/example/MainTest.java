package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    //Test for even
    @Test
    void is_EvenReturnTrue_WhenCalledWith2() {
        //Given --Declare value and expewcted result
        int number = 2;
        boolean expectedResult = true;
        //When - Call Method
        boolean actualResult = Main.isEven((number));
        //then - Assert
        assertEquals(actualResult,expectedResult);
    }
//Negativ scenario
    @Test
    void is_EvenReturnFalse_WhenCalledWith3() {
        //Given --Declare value and expewcted result
        int number = 3;
   //     boolean expectedResult = true;
        //When - Call Method
        boolean actualResult = Main.isEven((number)); // you can give value here to short the code size
        //then - Assert
        assertFalse(actualResult);
    }
    //test addition
    @Test
     void check_additionOfIntegers() {
        int a = 2;
        int b= 3;
        int expectedValue = 5;
        int actualValue = Main.add(a,b);
        assertEquals(expectedValue,actualValue);
    }

    //calculate product of two integers.
    @Test
    void check_MultiplicationOfIntegers() {
        int a = 2;
        int b=3;
        int expectedValue = 6;
        int actualResult = Main.multiply(a,b);
        assertEquals(expectedValue,actualResult);
    }
    //converts a given string to uppercase
    @Test
    void check_ConvertionOfgivenStringToUperCase() {
        String  text= "test it";
        String expectedText = "TEST IT";
        String actualText = Main.uppercase(text);
        assertEquals(expectedText,actualText);
    }
    //if given number is positiv
    @Test
    void check_NumberIsPositive_With2() {
        int number = 2;
        boolean actualResult = Main.checkPositive(number);
        assertTrue(actualResult);
    }
    //Negative Scenario: if given number is positiv
    @Test
    void check_NumberIsPositive_WithMinus2() {
        int number = -2;
        boolean actualREsult = Main.checkPositive(number);
        assertFalse(actualREsult);
    }
}