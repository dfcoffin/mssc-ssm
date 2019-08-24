package guru.springframework.msscssm.repository;

import guru.springframework.msscssm.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Donald F. Coffin on 08/24/2019 at 06:24
 */
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
