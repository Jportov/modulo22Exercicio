package br.com.porto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class JavaTestes {

    @Test
    public void testFiltrarMulheres() {
        // Preparando a lista de pessoas
        List<Main.Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Main.Pessoa("Maria", "F"));
        pessoas.add(new Main.Pessoa("João", "M"));
        pessoas.add(new Main.Pessoa("Ana", "F"));

        // Filtrando apenas as mulheres
        List<Main.Pessoa> mulheres = Main.filtrarMulheres(pessoas);

        // Verificando se a quantidade de mulheres está correta
        assertEquals(2, mulheres.size());

        // Verificando se os nomes estão corretos
        assertEquals("Maria", mulheres.get(0).getNome());
        assertEquals("Ana", mulheres.get(1).getNome());
    }

    @Test
    public void testFormatarListaPessoas() {
        // Preparando a lista de pessoas
        List<Main.Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Main.Pessoa("Maria", "F"));
        pessoas.add(new Main.Pessoa("João", "M"));

        // Formatando a lista
        String resultado = Main.formatarListaPessoas(pessoas);

        // Verificando se a formatação está correta
        assertEquals("Maria (F), João (M)", resultado);
    }
}
