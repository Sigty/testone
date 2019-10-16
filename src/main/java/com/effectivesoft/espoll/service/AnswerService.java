package com.effectivesoft.espoll.service;

import com.effectivesoft.espoll.repository.AnswerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Service
public class AnswerService {

    private final AnswerRepository answerRepository;
}
