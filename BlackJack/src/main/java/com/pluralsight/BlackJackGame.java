package com.pluralsight;

import java.util.ArrayList;

public class BlackJackGame {

    private Deck deck;
    private ArrayList<Player> players;
    private Player dealer;

    public BlackJackGame(){
        this.deck = new Deck();
        this.deck.shuffle();
        this.players = new ArrayList<Player>();
        this.dealer = new Player("Dealer");

    }

    public void addPlayer(String playerName){
        // expanded way
//        Player p = new Player(playerName);
//        players.add(p);

        // compacted way
        players.add(new Player(playerName));
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void dealCards(){

//        for(Player player: players){
//            player.getHand().Deal(deck.deal());
//            player.getHand().Deal(deck.deal());
//        }

        for(Player player: players){
            player.getHand().Deal(deck, 2);
        }
//        dealer.getHand().Deal(deck.deal());
//        dealer.getHand().Deal(deck.deal());
        dealer.getHand().Deal(deck, 2);
    }

    public Deck getDeck() {
        return deck;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public Player getDealer() {
        return dealer;
    }

    public Player[] getWinner(){
        // look through all the players, figure out the
        // one with the highest score that is NOT above 21, call them out.
        return null;

    }

}
