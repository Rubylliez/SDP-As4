package Expense;

import Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class ExpenseTracker {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void addExpense(Expense expense) {
        notifyObservers(expense);
    }

    private void notifyObservers(Expense expense) {
        for (Observer observer : observers) {
            observer.update(expense);
        }
    }
}
