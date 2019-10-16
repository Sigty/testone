package com.effectivesoft.espoll.controller;

import com.effectivesoft.espoll.dto.QuestionDto;
import com.effectivesoft.espoll.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RestController
public class QuestionController {

    private final QuestionService questionService;

    @GetMapping("/getAllQuestions")
    public List<QuestionDto> getAllQuestion() {
        return questionService.findAllQuestion();
    }
}
