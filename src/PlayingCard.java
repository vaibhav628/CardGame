public class PlayingCard {
    String cardColor ;
    String cardFaceValue;

    public PlayingCard(String cardColor, String cardFaceValue) {

        this.cardColor = cardColor;
        this.cardFaceValue = cardFaceValue;
    }

    public PlayingCard() {

        this.cardColor = "";
        this.cardFaceValue = "";
    }

    public String getCardColor() {
        return cardColor;
    }

    public void setCardColor(String cardColor) {
        this.cardColor = cardColor;
    }

    public String getCardFaceValue() {
        return cardFaceValue;
    }

    public void setCardFaceValue(String cardFaceValue) {
        this.cardFaceValue = cardFaceValue;
    }

    void setCard(String cardColor, String cardFaceValue) {

            this.cardColor = cardColor;
            this.cardFaceValue = cardFaceValue;

        }

    public void displayCard() {

        System.out.println(cardFaceValue + " of " + cardColor);

    }

    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || obj.getClass() != this.getClass())
            return false;

        // type casting of the argument
        PlayingCard card = (PlayingCard) obj;

        // comparing the state of argument with
        // the state of 'this' Object.

        return (card.cardColor == this.cardColor && card.cardFaceValue == this.cardFaceValue);

    }

    public boolean sameColor(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || obj.getClass() != this.getClass())
            return false;

        // type casting of the argument
        PlayingCard card = (PlayingCard) obj;

        // comparing the state of argument with
        // the state of 'this' Object.

        return (card.cardColor == this.cardColor );

    }

}
