package com.kataskills;

/**
 * Created by skakk2 on 9/17/2016.
 */
public class RockPaperScissors {


    public String findWhoWins(String computerValueString, String userInputString) {
        GameOptions computerInput = GameOptions.valueOf(computerValueString);
        GameOptions userInput = GameOptions.valueOf(userInputString);

        int getResults = computerInput.compareGameOptions(userInput);
        System.out.println("Results : " + getResults);

        switch (getResults){
            case 0:
                return "Draw";
            case 1:
                return "Computer wins";
            case -1:
                return "User wins";
        }
        return null;
    }

    private enum GameOptions {
        rock, paper, scissors;

        public int compareGameOptions(GameOptions optionsAvailable){

            if(this == optionsAvailable)
                return 0;

            switch (this){
                case rock:
                    return (optionsAvailable == scissors ? 1 : -1);
                case paper:
                    return (optionsAvailable == rock ? 1 : -1);
                case scissors:
                    return (optionsAvailable == paper ? 1 : -1);
            }

            return 0;
        }
    }
}
