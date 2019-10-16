package com.effectivesoft.espoll.service;

import com.effectivesoft.espoll.converter.QuestionDtoOfQuestion;
import com.effectivesoft.espoll.dto.QuestionDto;
import com.effectivesoft.espoll.entity.Question;
import com.effectivesoft.espoll.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Service
public class QuestionService {

    private final QuestionRepository questionRepository;
    private final QuestionDtoOfQuestion questionDtoOfQuestion;

    public List<QuestionDto> findAllQuestion() {
        List<Question> carList = new ArrayList<>();
        questionRepository.findAll().forEach(carList::add);
        return carList
                .stream()
                .map(questionDtoOfQuestion::convert)
                .collect(Collectors.toList());
    }

    public Page<QuestionDto> findAllQuestion(Pageable pageable) {
        Page<Question> questions = questionRepository.findAll(pageable);
        return new PageImpl<>(questions
                .stream()
                .map(questionDtoOfQuestion::convert)
                .collect(Collectors.toList()), pageable, (int) questions.getTotalElements());
    }
}
