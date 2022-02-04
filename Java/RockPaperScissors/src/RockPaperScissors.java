import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        try {
            Type player = null;

            Random random = new Random();
            int i = random.nextInt(3 - 1 + 1) + 1;
            Type computer = Type.computerType(i);

            Scanner sc = new Scanner(System.in);

            while (player == null) {
                System.out.println("Choose your hand: ROCK, PAPER, or SCISSORS!");
                player = Type.parseType(sc.next().toUpperCase());

                if (player == null) {
                    System.out.println("Invalid hand, try again!");
                }
            }

            if (player.equals(computer)) {
                System.out.println("Tie!");
            } else if (player.beats(computer)) {
                System.out.println(player + " beats " + computer + ", You Win!");
            } else {
                System.out.println(computer + " beats " + player + ", You lose!");
            }

            sc.close();
        } catch (Error e) {
            System.out.println("Error!" + e);
        }
    }

    public enum Type {
        ROCK, PAPER, SCISSORS;

        public static Type parseType(String value) {
            if (value.equals("ROCK")) {
                return ROCK;
            } else if (value.equals("PAPER")) {
                return PAPER;
            } else if (value.equals("SCISSORS")) {
                return SCISSORS;
            } else {
                return null;
            }
        }

        public boolean beats(Type other) {
            switch (this) {
                case SCISSORS:
                    return other == PAPER;

                case ROCK:
                    return other == SCISSORS;

                case PAPER:
                    return other == ROCK;
            }

            return false;
        }

        public static Type computerType(int i) {
            Type computerHand = null;

            if (i == 1) {
                computerHand = ROCK;
            } else if (i == 2) {
                computerHand = PAPER;
            } else if (i == 3) {
                computerHand = SCISSORS;
            }

            return computerHand;
        }
    }
}
