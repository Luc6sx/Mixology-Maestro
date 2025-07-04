package Model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.List;
import java.util.ArrayList;


@Entity // Indica que esta classe é uma entidade JPA
@Table(name = "receitas") // Define o nome da tabela no banco de dados
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Receita
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Geração automática de ID
    private Long id;
    private String nome;

    @Column(columnDefinition = "TEXT") // Define o tipo de coluna como TEXT para suportar descrições longas
    private String descricao;

    @Column(columnDefinition = "TEXT")
    private String instruções;
    private String imagemURL;
    private String categoria; // Ex: "cítrico", "doce", "seco"
    private String ingredientes;

    @ManyToMany
    @JoinTable
            (
                    name = "receita_ingrediente", // Nome da tabela de junção
                    joinColumns = @JoinColumn(name = "receita_id"), // Coluna de junção para Receita
                    inverseJoinColumns = @JoinColumn(name = "ingrediente_id") // Coluna de junção para Ingrediente
            )
    private ArrayList<Ingrediente> listaIngredientes;

}


