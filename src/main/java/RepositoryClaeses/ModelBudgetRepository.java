package RepositoryClaeses;

import MainClasses.Budget;

import java.io.*;
import java.util.ArrayList;

public class ModelBudgetRepository extends IOException {

    private ArrayList<Budget> modelBudget = new ArrayList<>();
    PrintWriter fileOutputStream;

    {
        try {
            fileOutputStream = new PrintWriter("C:/Users/tomzm/GitHub/EasyInvest/InvestFu.txt");
        } catch (FileNotFoundException e) {
            System.out.println("tak");
            e.printStackTrace();
        }
    }


    public Budget CreateModelBudget(String modelBudgetName, float valueBudget) {
        Budget newModelBudget = new Budget(modelBudgetName, valueBudget);
        this.modelBudget.add(newModelBudget);
        fileOutputStream.write(modelBudgetName);
        System.out.println("Budżet o nazwie: " + modelBudgetName + " ma wartość: " + valueBudget + " zł");
        fileOutputStream.close();
        return newModelBudget;
    }

        public Budget ShowModelBudget(int position) {
        if (!modelBudget.isEmpty()) {
            System.out.println("Coś się dzieje");
            return modelBudget.get(position);
        } else {
            System.out.println("Lista jst pusta");
            return modelBudget.get(0);
        }
        }

}
