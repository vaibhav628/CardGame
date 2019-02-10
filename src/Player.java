public class Player {

    public PlayingDeck playerDeck;
    String playerName;

    public Player( String playerName) {

        playerDeck = new PlayingDeck(0);
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int totalCards()
    {

        return playerDeck.cards.size();
    }

    public PlayingCard playCard(){

        PlayingCard pc;
        pc = playerDeck.cards.get(0);
        playerDeck.cards.remove(0);
        playerDeck.cards.trimToSize();
        return (pc);

    }

}
