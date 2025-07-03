package Model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Receita
{
    private String nome;
    private String descricao;
    private String instruções;
    private String imagemURL;
    private String categoria;
    private String ingredientes;
    private ArrayList<Ingrediente> listaIngredientes;

}


