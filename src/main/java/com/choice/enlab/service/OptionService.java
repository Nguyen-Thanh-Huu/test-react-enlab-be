package com.choice.enlab.service;

import java.util.List;
import java.util.Optional;

import javax.swing.text.html.Option;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.choice.enlab.entity.Optionstbl;
import com.choice.enlab.repository.IdModel;
import com.choice.enlab.repository.OptionRepository;
@Service
public class OptionService {
    @Autowired

    private OptionRepository optionRepository;

    public List<Optionstbl> allOptions() {
        return optionRepository.findAll();
    }

    public Optional<List<Optionstbl>> allOptionByIdQuestion(Integer id) {

        return optionRepository.findByidquestion(id);
    }


    public Optional<List<Optionstbl>> allOptionById(Integer id) {

        return optionRepository.findAllByIdquestion(id);
    }
    
}
