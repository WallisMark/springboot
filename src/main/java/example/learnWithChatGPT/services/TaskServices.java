package example.learnWithChatGPT.services;

import example.learnWithChatGPT.entity.Task;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface TaskServices {
    List<Task> findAllTasks();
}
