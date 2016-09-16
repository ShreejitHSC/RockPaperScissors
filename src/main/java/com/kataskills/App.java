package com.kataskills;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by skakk2 on 9/17/2016.
 */
public class App {

    public static void main(String[] args) throws Exception {
        String[] validValues = {"rock","paper","scissors"};

        //Get input from user
        if(args.length == 1){
            if(Arrays.asList(validValues).contains(args[0].toLowerCase())){
                Random genRandomNumber = new Random();
                int computerValue = genRandomNumber.nextInt(3) + 1;
                String computerValueString = generateComputerInput(computerValue);
                System.out.println("The computer generated a number : " + computerValueString);
                System.out.println("The input you provided was : " + args[0]);

                //Class which would determine who won
                RockPaperScissors rockPaperScissors = new RockPaperScissors();
                String message = rockPaperScissors.findWhoWins(computerValueString,args[0].toLowerCase());

            }else{
                System.out.println("The input should be rock/paper/scissors");
                throw new Exception();
            }
        }else{
            System.out.println("Atleast one parameter is required");
            throw new Exception();
        }
    }

    public static String generateComputerInput(int computerValue) {
        //Generate a Random number between 1-3
        String computerValueString = "";

        switch (computerValue){
            case 1:
                computerValueString = "rock";
                break;
            case 2:
                computerValueString = "paper";
                break;
            case 3:
                computerValueString = "scissors";
                break;
        }
        return computerValueString;
    }
}
