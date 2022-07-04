package girardtechie.azurespringwebapp.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends CrudRepository<Expense,Long> {
}
