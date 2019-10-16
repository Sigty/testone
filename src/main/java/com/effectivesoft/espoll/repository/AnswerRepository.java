package com.effectivesoft.espoll.repository;

import com.effectivesoft.espoll.entity.Answer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepository extends PagingAndSortingRepository<Answer, Integer> {
}
