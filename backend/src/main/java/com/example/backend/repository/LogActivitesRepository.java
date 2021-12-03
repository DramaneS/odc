package com.example.backend.repository;

import com.example.backend.model.Activite;
import com.example.backend.model.Participation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.backend.model.LogActivites;

import java.util.List;


@RepositoryRestResource
public interface LogActivitesRepository extends JpaRepositoryImplementation<LogActivites, Long> {
    @Query(value = "SELECT l FROM LogActivites l WHERE l.activite.Id_activite= :Id_activite")
    List<LogActivites> responsByActivite(@Param("Id_activite") Long Id_activite);

}
