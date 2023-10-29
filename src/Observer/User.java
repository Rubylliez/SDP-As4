package Observer;

import java.util.ArrayList;
import java.util.List;
import Expense.Expense;

public class User implements Observer {
    private String name;
    private List<String> subscribedCategories;

    public User(String name) {
        this.name = name;
        this.subscribedCategories = new ArrayList<>();
    }

    public void subscribeToCategory(String category) {
        subscribedCategories.add(category);
    }

    @Override
    public void update(Expense expense) {
        if (subscribedCategories.contains(expense.getCategory())) {
            System.out.println(name + " received a notification: New expense added - " + expense.getDescription() + " ($" + expense.getAmount() + ")");
        }
    }
}
