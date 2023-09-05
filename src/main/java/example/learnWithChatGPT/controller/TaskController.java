package example.learnWithChatGPT.controller;

import example.learnWithChatGPT.entity.Task;
import example.learnWithChatGPT.services.TaskServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/task/api/v1")
public class TaskController {
    @Autowired
    TaskServices taskServices;

    @GetMapping("/getAll")
    public List<Task> getAllTasks(){
        return  taskServices.findAllTasks();
    }
    @GetMapping("getById/{id}")
    public ResponseEntity<Task> getById(@PathVariable("id") Long id){

        return taskServices.findById(id);
    }
}
