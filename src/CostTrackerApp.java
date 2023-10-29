import Expense.*;
import Observer.User;

public class CostTrackerApp {
    public static void main(String[] args) {
        User user1 = new User("Alice");
        User user2 = new User("Bob");

        user1.subscribeToCategory("Food");
        user2.subscribeToCategory("Entertainment");

        ExpenseTracker expenseTracker = new ExpenseTracker();
        expenseTracker.addObserver(user1);
        expenseTracker.addObserver(user2);

        ExpenseFactory foodExpenseFactory = new FoodExpenseFactory();
        ExpenseFactory entertainmentExpenseFactory = new EntertainmentExpenseFactory();

        Expense foodExpense = foodExpenseFactory.createExpense("Groceries", 50.0);
        Expense entertainmentExpense = entertainmentExpenseFactory.createExpense("Movie tickets", 20.0);

        expenseTracker.addExpense(foodExpense);
        expenseTracker.addExpense(entertainmentExpense);
    }
}