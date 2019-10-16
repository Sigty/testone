package com.effectivesoft.espoll.repository;

import com.effectivesoft.espoll.entity.Question;
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
public class QuestionRepositoryTest {

    @Autowired
    private QuestionRepository questionRepository;

    @Test
    public void findAllQuestions() {
//        questionRepository.findAll(PageRequest.of(0, 10)).forEach(System.out::println);
        Page<Question> findAllQuestions = questionRepository.findAll(PageRequest.of(0, 10));
        Assert.assertNotNull(findAllQuestions);
        Assert.assertTrue(findAllQuestions.getSize() >= 0);
    }
}
