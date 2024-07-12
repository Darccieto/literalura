package com.example.literalura.repository;

import com.example.literalura.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import org.springframework.data.jpa.repository.Query;

public interface IRepoLibrery extends JpaRepository<BookEntity, Long > {
    @Query("SELECT l FROM LibroEntity l WHERE l.lenguaje >= :idioma")
    List<BookEntity> findForLanguaje(String idioma);

}
