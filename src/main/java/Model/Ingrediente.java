package Model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Ingrediente

{
    private String nome;
    private Integer unidade;
    private Boolean medida;

}
