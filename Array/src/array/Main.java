package array;

public class Main {

    public static void main(String[] args) {


        String[] carros = {"Camaro", "Corvette", "Tesla"};

        String[] frutas = new String[3];
        frutas[0] = "Maçã";
        frutas[1] = "Banana";
        frutas[2] = "Goiaba";

        carros[0] = "Mustang";

        for (String i : frutas){
            System.out.println(i);
        }

        for (String i : carros){
            System.out.println(i);
        }
    }
}
