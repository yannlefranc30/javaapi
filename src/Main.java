import java.util.Arrays;
import java.util.List;

package fr.jmdoudoux.dej.streams;

import java.util.Arrays;
import java.util.List;

//apprentissage de la conceptions d'api avec la doc
public class JavaApplication1 {

    public static void main(String[] args) {
        List<String> maListe = Arrays.asList("a1", "a2", "merci", "yann", "c1");
        maListe.stream()
                .filter(s -> s.startsWith("a")) //filter prmet d'effectuer des opération sur séquence
                .map(String::toUpperCase) //Upercase gere les aplhapbet latin
                .sorted() //sorted renvoie un flux
                .forEach(System.out::println);
    }
}










