package com.choice.enlab.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.choice.enlab.entity.Questions;
import com.choice.enlab.repository.IdModel;
import com.choice.enlab.service.QuestionService;


@RestController
@RequestMapping("/api/v1")
public class QuestionController {
    @Autowired
    private  QuestionService questionService;

    @GetMapping("/all-questions")
    public List<Questions> getAllQuestion(){
        return questionService.getAllQuestion();
    }
    @PostMapping("/question")
    public Optional<Questions> getQuestionById(@RequestBody IdModel id) {
        return questionService.getQuestionById(id);
    }
}
