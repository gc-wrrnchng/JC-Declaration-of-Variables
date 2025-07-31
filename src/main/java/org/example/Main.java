package org.example;


public class Main {
    // Instance variables
    int instanceBinary = 0b0010_1101;
    int instanceOctal = 072;
    double instanceDouble = 123_4.95;

    // Static variables
    static int staticHex = 0x1A_2B;
    static byte staticByte = 1;
    static String staticString = "Progress, not perfection.";

    // Method containing local variables
    public void LocalVariables() {
        int localDecimal = 100;
        int localHex = 0xFF;
        int localBinary = 0b0000_1101;
        int localOctal = 014;
        long localLong = 10_000_000L;
        String localString = "Every step I take gets me closer to my goal.";

        System.out.println("\nLocal Variables: ");
        System.out.println(" LocalDecimal = " + localDecimal);
        System.out.println(" LocalHex = " + localHex);
        System.out.println(" LocalBinary = " + localBinary);
        System.out.println(" LocalOctal = " + localOctal);
        System.out.println(" LocalLong = " + localLong);
        System.out.println(" LocalString = " + localString);
    }

    public static void main(String[] args) {
        Main main = new Main();

        // Call LocalVariables method to print local variables
        main.LocalVariables();

        //Print instance variables
        System.out.println("\nInstance Variables: ");
        System.out.println(" InstanceBinary = " + main.instanceBinary);
        System.out.println(" InstanceOctal = " + main.instanceOctal);
        System.out.println(" InstanceDouble = " + main.instanceDouble);

        // Print static variables
        System.out.println("\nStatic Variables: ");
        System.out.println(" StaticHex = " + staticHex);
        System.out.println(" StaticByte = " + staticByte);
        System.out.println(" StaticString = " + staticString);

    }
}