package EnteredData;


import java.io.IOException;
import java.util.Scanner;

public class UsersEnteredText {

    ChoiceInstruction choice = new ChoiceInstruction();

    public void EnteredText() throws IOException {
        System.out.println("Aplikacja do prowadzenia budżetu, kontroli wydatków oraz inwestowania!");
        System.out.println("\n");
        System.out.println("Wybierz co chcesz zrobić:");
        System.out.println("1. Wprowadznie budżetu modelowego");
        System.out.println("2. Prowdznie budżetu miesiecznego");
        System.out.println("3. Porównanie budżetu modelowego z prowadzonym budżetem miesięcznym");
        System.out.println("4. Budowanie poduszki finansowej");
        System.out.println("5. Wprowadznie modelowego portfela inwestycyjnego");
        System.out.println("6. Portfel inwestycyjny");
        System.out.println("7. Porównanie porfeli modelowego z inwestycyjnym");
        System.out.println("Aby zakońćzyć działanie programu wpisz '0'");

        Scanner scaner = new Scanner(System.in);


        choice.ChoiceIntruction();


    }


}
