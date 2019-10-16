CREATE TABLE poll_questions
(
    id       INTEGER PRIMARY KEY,
    question TEXT     NOT NULL,
    version  CHAR(16) NOT NULL
);

CREATE TABLE poll_answers
(
    id              INTEGER PRIMARY KEY,
    answer          TEXT    NOT NULL,
    parent_question INTEGER NOT NULL,
    next_question   INTEGER,
    order_question  INTEGER NOT NULL,
    FOREIGN KEY (parent_question) REFERENCES poll_questions (id),
    FOREIGN KEY (next_question) REFERENCES poll_questions (id)
);