package dev.fabiomoraiss.bk4ss.repository;

import dev.fabiomoraiss.bk4ss.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
