package com.expensetracker.service;

import com.expensetracker.entity.Expense;
import com.expensetracker.entity.User;
import com.expensetracker.repository.ExpenseRepository;
import com.expensetracker.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    private final ExpenseRepository expenseRepository;
    private final UserRepository userRepository;

    public ExpenseService(ExpenseRepository expenseRepository,
                          UserRepository userRepository) {
        this.expenseRepository = expenseRepository;
        this.userRepository = userRepository;
    }

    public Expense addExpense(Expense expense, String email) {
        User user = userRepository.findByEmail(email).orElseThrow();
        expense.setUser(user);
        return expenseRepository.save(expense);
    }

    public List<Expense> getExpenses(String email) {
        return expenseRepository.findByUserEmail(email);
    }
}
