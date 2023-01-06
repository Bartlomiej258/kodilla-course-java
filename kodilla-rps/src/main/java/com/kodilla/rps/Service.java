package com.kodilla.rps;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Service {

    Scanner scanner = new Scanner(System.in);
    Shape scissors = new Scissors();
    Shape rock = new Rock();
    Shape paper = new Paper();
    private int numberOfRounds;
    private int playerWinner;
    private int computerWinner;
    private String newGame;
    private String endGame;
    private String endOrNewGame;

    public void info() {
        int numberOfRounds = 0;

        System.out.println("Welcome in game Rock Paper Scissors!");
        System.out.println("Enter your name: ");
        String playerName = scanner.nextLine();
        System.out.println("Welcome " + playerName);
        System.out.println("Enter how many rounds you want to play? from 1 to 10");
    }

    public int chooseNumberOfRounds() {

        String numbersRound = scanner.nextLine();
        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
        if (numbers.contains(numbersRound)) {
            System.out.println("You will play " + numbersRound + " rounds");
        } else
            info();
        return numberOfRounds = Integer.parseInt(numbersRound);
    }


    public Shape playerMoveName() {
        String playerMove = scanner.nextLine();

        switch (playerMove) {
            case "1":
                return rock;
            case "2":
                return paper;
            case "3":
                return scissors;
            case "n":
            case "N":
                startNewGame();
                break;
            case "x":
            case "X":
                exitFromTheGame();
                break;
            default:
                System.out.println("Wrong choice.");
        }
        return rock;
    }

    private void startNewGame() {
        System.out.println("Start new game? Y/N");
        newGame = scanner.nextLine();
        if (newGame.equals("y") || newGame.equals("Y")) {
            info();
            chooseNumberOfRounds();
            playGame();
        } else if (newGame.equals("n") || newGame.equals("N")) {
            System.out.println("Are you sure to leave a game? Y/N");
            newGame = scanner.nextLine();
            if (newGame.equals("Y") || newGame.equals("y")) {
                System.out.println("Goodbye!");
                System.exit(0);
            }
        }
    }

    private void exitFromTheGame() {
        System.out.println("Zakończyć grę? Y/N");
        endGame = scanner.nextLine();
        if (endGame.equals("y") || endGame.equals("Y")) {
            System.out.println("The game is over");
        } else if (endGame.equals("N") || endGame.equals("n")) {
            info();
            chooseNumberOfRounds();
            playGame();
        }
    }

    public void playGame() {

        int roundNumber = 0;

        while (roundNumber < numberOfRounds) {
            System.out.println("Round " + ++roundNumber);
            System.out.println("Pass 1 = rock");
            System.out.println("Pass 2 = paper");
            System.out.println("Pass 3 = scissors");
            chooseMove();
            System.out.println("The number of your wins: " + playerWinner + " The number of computer wins " + computerWinner);
        }
        if (playerWinner > computerWinner) {
            System.out.println("You are the Winner!");
        } else if (playerWinner == computerWinner) {
            System.out.println("The game ended in na draw");
        } else {
            System.out.println("Computer is the Winner!");
        }
        endOfNot();
    }

    private void chooseMove() {
        final Shape shape = playerMoveName();
        System.out.println(shape);
        final Shape computerShape = computerMove();
        System.out.println(computerShape);

        if (shape.equals(computerShape)) {
            System.out.println("The Round is a tied");
        } else if (shape.equals(rock) && computerShape.equals(scissors) || shape.equals(paper) && computerShape.equals(rock) ||
                shape.equals(scissors) && computerShape.equals(paper)) {
            System.out.println("You Won!");
            playerWinner++;
        } else if (computerShape.equals(rock) && shape.equals(scissors) || computerShape.equals(paper) && shape.equals(rock) ||
                computerShape.equals(scissors) && shape.equals(paper)) {
            System.out.println("Computer Won!");
            computerWinner++;
        } else if (!shape.getShape().equals("paper") || !shape.getShape().equals("scissors") || !shape.getShape().equals("rock")) {
            System.out.println("Wrong choice, minus 1 point");
            if (playerWinner > 0)
                playerWinner--;
        }
    }

    public Shape computerMove() {
        int computerMove = (int) (Math.random() * 3);
        if (computerMove == 1) {
            return rock;
        } else if (computerMove == 2) {
            return paper;
        } else
            return scissors;
    }

    public void endOfNot() {
        System.out.println("Enter X to strat game again or N to exit");
        endOrNewGame = scanner.nextLine();
        if (endOrNewGame.equals("x") || endOrNewGame.equals("X")) {
            startNewGame();
        } else if (endOrNewGame.equals("n") || endOrNewGame.equals("N")) {
            exitFromTheGame();
        } else {
            System.out.println("Wrong choice");
            System.exit(0);
        }
    }

}
