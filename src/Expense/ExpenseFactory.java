package Expense;

public interface ExpenseFactory {
    Expense createExpense(String description, double amount);
}