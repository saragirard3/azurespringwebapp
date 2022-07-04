package girardtechie.azurespringwebapp.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RevenueRepository extends CrudRepository<Revenue,Long> {
}
