package hu.progmatik.customer_expense.repository;

import hu.progmatik.customer_expense.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenceRepository extends JpaRepository<Expense, Long> {
}
