package example.learnWithChatGPT.services;

import example.learnWithChatGPT.entity.Task;
import example.learnWithChatGPT.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImp implements TaskServices{
    @Autowired
    TaskRepository taskRepository;
    @Override
    public List<Task> findAllTasks() {
        return null;
    }
}
