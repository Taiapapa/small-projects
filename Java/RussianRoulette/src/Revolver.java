import java.util.List;
import java.util.Arrays;
import java.util.Random;
import java.util.Collections;

public class Revolver {

    private Integer[] CYLINDER = { 0, 0, 0, 0, 0, 0 }; // Represents the cylinder of a revolver, containing six chambers.

    /**
     * Fire the revolver.
     * @return
     */
    boolean fire() {

        if (CYLINDER[0] == 1) {
            System.out.println("BANG!\n");

            return true;
        } else {
            List<Integer> intList = Arrays.asList(CYLINDER);
            Collections.rotate(intList, -1);
            intList.toArray(CYLINDER);

            System.out.println("Click!\n");
        }

        return false;
    }

    /**
     * Spin the cylinder to change cartridge position.
     */
    void spin() {
        List<Integer> intList = Arrays.asList(CYLINDER);
        int rotations = new Random().nextInt(6 - 1 + 1) + 1;
        Collections.rotate(intList, rotations);
        intList.toArray(CYLINDER);

        System.out.println("Tktktktktktktktk!\n");
    }

    /**
     * Peak at the chambers contents.
     */
    void peak() {
        String cylinder1 = (" /0 0\\");
        String cylinder2 = ("|0 o 0|");
        String cylinder3 = (" \\0_0/");

        for (int i = 0; i < CYLINDER.length - 1; i++) {
            if (CYLINDER[0] == 1) {
                cylinder1 = (" /1 0\\");
            } else if (CYLINDER[1] == 1) {
                cylinder1 = (" /0 1\\");
            } else if (CYLINDER[2] == 1) {
                cylinder2 = ("|0 o 1|");
            } else if (CYLINDER[3] == 1) {
                cylinder3 = (" \\0_1/");
            } else if (CYLINDER[4] == 1) {
                cylinder3 = (" \\1_0/");
            } else if (CYLINDER[5] == 1) {
                cylinder2 = ("|1 o 0|");
            } else {
            }
        }

        System.out.println(cylinder1);
        System.out.println(cylinder2);
        System.out.println(cylinder3);
    }

    /**
     * Chambers a single cartridge.
     */
    void chamber() {
        for (int i = 0; i < CYLINDER.length - 1; i++) {
            if (CYLINDER[i] == 0) {
                CYLINDER[i] = 1;
                System.out.println("Ker-chunk!\n");
                return;
            }
        }
    }
}
