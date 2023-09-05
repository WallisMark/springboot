package example.learnWithChatGPT.repository;

import example.learnWithChatGPT.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
