import java.util.Random;
import java.util.ArrayList;
import java.util.*;

public class PlayingDeck {

        /*
          System.out.println("\u2665 This should be a Hearts suit symbol.");
          System.out.println("\u2666 This should be a Diamonds suit symbol.");
          System.out.println("\u2663 This should be a Clubs suit symbol.");
          System.out.println("\u2660 This should be a Spades suit symbol.");
     */

    ArrayList<PlayingCard> cards = new ArrayList<>();

    PlayingDeck() {

        String[] cardColor = {"\u2665", "\u2666", "\u2663", "\u2660"};
        String[] cardFaceValue = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        System.out.println("Constructing Deck......");
        int cardNum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                PlayingCard c = new PlayingCard();
                c.setCard(cardColor[i], cardFaceValue[j]);
                cards.add(cardNum++,c);
            }
        }

    }

    PlayingDeck(int i){

    }

    public void displayDeck() {
       // System.out.println("Deck has " + cards.size() + " cards!");
        String deckString = new String();

        ListIterator itrr = cards.listIterator();
        PlayingCard pc;

        while(itrr.hasNext()){
            pc = (PlayingCard) itrr.next();
            deckString = deckString + pc.cardFaceValue + pc.cardColor + " ";
        }

        System.out.println( deckString);
    }

    public void shuffleDeck() {
        if (cards.size() == 0) {
            System.out.println("Deck is empty....");
        } else {
            for (int i = 0; i < 52; i++) {
                Random rand = new Random();
                int n = rand.nextInt(51);
                PlayingCard c ;
                c = cards.get(i);
                cards.remove(i);
                cards.add(i,cards.get(n));
                cards.remove(n);
                cards.add(n,c);
            }

        }

    }

    public PlayingCard dealCard(int i)
    {
        PlayingCard pc;
        pc = cards.get(i);

        cards.remove(i);
        return pc;
    }

    public void emptyDeck()
    {
        cards.clear();
    }
}

