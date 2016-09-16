package com.kataskills;

import org.junit.Test;

/**
 * Created by skakk2 on 9/17/2016.
 */
public class AppTest {

    @Test(expected = Exception.class)
    public void testInputValue() throws Exception {
        String[] argList = new String[]{};
        App.main(argList);
    }

    @Test(expected = Exception.class)
    public void testAcceptValidInputValue() throws Exception {
        String[] argList = new String[]{"any"};
        App.main(argList);
    }

    @Test
    public void testRandomNumber3IsCorrectlyConverted(){
        int myRandomNumber = 3;
        assert(App.generateComputerInput(myRandomNumber).equalsIgnoreCase("scissors"));
    }

    @Test
    public void testRandomNumber2IsCorrectlyConverted(){
        int myRandomNumber = 2;
        assert(App.generateComputerInput(myRandomNumber).equalsIgnoreCase("paper"));
    }

    @Test
    public void testRandomNumber1IsCorrectlyConverted(){
        int myRandomNumber = 1;
        assert(App.generateComputerInput(myRandomNumber).equalsIgnoreCase("rock"));
    }
}