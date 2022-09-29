package EnteredData;

import ServiceClasses.ModelBudgetService;

import java.io.IOException;
import java.util.Scanner;

public class IntroducingBudget {

    private ModelBudgetService modelBudget = new ModelBudgetService();


    // Metoda wprowadzania danych do programu
    public void CreateModelBudget(Scanner scanner) {
        System.out.println("Podaj nazwę budgetu");
        String modelBudgetName = scanner.nextLine();
        System.out.println("Podaj wartość budżetu");
        float valueBudget = Float.parseFloat(scanner.nextLine());
        this.modelBudget.ModelBudget(modelBudgetName,valueBudget);
    }

    // Metoda wyświetlająca dane
    public void ShowModelBudget (Scanner scanner) {
        System.out.println("Podaj ");
        int position = Integer.parseInt(scanner.nextLine());
        this.modelBudget.ShowModelBudget(position);
    }
    //Metoda zapisu danych
    public void saveAll() throws IOException {
        System.out.println("Zapisuje dane");
        this.modelBudget.saveAll();
    }
    // Metoda odczytu danych
    public void readAll() throws IOException {
        System.out.println("Odczytuje dane");
        this.modelBudget.readAll();
    }
}
