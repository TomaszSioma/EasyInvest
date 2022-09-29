package ServiceClasses;

import MainClasses.Budget;
import RepositoryClaeses.ModelBudgetRepository;

import java.io.IOException;

public class ModelBudgetService extends IOException {


        private ModelBudgetRepository repository = new ModelBudgetRepository();

        public Budget ModelBudget(String modelBudgetName, float valueBudget){
            return this.repository.CreateModelBudget(modelBudgetName, valueBudget);
        }

        public Budget ShowModelBudget(int position) {
            return this.repository.ShowModelBudget(position);
        }

        // odczyt danych
        public void readAll() {
            try {
                this.repository.readAll();
            } catch (IOException e) {
                System.out.println("Pliku nie znaleziono");
            }
        }
        // Zapis danych
        public void saveAll() throws IOException {
            this.repository.saveAll();
        }
}

