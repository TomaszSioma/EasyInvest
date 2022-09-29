package EnteredData;

import java.util.BitSet;
import java.util.Scanner;

public class ChoiceInstruction {
    int numberChoice = -1;
    int secondNumberChoice;
    IntroducingBudget addIntroducingBudget = new IntroducingBudget();

    Scanner scaner = new Scanner(System.in);

    public void ChoiceIntruction()  {

        while (!toString(numberChoice).isEmpty()) {
            numberChoice = Integer.parseInt(scaner.nextLine());

            if (numberChoice >=1 && numberChoice <=7 && numberChoice != 0) {
                switch (numberChoice) {
                    case 1:
                        addIntroducingBudget.CreateModelBudget(scaner);
                        System.out.println("1 działa");
                        addIntroducingBudget.ShowModelBudget(scaner);
                       break;
                    case 2:
                        System.out.println("2 działa");
                        break;
                    case 3:
                        System.out.println("3 działa");
                        break;
                    case 4:
                        System.out.println("4 działa");
                        break;
                    case 5:
                        System.out.println("5 działa");
                        break;
                    case 6:
                        System.out.println("6 działa");
                        break;
                    case 7:
                        System.out.println("7 działa");
                        break;
                }


            } else if (numberChoice == 0) {
                System.out.println("Koniec programu");
                break;
            } else if (numberChoice < 0 || numberChoice > 7) {
                System.out.println("Podany zły zakres, proszę o podanie liczby ponownie w przedziale 0-7");
            }
        }
    }

    private String toString(int numberChoice) {
        return String.valueOf(numberChoice);
    }
}