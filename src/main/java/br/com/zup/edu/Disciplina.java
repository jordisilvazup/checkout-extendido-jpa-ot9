package br.com.zup.edu;

import javax.persistence.*;

@Entity
public class Disciplina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String titulo;

    @Column(nullable = false, unique = true)
    private String descricao;

    @Column(nullable = false)
    private Integer cargaHoraria;

    public Disciplina(String titulo, String descricao, Integer cargaHoraria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    @Deprecated
    public Disciplina(){

    }
}
