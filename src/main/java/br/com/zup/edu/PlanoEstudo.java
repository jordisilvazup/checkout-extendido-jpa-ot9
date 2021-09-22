package br.com.zup.edu;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class PlanoEstudo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String descricao;

    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private List<Disciplina> disciplinas= new ArrayList<>();

    @ManyToOne
    private GrupoEstudo grupo;

    public PlanoEstudo(String descricao, List<Disciplina> disciplinas, GrupoEstudo grupo) {
        this.descricao = descricao;
        this.disciplinas = disciplinas;
        this.grupo = grupo;
    }

    @Deprecated
    public PlanoEstudo() {
    }
}
