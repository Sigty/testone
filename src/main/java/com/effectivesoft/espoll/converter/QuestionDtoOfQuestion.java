package com.effectivesoft.espoll.converter;

import com.effectivesoft.espoll.dto.QuestionDto;
import com.effectivesoft.espoll.entity.Question;
import org.springframework.stereotype.Component;

@Component
public class QuestionDtoOfQuestion implements Converter<QuestionDto, Question> {

    @Override
    public QuestionDto convert(Question question) {
        return QuestionDto.builder()
                .id(question.getId())
                .question(question.getQuestion())
                .version(question.getVersion())
                .build();
    }
}
