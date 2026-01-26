package com.expensetracker.controller;

import com.expensetracker.entity.Expense;
import com.expensetracker.service.ExpenseService;

import jakarta.validation.Valid;

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
    public Expense addExpense(@Valid @RequestBody Expense expense,
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
    
    // Update expense
    @PutMapping("/{id}")
    public Expense updateExpense(@PathVariable Long id,
                                 @Valid @RequestBody Expense expense,
                                 Authentication authentication) {

        return expenseService.updateExpense(id, expense, authentication.getName());
    }


    // Delete expense
    @DeleteMapping("/{id}")
    public String deleteExpense(@PathVariable Long id,
                                Authentication authentication) {

        expenseService.deleteExpense(id, authentication.getName());
        return "Deleted successfully";
    }

}
