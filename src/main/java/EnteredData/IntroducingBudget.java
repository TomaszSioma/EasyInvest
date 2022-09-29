package EnteredData;

import ServiceClasses.ModelBudgetService;

import java.util.Scanner;

public class IntroducingBudget {

    private ModelBudgetService modelBudget = new ModelBudgetService();

    public void CreateModelBudget(Scanner scanner) {
        System.out.println("Podaj nazwę budgetu");
        String modelBudgetName = scanner.nextLine();
        System.out.println("Podaj wartość budżetu");
        float valueBudget = Float.parseFloat(scanner.nextLine());
        this.modelBudget.ModelBudget(modelBudgetName,valueBudget);
    }

    public void ShowModelBudget (Scanner scanner) {
        System.out.println("Podaj ");
        int position = Integer.parseInt(scanner.nextLine());
        this.modelBudget.ShowModelBudget(position);

    }
}
