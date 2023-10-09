package hu.progmatik.customer_expense.controller;

import hu.progmatik.customer_expense.model.Customer;
import hu.progmatik.customer_expense.model.Expense;
import hu.progmatik.customer_expense.service.ExpenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExcpenceController {
    @Autowired
    private ExpenceService expenceService;

    public ExcpenceController(ExpenceService expenceService) {
        this.expenceService = expenceService;
    }
    @GetMapping("/expence")
    public List<Expense> getAllExpences () {
        return expenceService.getAllExpence();
    }
}
