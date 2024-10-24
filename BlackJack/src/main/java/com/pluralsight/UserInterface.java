package com.pluralsight;

import java.util.ArrayList;

public class UserInterface {
    private BlackJackGame game;

    public UserInterface() {
        game = new BlackJackGame();

        System.out.println("Welcome to BlackJack!");

        int numberOfPlayers = Console.PromptForInt("How many players (not including the dealer): ");

        addPlayersToGame(numberOfPlayers);

        game.dealCards();

        displayGame();

        //        System.out.println("Welcome to BlackJack!");
//        String player1Name = Console.PromptForString("Player 1, enter your name: ");
//
//        System.out.println("Dealing cards... 2 cards to each player!");
//
//
//        Deck deck = new Deck();
//        deck.shuffle();
//
//
//        System.out.println("The dealer hand is: ");
//        Hand dealerHand = new Hand();
//        // more compact way of doing the same thing as the player1Name lines of code
//        dealerHand.Deal(deck.deal());
//        dealerHand.Deal(deck.deal());
//        dealerHand.displayHand();
//
//        // player1Name cards
//        System.out.println(player1Name + "'s hand is: ");
//        Hand player1Hand = new Hand();
//        player1Hand.Deal(deck.deal());
//        player1Hand.Deal(deck.deal());
//        player1Hand.displayHand();
//
//        if(dealerHand.getValue() == player1Hand.getValue()){
//            System.out.println("It's a TIE!");
//        }
//        else if (dealerHand.getValue() > player1Hand.getValue()) {
//            System.out.println("Dealer wins!");
//        }
//        else{
//            System.out.println("Player wins!");
//        }
    }

    public void addPlayersToGame(int numberOfPlayers){
        for (int i = 1; i <= numberOfPlayers; i++){
            String playerName = Console.PromptForString("Please enter the name of player " + i + ": ");
            game.addPlayer(playerName);
        }
    }

    public void displayGame() {
        System.out.println(game.getDealer().toString());

        ArrayList<Player> players = game.getPlayers();
        for (Player player : players) {
            System.out.println(player);
        }
    }
}