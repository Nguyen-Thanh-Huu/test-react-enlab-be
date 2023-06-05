package com.choice.enlab.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.choice.enlab.common.ResponseModel;
import com.choice.enlab.entity.Optionstbl;
import com.choice.enlab.repository.IdModel;
import com.choice.enlab.service.OptionService;

@RestController
@RequestMapping("/api/v1")
public class OptionController {
    
    @Autowired
    private OptionService optionService;

    @GetMapping("/all-options")
    public List<Optionstbl> getAllOption() {
        return optionService.allOptions();
    }

    @GetMapping("/option-by-idquestion/{id}")
    public Optional<List<Optionstbl>> getOptionByQuestion(@PathVariable Integer id) {
        return optionService.allOptionByIdQuestion(id);
    }

    @PostMapping("/all-by-id-question")
    public Optional<List<Optionstbl>> allOPtionsByIdQuestion(@RequestBody Integer id) {
        return optionService.allOptionById(id);

        // return optionService.allOptionById(id);
    }
}
