package com.example.expensetracker.service;
import java.util.List;
import com.example.expensetracker.model.Expense;
import com.example.expensetracker.repository.ExpenseRepository;
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


@Override
public Expense save(Expense expense) {
    expenseRepository.save(expense);
    return expense;
}


@Override
public Expense findById(long id) {
    if(expenseRepository.findById(id).isPresent()){
        return expenseRepository.findById(id).get();
    }
return null;

}


@Override
public void delete(long id) {
    Expense expense = findById(id);
    expenseRepository.delete(expense);
}

}
