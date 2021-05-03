package arrayList;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> comida = new ArrayList<String>(); // sintax para a criação de um ArrayList

        comida.add("Hotdog");           // o método add adiciona um valor a última posição do array
        comida.add("Hambuguer");
        comida.add("Pizza");

        for (String s : comida) {
            System.out.println(s);
        }

        comida.set(0, "Macarrão");      // o método set altera o valor na posição do array indicada

        comida.remove(2);         // o método remove elimina o valor na posição do array indicada

        comida.clear();                 // o método clear limpa por completo o array

        

    }
}
