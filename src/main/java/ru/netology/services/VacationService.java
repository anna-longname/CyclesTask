package ru.netology.services;

public class VacationService {
    public int calculate(int income, int expenses, int threshold) {
        int balance = 0;
        int months = 0;
        for (int i = 0; i < 12; i++) {
            if (balance >= threshold) {
                balance = balance - expenses;
                balance = balance / 3;
                months++;
            } else {
                balance = balance + income;
                balance = balance - expenses;
            }
        }
        return months;
    }
}
