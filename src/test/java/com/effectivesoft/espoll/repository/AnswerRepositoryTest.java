package com.effectivesoft.espoll.repository;

import com.effectivesoft.espoll.entity.Answer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AnswerRepositoryTest {

    @Autowired
    private AnswerRepository answerRepository;

    @Test
    public void findAllAnswers() {
//        answerRepository.findAll(PageRequest.of(0, 10)).forEach(System.out::println);
        Page<Answer> findAllAnswers = answerRepository.findAll(PageRequest.of(0, 10));
        Assert.assertNotNull(findAllAnswers);
        Assert.assertTrue(findAllAnswers.getSize() >= 0);
    }
}
