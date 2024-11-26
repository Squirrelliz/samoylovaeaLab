package tech.reliab.course.samoylovaea.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.reliab.course.samoylovaea.bank.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    void deleteById(int id);
}
