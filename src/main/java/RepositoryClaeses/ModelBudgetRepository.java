package RepositoryClaeses;

import MainClasses.Budget;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.util.ArrayList;

public class ModelBudgetRepository {

    private ArrayList<Budget> modelBudget = new ArrayList<>();

    public Budget CreateModelBudget(String modelBudgetName, float valueBudget) {
        Budget newModelBudget = new Budget(modelBudgetName, valueBudget);
        this.modelBudget.add(newModelBudget);
        System.out.println("Budżet o nazwie: " + modelBudgetName + " ma wartość: " + valueBudget + " zł");
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

        public void readAll() throws IOException {
        Gson readALL = new Gson();
        FileReader readFile = new FileReader("./InvestFun.json");
        ArrayList<Budget> loadBudget = readALL.fromJson(readFile,new TypeToken<ArrayList<Budget>>() {}.getType());
        this.modelBudget.addAll(loadBudget);
        this.modelBudget.forEach(modelBudget->{
            System.out.println("Załadowano budżet" + modelBudget.toString());
        });
        }

        public void saveAll() throws IOException {

        Gson saveAll = new Gson();
        FileWriter saveToFile = new FileWriter("./InvestFun.json");
        saveAll.toJson(this.modelBudget,saveToFile);
        saveToFile.flush();
        saveToFile.close();
    }

}
