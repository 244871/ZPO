package com.company;

public class Main {

    public static void main(String[] args) {
        wzorSumaryczny("CHCHCHCHCHCH", "benzen");
    }

    private static void wzorSumaryczny(String wzor, String zwiazek){
        int letterCounter[] = new int[34];

        wzor = wzor.toUpperCase();
        for (char letter : wzor.toCharArray()) {
            // A - 65; Z - 90 - kod ASCII, przez który przeliczane
            int letterAsciiNumber = (int) letter;
            letterCounter[letterAsciiNumber - 65] += 1;
        }

        System.out.print("Wzor sumaryczny - " + zwiazek + ": ");
        for(int i =0; i<letterCounter.length; i++){
            if(letterCounter[i] > 0){
                char letter = (char) (i + 65);
                System.out.print( letter );
                System.out.print(letterCounter[i]);
            }
        }
        System.out.println();
    }
}
