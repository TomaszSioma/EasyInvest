package RepositoryClaeses;

import MainClasses.Budget;

import java.util.ArrayList;

public class ModelBudgetRepository {

    private ArrayList<Budget> modelBudget = new ArrayList<>();

    public Budget CreateModelBudget(String modelBudgetName, float valueBudget) {
        Budget newModelBudget = new Budget(modelBudgetName, valueBudget);
        this.modelBudget.add(newModelBudget);
        System.out.println("Budżet o nazwie: " + modelBudgetName + " ma wartość: " + valueBudget + " zł");
        return newModelBudget;
    }

}
