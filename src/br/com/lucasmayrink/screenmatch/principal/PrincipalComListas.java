package br.com.lucasmayrink.screenmatch.principal;

import br.com.lucasmayrink.screenmatch.modelos.Filme;
import br.com.lucasmayrink.screenmatch.modelos.Serie;
import br.com.lucasmayrink.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        Filme outroFilme = new Filme("Avatar", 2023);
        var filmeDoLucas = new Filme("Gente Grande", 2010);
        Serie lost = new Serie("Lost", 2000);

        Filme f1 = filmeDoLucas;

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoLucas);
        lista.add(meuFilme);
        lista.add(lost);

        for (Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("A classificação é: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Arnold Schwarenegger");
        buscaPorArtista.add("Lucas Mayrink");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulos ordenados: ");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getNome));

    }

}
