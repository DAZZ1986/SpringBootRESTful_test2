package com.SimpleRESTful_2.demo.controller;

import com.SimpleRESTful_2.demo.entity.Task;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class MainController {

    @GetMapping("/")
    public ResponseEntity main() {
        return ResponseEntity.ok("bingo");
    }

    @GetMapping("/task")
    public ResponseEntity task() {
        return ResponseEntity.ok(new Task(1l, "Buy bred"));
    }

}
