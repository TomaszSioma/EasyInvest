package MainClasses;

import java.util.Date;

public class Income {

    private String incomeName;
    private float valueIncome;
    private Date dateOfIncome;

    public Income(String incomeName, float valueIncome) {
        this.incomeName = incomeName;
        this.valueIncome = valueIncome;
        this.dateOfIncome = new Date();
    }
}
