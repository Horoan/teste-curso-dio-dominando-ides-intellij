package br.com.dio;

import model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);


        Livro Livro1 = new Livro(nome: "O problema dos 3 corpos", numPaginas: 300);
        System.out.println(livro1);
/*        int a = 5;
        int b = 3;
        System.out.println("Hello Word!" + (a+b));*/
    }
}

class Livro {
    private String nome;
    private integer numPaginas;

    public Livro(String nome, integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
