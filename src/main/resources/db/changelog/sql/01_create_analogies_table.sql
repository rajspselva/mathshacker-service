IF
OBJECT_ID('analogies') IS NULL
CREATE TABLE analogies
(
    id             INT          NOT NULL,
    question       VARCHAR(255) NOT NULL,
    answer1        VARCHAR(150) NOT NULL,
    answer2        VARCHAR(150) NOT NULL,
    answer3        VARCHAR(150) NOT NULL,
    answer4        VARCHAR(150) NOT NULL,
    correct_answer INT          NOT NULL
)
GO