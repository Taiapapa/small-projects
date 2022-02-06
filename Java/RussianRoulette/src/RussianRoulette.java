import java.util.Scanner;

/**
 * A simple game of Russian Roulette.
 * <p>
 * You hold a six-shooter revolver with three options,
 * fire, spin, and peak.
 * <p>
 * Fire pulls the trigger, Spin rotates the cylinder, and
 * Peak displays the currently occupied chamber.
 * <p>
 * The game ends when you die.
 */
public class RussianRoulette {

    private boolean RUNNING = false; // Game state.
    private int peaks = 1;
    private int spins = 1;

    /**
     * Simulates a round of Russian Roulette.
     */
    public RussianRoulette() {
        Revolver revolver = new Revolver();
        Scanner sc = new Scanner(System.in);

        revolver.chamber();
        revolver.spin();

        System.out.println("Trembling hands chamber the round and spin the cylinder softly.");
        System.out.println("Slowly, you raise the gun to your head.");
        System.out.println("Today you will meet an unfortunate end.\n");

        System.out.println("|  FIRE  |  SPIN  |  PEAK  |\n");

        RUNNING = true;
        while (RUNNING) {
            String userInput = sc.nextLine();

            if (userInput.equalsIgnoreCase("fire")) {
                if (RUNNING) {
                    hasWon(revolver.fire());
                } else {
                }
            } else if (userInput.equalsIgnoreCase("spin")) {
                if (RUNNING && spins != 0) {
                    revolver.spin();
                    spins -= 1;
                } else {
                    System.out.println("Pull the trigger...\n");
                }
            } else if (userInput.equalsIgnoreCase("peak")) {
                if (RUNNING && peaks != 0) {
                    revolver.peak();
                    peaks -= 1;
                } else {
                    System.out.println("Pull the trigger...\n");
                }
            }
        }

        sc.close();
    }

    private boolean hasWon(boolean dead) {
        if (dead) {
            System.out.println("YOU HAVE DIED!");
            RUNNING = false;
        }

        return dead;
    }

    public static void main(String[] args) {
        RussianRoulette rr = new RussianRoulette();
    }
}