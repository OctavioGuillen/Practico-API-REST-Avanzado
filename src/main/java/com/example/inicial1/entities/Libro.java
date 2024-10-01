package com.example.inicial1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.util.List;

@Entity
@Table(name = "libro")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Libro extends Base{

    @Column(name = "calle")
    private String titulo;

    @Column(name = "calle")
    private int fecha;

    @Column(name = "calle")
    private String genero;

    @Column(name = "calle")
    private int paginas;

    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Autor> autores;

}
