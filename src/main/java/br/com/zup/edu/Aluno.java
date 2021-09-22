package br.com.zup.edu;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false, unique = true)
    private String nome;

    @Column(nullable = false)
    private String senha;

    @ManyToOne
    private GrupoEstudo grupoEstudo;

    public Aluno(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }



    @Deprecated
    public Aluno(){

    }
}
