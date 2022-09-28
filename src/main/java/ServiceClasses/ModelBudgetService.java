package ServiceClasses;

import MainClasses.Budget;
import RepositoryClaeses.ModelBudgetRepository;

public class ModelBudgetService {


        private ModelBudgetRepository repository = new ModelBudgetRepository();

        public Budget ModelBudget(String modelBudgetName, float valueBudget){
            return this.repository.CreateModelBudget(modelBudgetName, valueBudget);
        }

}
