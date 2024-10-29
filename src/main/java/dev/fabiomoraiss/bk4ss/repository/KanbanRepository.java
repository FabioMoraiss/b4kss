package dev.fabiomoraiss.bk4ss.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import dev.fabiomoraiss.bk4ss.model.KanbanEntity;
public interface KanbanRepository extends JpaRepository<KanbanEntity, Integer> {
}
