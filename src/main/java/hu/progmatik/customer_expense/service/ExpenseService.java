package hu.progmatik.customer_expense.service;

import hu.progmatik.customer_expense.model.Expense;
import hu.progmatik.customer_expense.repository.ExpenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenceService {

    @Autowired
    private ExpenceRepository expenceRepository;

    public List<Expense> getAllExpence () {
        return expenceRepository.findAll();
    }

    public Expense addExpence ( Expense expense){
        return expenceRepository.save(expense);
    }
}
