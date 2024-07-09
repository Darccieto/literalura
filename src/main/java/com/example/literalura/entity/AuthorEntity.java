package com.example.literalura.entity;

import jakarta.persistence.*;

public class AuthorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private Integer fechaNacimiento;
    private Integer fechaFallecimiento;

    @OneToOne
    @JoinTable(
            name = "libro",
            joinColumns = @JoinColumn(name = "autor_id"),
            inverseJoinColumns = @JoinColumn(name = "id")
            )
    private LibroEntity libros;
    public AuthorEntity(){
    }
    public AuthorEntity(Autor autor){
        this.nombre =
    }
}
@Entity
@Table(name = "Autor")
