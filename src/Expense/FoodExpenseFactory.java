package Expense;

public class FoodExpenseFactory implements ExpenseFactory {
    @Override
    public Expense createExpense(String description, double amount) {
        return new Expense(description, amount, "Food");
    }
}