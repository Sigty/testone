package com.effectivesoft.espoll.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Data
@ToString(of = {"id", "question", "version"})
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "poll_questions", schema = "main")
@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "question", nullable = false)
    private String question;

    @Column(name = "version", nullable = false)
    private String version;

    @OneToMany(mappedBy = "parentQuestion", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Question> parentQuestion = new ArrayList<>();

    @OneToMany(mappedBy = "nextQuestion", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Question> nextQuestion = new ArrayList<>();
}
