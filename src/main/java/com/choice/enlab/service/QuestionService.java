package com.choice.enlab.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.choice.enlab.entity.Questions;
import com.choice.enlab.repository.IdModel;
import com.choice.enlab.repository.QuestionRepository;

@Service
public class QuestionService {
    @Autowired
    private QuestionRepository questionRepository;

    public List<Questions> getAllQuestion() {
        return questionRepository.findAll();
    }

    public Optional<Questions> getQuestionById(IdModel id) {
        return questionRepository.findById(id.getId());
    }


}
