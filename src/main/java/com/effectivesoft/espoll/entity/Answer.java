package com.effectivesoft.espoll.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@ToString(of = {"id", "answer", "parentQuestion", "nextQuestion"})
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "poll_answers", schema = "main")
@Entity
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "answer", nullable = false)
    private String answer;

    @ManyToOne(optional = false)
    @JoinColumn(name = "parent_question", referencedColumnName = "id")
    private Question parentQuestion;

    @ManyToOne(optional = false)
    @JoinColumn(name = "next_question", referencedColumnName = "id")
    private Question nextQuestion;
}
