import java.util.ListIterator;

public class PlayBhikarSawakar {

    Player player1 ;
    Player player2 ;

    PlayingDeck completeDeck;
    PlayingDeck playedDeck;

    public PlayBhikarSawakar(Player player1, Player player2, PlayingDeck completeDeck) {
        this.player1 = player1;
        this.player2 = player2;
        this.completeDeck = completeDeck;
    }

    public PlayBhikarSawakar(){


    }
    public void getNewDeck(){

        //Build new deck
        completeDeck = new PlayingDeck();
        completeDeck.displayDeck();

        //Shuffle newly created Deck
        System.out.println("Shuffled deck...... ");
        completeDeck.shuffleDeck();
        completeDeck.displayDeck();

    }

    public void createNewPlayers(){

        //Create two players
        player1 = new Player("Arnav");
        player2 = new Player("Yashmit");

    }

    public void dealCards()
    {
        ListIterator itrr = completeDeck.cards.listIterator();

        while(itrr.hasNext()){

            player1.playerDeck.cards.add( (PlayingCard) itrr.next());
            player2.playerDeck.cards.add( (PlayingCard) itrr.next());
        }
    }

    private void declareWinner(){

        if(player1.totalCards() > 1) {
            System.out.println("Woo hoo......" + player1.playerName + " is Winner!");
        }

        if(player2.totalCards() > 1) {
            System.out.println("Woo hoo......" + player2.playerName + " is Winner!");
        }

    }
    public void playGame(){

        //player1 goes first then player 2 so on and so forth

        playedDeck = new PlayingDeck();
        playedDeck.emptyDeck();

        ListIterator player1Iter = player1.playerDeck.cards.listIterator();
        ListIterator player2Iter = player2.playerDeck.cards.listIterator();

        int startPlayFlag = 1, playingTurnFlag = 0, totalTurns = 0;

        while(player1.totalCards() > 0 && player2.totalCards() > 0){

            // First player
            if(playingTurnFlag == 0 ) {

                if (startPlayFlag == 1) {

                    playedDeck.cards.add(player1.playCard());
                    startPlayFlag = 0;
                    playingTurnFlag = 1;
                }
                else {
                    playedDeck.cards.add(player1.playCard());
                    if ( playedDeck.cards.get(playedDeck.cards.size()-1).cardColor == playedDeck.cards.get(playedDeck.cards.size()-2).cardColor ) {
                        playedDeck.displayDeck();
                        System.out.println(player1.playerName + " got a match");
                        //Add playedDeck to PlayerDeck and clean playedDeck

                        for(ListIterator playedIter = playedDeck.cards.listIterator(); playedIter.hasNext();){
                                player1.playerDeck.cards.add((PlayingCard)playedIter.next());
                        }
                        playedDeck.emptyDeck();
                        startPlayFlag = 1;
                        playingTurnFlag = 0;
                    }
                    else {
                        playingTurnFlag = 1;
                    }
                }
                }

            if(playingTurnFlag == 1 ) {

                if (startPlayFlag == 1) {

                    playedDeck.cards.add(player2.playCard());
                    startPlayFlag = 0;
                    playingTurnFlag = 0;
                }
                else {
                    playedDeck.cards.add(player2.playCard());
                    if ( playedDeck.cards.get(playedDeck.cards.size()-1).cardColor == playedDeck.cards.get(playedDeck.cards.size()-2).cardColor ) {
                        playedDeck.displayDeck();
                        System.out.println(player2.playerName + " got a match");

                        //Add playedDeck to PlayerDeck and clean playedDeck

                        for(ListIterator playedIter = playedDeck.cards.listIterator(); playedIter.hasNext();){
                            player2.playerDeck.cards.add((PlayingCard)playedIter.next());
                        }
                        playedDeck.emptyDeck();
                        startPlayFlag = 1;
                        playingTurnFlag = 1;
                    }
                    else {
                        playingTurnFlag = 0;
                    }
                }
            }

                System.out.println("Played Pile after Iteration " + totalTurns);
                playedDeck.displayDeck();

                System.out.println(player1.playerName + " Deck after Iteration " + totalTurns);
                player1.playerDeck.displayDeck();

                System.out.println(player2.playerName + " Deck after Iteration " + totalTurns);
                player2.playerDeck.displayDeck();

                totalTurns++;
            }

        // Declare winner
        declareWinner();
        }
}
