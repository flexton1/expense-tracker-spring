package com.example.expensetracker.service;
import java.util.List;
import com.example.expensetracker.model.Expense;
import com.example.expensetracker.repository.ExpenseRepository;
import com.example.expensetracker.service.ExpenseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ExpenseServiceImpl implements ExpenseService {
   
    @Autowired
    ExpenseRepository expenseRepository;


@Override   
public List<Expense> findAll(){
   return expenseRepository.findAll();
}

}
