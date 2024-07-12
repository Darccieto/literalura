package com.example.literalura.repository;

import com.example.literalura.entity.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;



public interface IRepoAuthor extends JpaRepository<AuthorEntity, Long> {
    @Query("SELECT a FROM AuthorEntity a WHERE : year between a.fechaNacimiento AND a.fechaFallecimiento")
    List<AuthorEntity> findForYear(int year);
}
