package MainClasses;

import java.util.Date;

public class Budget {
    private String budgetName;
    private float valueBudget;
    private Date periodOfBudget;

    public Budget(String budgetName, float valueBudget) {
        this.budgetName = budgetName;
        this.valueBudget = valueBudget;
    }
}
