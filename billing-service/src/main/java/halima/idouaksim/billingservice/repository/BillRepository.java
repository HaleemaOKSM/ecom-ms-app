package halima.idouaksim.billingservice.repository;

import halima.idouaksim.billingservice.entities.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill, Long> {
}
