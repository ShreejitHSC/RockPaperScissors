package com.kataskills;

import java.util.Arrays;

/**
 * Created by skakk2 on 9/17/2016.
 */
public class App {

    public static void main(String[] args) throws Exception {
        String[] validValues = {"rock","paper","scissors"};

        //Get input from user
        if(args.length == 1){
            if(Arrays.asList(validValues).contains(args[0].toLowerCase())){
                //Call the class for checking the input value against the computer generated value and to decide who won
            }else{
                System.out.println("The input should be rock/paper/scissors");
                throw new Exception();
            }
        }else{
            System.out.println("Atleast one parameter is required");
            throw new Exception();
        }
    }
}
