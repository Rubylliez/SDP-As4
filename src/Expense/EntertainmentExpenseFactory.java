package Expense;

public class EntertainmentExpenseFactory implements ExpenseFactory {
    @Override
    public Expense createExpense(String description, double amount) {
        return new Expense(description, amount, "Entertainment");
    }
}