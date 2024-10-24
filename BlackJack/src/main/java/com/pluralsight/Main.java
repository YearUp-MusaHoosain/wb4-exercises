package com.pluralsight;

public class Main {
    public static void main(String[] args) throws Exception {

        Deck deck = new Deck();
        deck.shuffle();

        System.out.println("Welcome to BlackJack!");
        String player1Name = Console.PromptForString("Player 1, enter your name: ");

        System.out.println("Dealing cards... 2 cards to each player!");

        System.out.println("The dealer hand is: ");
        Card dealerCard1 = deck.deal();
        Card dealerCard2 = deck.deal();

        Hand dealerHand = new Hand();
        dealerHand.Deal(dealerCard1);
        dealerHand.Deal(dealerCard2);
        dealerHand.displayHand();

        System.out.println(player1Name + "'s hand is: ");
        Card playerCard1 = deck.deal();
        Card playerCard2 = deck.deal();
        Hand player1Hand = new Hand();
        player1Hand.Deal(playerCard1);
        player1Hand.Deal(playerCard2);
        player1Hand.displayHand();

        if(dealerHand.getValue() == player1Hand.getValue()){
            System.out.println("It's a TIE!");
        }
        else if (dealerHand.getValue() > player1Hand.getValue()) {
            System.out.println("Dealer wins!");
        }
        else{
            System.out.println("Player wins!");
        }

        playerCard1.flip();
        playerCard1.displayCard();

        playerCard2.flip();
        playerCard2.displayCard();




    }
}