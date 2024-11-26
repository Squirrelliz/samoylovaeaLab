package tech.reliab.course.samoylovaea.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.reliab.course.samoylovaea.bank.entity.PaymentAccount;

import java.util.Optional;

public interface PaymentAccountRepository extends JpaRepository<PaymentAccount, Integer> {

    void deleteById(int id);
}
