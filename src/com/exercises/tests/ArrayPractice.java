package com.exercises.tests;

import com.sun.xml.internal.ws.api.client.WSPortInfo;

public class ArrayPractice {

    public static void main(String[] args){
        /*String[] games = {"Link Between Worlds", "OOT", "Super Mario Bros"};

        //Enhanced for loop
        for(String Games : games) {
            System.out.print(Games + ", ");
        }

        //traditional for loop
        *//*System.out.println("\ntraditional for loop");
        for (int i = 0; i < games.length; i++) {
            System.out.println(games[i]);
        }*//*

        games[1] = "Ocarina of Time";
        System.out.println("");
        for(String Games : games) {
            System.out.print(Games + ", ");
        }

        *//*int[] num = {1,2,3,4,5};
        for(int Num : num) {
            System.out.print(Num + " -> ");
        }*/

        String[][] gamesTwo = {{"Link Between Worlds", "OOT", "Super Mario Bros"}, {"Monster Hunter", "Smash Bros", "Assassins Creed"}, {"test1", "test2"}};
        for(int i = 0; i < gamesTwo.length; i++){
            for(int j = 0; j < gamesTwo[i].length; j++){
                System.out.println(gamesTwo[i][j]);
            }
        }
    }
}
