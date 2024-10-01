package br.com.porto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    static class Pessoa {
        private String nome;
        private String sexo;

        public Pessoa(String nome, String sexo) {
            this.nome = nome;
            this.sexo = sexo;
        }

        public String getNome() {
            return nome;
        }

        public String getSexo() {
            return sexo;
        }

        @Override
        public String toString() {
            return nome + " (" + sexo + ")";
        }
    }

    // Método para filtrar mulheres
    public static List<Pessoa> filtrarMulheres(List<Pessoa> pessoas) {
        return pessoas.stream()
                .filter(pessoa -> pessoa.getSexo().equals("F"))
                .collect(Collectors.toList());
    }

    // Método para criar a lista formatada
    public static String formatarListaPessoas(List<Pessoa> pessoas) {
        return pessoas.stream()
                .map(Pessoa::toString)
                .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Maria", "F"));
        pessoas.add(new Pessoa("João", "M"));
        pessoas.add(new Pessoa("Ana", "F"));

        // Exibindo todas as pessoas
        System.out.println("Lista de todas as pessoas: " + formatarListaPessoas(pessoas));

        // Filtrando e exibindo apenas as mulheres
        List<Pessoa> mulheres = filtrarMulheres(pessoas);
        System.out.println("Lista apenas com mulheres: " + formatarListaPessoas(mulheres));
    }
}
