package com.mathshackers.core.repository;

import com.mathshackers.core.model.Analogies;
import com.mathshackers.core.model.Constants;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnalogiesRepository extends JpaRepository<Analogies, Long> {

    @Query(name = Constants.GET_ALL_ANALOGIES, nativeQuery = true)
    List<Analogies> retrieveAnalogies();
}
