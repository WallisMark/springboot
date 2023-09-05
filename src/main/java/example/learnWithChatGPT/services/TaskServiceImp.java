package example.learnWithChatGPT.services;

import example.learnWithChatGPT.entity.Task;
import example.learnWithChatGPT.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImp implements TaskServices{
    @Autowired
    TaskRepository taskRepository;
    @Override
    public List<Task> findAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public ResponseEntity<Task> findById(Long id) {
        Optional<Task> task = taskRepository.findById(id);
        if(task.isPresent()){
            return ResponseEntity.ok(task.get());
        }else {
            return ResponseEntity.notFound().build();
        }
    }


}
