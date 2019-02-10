
// This is my first real working Java program
// Bhikar Sawakar Card Game v0.1

public class Main {


    public static void main(String[] args) {
        System.out.println(" ***** Bhikar - Sawakar! ***** ");

        /*
        PlayingCard myCard = new PlayingCard("\u2665" ,"Ace");
        PlayingCard yourCard = new PlayingCard("\u2660" ,"Ace");

        myCard.displayCard();
        yourCard.displayCard();

        myCard.setCard("\u2660","Three");

        myCard.displayCard();

        if(myCard.sameColor(yourCard))
        {
            System.out.println(" Both cards are " + myCard.getCardColor());
        }
*/

/*
        //Build new deck
        PlayingDeck completeDeck = new PlayingDeck();

        completeDeck.displayDeck();

        //Shuffle newly created Deck

        System.out.println("Shuffled deck...... ");

        completeDeck.shuffleDeck();

        completeDeck.displayDeck();

        //Create two players

        Player arnav = new Player();

        Player yashmit = new Player();

        System.out.println("Dealing cards.....");

       // int playerCardNumber = 0;
       // PlayingCard pc = new PlayingCard();

        ListIterator itrr = completeDeck.cards.listIterator();

        while(itrr.hasNext()){
            //System.out.println(itrr.next());

            arnav.playerDeck.cards.add( (PlayingCard) itrr.next());
            yashmit.playerDeck.cards.add( (PlayingCard) itrr.next());
        }


        System.out.println("Arnav has " + arnav.totalCards() + " cards!");

        arnav.playerDeck.displayDeck();

        System.out.println("Yashmit has " + yashmit.totalCards() + " cards!");

        yashmit.playerDeck.displayDeck();
*/

        /////////////// NEW ATTEMPT with PlayBjikarSawakar Class

        PlayBhikarSawakar newGame = new PlayBhikarSawakar();

        newGame.getNewDeck();
        newGame.createNewPlayers();
        newGame.dealCards();
        System.out.println(newGame.player1.playerName);
        newGame.player1.playerDeck.displayDeck();
        System.out.println(newGame.player2.playerName);
        newGame.player2.playerDeck.displayDeck();
        newGame.playGame();
        ////////////////////////////////

    }
}
