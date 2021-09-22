package br.com.zup.edu;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class GrupoEstudo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String nome;

    @OneToMany(mappedBy = "grupoEstudo",cascade = CascadeType.ALL)
    private List<Aluno> membros= new ArrayList<>();

    @Deprecated
    public GrupoEstudo() {
    }

    public GrupoEstudo(String nome, List<Aluno> membros) {
        this.nome = nome;
        this.membros = membros;
    }
}
