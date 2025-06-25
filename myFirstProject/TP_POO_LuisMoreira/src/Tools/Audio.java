package Tools;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Audio {

    private static Clip clip; // Clip estático para poder ser acedido por playMusic e stopMusic

    /**
     * Método para correr ficheiros áudio durante a execução do programa
     * @param caminho Caminho para o ficheiro áudio
     */
    public static void playMusic(String caminho) {
        try {
            File audio = new File(caminho);
            if (audio.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(audio);
                clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
            }
        } catch (Exception e) {
            System.out.println("Erro ao reproduzir áudio: " + e.getMessage());
        }
    }

    /**
     * Método para parar a música
     */
    public static void stopMusic() {
        try {
            if (clip != null && clip.isRunning()) {
                clip.stop();
                clip.close(); // Fecha o clip para libertar recursos
            }
        } catch (Exception e) {
            System.out.println("Erro ao parar áudio: " + e.getMessage());
        }
    }
}
