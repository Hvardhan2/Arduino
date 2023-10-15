import java.util.Random;

public class RandomCardPicker {
    public static void main(String[] args) {
        // Define arrays for suits and card values
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] cardValues = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        // Create a random number generator
        Random random = new Random();

        // Randomly select a suit and a card value
        int randomSuitIndex = random.nextInt(suits.length);
        int randomCardValueIndex = random.nextInt(cardValues.length);

        // Get the randomly selected card
        String randomSuit = suits[randomSuitIndex];
        String randomCardValue = cardValues[randomCardValueIndex];

        // Print the randomly picked card
        System.out.println("Randomly picked card: " + randomCardValue + " of " + randomSuit);
    }
}
