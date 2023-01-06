package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {


        Service service = new Service();
        service.info();
        service.chooseNumberOfRounds();
        service.playGame();


    }
}
