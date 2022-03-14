package com.example.expensetracker.service;

import com.example.expensetracker.model.Expense;

import java.util.List;

public interface ExpenseService {
    

   List<Expense> findAll();


   Expense save(Expense expense);


   Expense findById(long id);

   void delete(long id);
   
}
