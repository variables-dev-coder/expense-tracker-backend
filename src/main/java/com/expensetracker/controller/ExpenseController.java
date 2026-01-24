package com.expensetracker.controller;

import com.expensetracker.entity.Expense;
import com.expensetracker.service.ExpenseService;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {

    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    // Add expense (JWT protected)
    @PostMapping
    public Expense addExpense(@RequestBody Expense expense,
                              Authentication authentication) {

        String email = authentication.getName();
        return expenseService.addExpense(expense, email);
    }

    // Get my expenses
    @GetMapping
    public List<Expense> getMyExpenses(Authentication authentication) {

        String email = authentication.getName();
        return expenseService.getExpenses(email);
    }
}
