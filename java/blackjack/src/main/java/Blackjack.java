public class Blackjack {

    public int parseCard(String card) {
        int number = 0;
        switch (card) {
            case "ace": number = 11; break;
            case "two": number = 2; break;
            case "three": number = 3; break;
            case "four": number = 4; break;
            case "five": number = 5; break;
            case "six": number = 6; break;
            case "seven": number = 7; break;
            case "eight": number = 8; break;
            case "nine": number =9; break;
            case "ten":
            case "jack":
            case "queen":
            case "king":
                number = 10; break;
            default:
                number = 0;
                break;
        }
        return number;

    }

    public boolean isBlackjack(String card1, String card2) {
        throw new UnsupportedOperationException("Please implement the Blackjack.isBlackjack method");
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        throw new UnsupportedOperationException("Please implement the Blackjack.largeHand method");
    }

    public String smallHand(int handScore, int dealerScore) {
        throw new UnsupportedOperationException("Please implement the Blackjack.smallHand method");
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
