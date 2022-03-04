package GuessBoiPack;

import java.util.Scanner;

public class GuessBoi {
    public static void main(String[] args) {
        //Declaring my assets
        int guess, i=0, min=1, max=5;
        int random = (int)(Math.random()*(max-min+1)+min);
        //Random variable is created and stays the same throughout the run

                                                                    //for (int i=0; i<5; i++);{} - Alternative Option

        do {//Starting the loop for user input for a limited 5X

            System.out.println("Zile la baiatu' un numar de la " + min + " la " + max + ":");
            Scanner s = new Scanner(System.in);
            guess = s.nextInt();


            if (i==0) {//Creating if clause cascade for first try success
                if (guess == random) {
                    System.out.println("Traitear Familia ca ai nimerit-o din prima, Baro$$an");
                }
                else {
                    System.out.println("Hopa, nici chiar Bo$$");
                }
            }

            else {//Creating if clause cascade for tries 2-5
                if (guess == random) {//2-5 try condition specification
                    System.out.println("Traitear Familia ca ai gicit, saormar sef");
                }
                else {System.out.println("Hopa, nici chiar Bo$$");}
            }
            i++;
        }
        //Ending conditions need to be met simultaneously
        while (i < 5 && !(random==guess));

        if (guess==random) {//End of run with success message
            System.out.println("Felicitari, acum hai mars acasa");
        }
        else {//End of run with fail message
            System.out.println("Nasol nu e nici unu sef...");
        }
    }
}
