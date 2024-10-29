package dev.fabiomoraiss.bk4ss.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import dev.fabiomoraiss.bk4ss.model.ListEntity;

public interface ListRepository extends JpaRepository<ListEntity, Integer> {
}
