package dev.fabiomoraiss.bk4ss.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import dev.fabiomoraiss.bk4ss.model.TaskEntity;

public interface TaskRepository extends JpaRepository<TaskEntity, Integer> {
}
