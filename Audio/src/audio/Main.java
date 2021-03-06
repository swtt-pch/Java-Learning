package audio;

import java.io.*;
import java.util.Scanner;
import javax.sound.sampled.*;

public class Main {

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{

        Scanner scanner = new Scanner(System.in);

        File file = new File("mrbluesky.wav");
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);

        String res = "";

        while (!res.equals("S")) {
            System.out.println("C = Começar, P = Parar, R = Recomeçar, S = Sair");
            System.out.println("Coloque sua escolha: ");

            res = scanner.next();
            res = res.toUpperCase();

            switch (res){
                case("C") : clip.start();
                break;
                case("P") : clip.stop();
                break;
                case("R") : clip.setMicrosecondPosition(0);
                break;
                case("S") : clip.close();
                default:
                    System.out.println("Opção inválida");
            }

            System.out.println("Encerrando player.");
        }



    }
}
