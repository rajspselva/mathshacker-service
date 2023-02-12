package com.mathshackers.core.model;

import jakarta.persistence.Column;
import jakarta.persistence.ColumnResult;
import jakarta.persistence.ConstructorResult;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.SqlResultSetMapping;
import jakarta.persistence.SqlResultSetMappings;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NamedNativeQueries;
import org.hibernate.annotations.NamedNativeQuery;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "analogies")
@NamedNativeQueries(
        @NamedNativeQuery(
                name = Constants.GET_ALL_ANALOGIES,
                query = "select \n" +
                        "id, \n" +
                        "question, \n" +
                        "answer1, \n" +
                        "answer2, \n" +
                        "answer3, \n" +
                        "answer4, \n" +
                        "correct_answer \n" +
                        "from analogies",
                resultSetMapping = Constants.GET_ALL_ANALOGIES
        )
)
@SqlResultSetMappings(
        @SqlResultSetMapping(
                name = Constants.GET_ALL_ANALOGIES,
                classes = @ConstructorResult(
                        targetClass = Analogies.class,
                        columns = {
                                @ColumnResult(name = "id", type = Integer.class),
                                @ColumnResult(name = "question", type = String.class),
                                @ColumnResult(name = "answer1", type = String.class),
                                @ColumnResult(name = "answer2", type = String.class),
                                @ColumnResult(name = "answer3", type = String.class),
                                @ColumnResult(name = "answer4", type = String.class),
                                @ColumnResult(name = "correct_answer", type = Integer.class)
                        }
                )
        )
)
public class Analogies {

    @Id
    @Column(name = "id")
    Integer id;

    @Column(name= "question")
    String question;

    @Column(name= "answer1")
    String answer1;

    @Column(name= "answer2")
    String answer2;

    @Column(name= "answer3")
    String answer3;

    @Column(name= "answer4")
    String answer4;

    @Column(name= "correct_answer")
    Integer correctAnswer;

}
