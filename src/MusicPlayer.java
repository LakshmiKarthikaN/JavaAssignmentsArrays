import java.util.Scanner;


interface Playable {
    void play();
    void pause();
    void stop();
}
class MP3Player implements Playable {
    public void play() {
        System.out.println("MP3 Player: Playing music...");
    }
    public void pause() {
        System.out.println("MP3 Player: Music paused.");
    }
    public void stop() {
        System.out.println("MP3 Player: Music stopped.");
    }
}

class CDPlayer implements Playable {
    public void play() {
        System.out.println("CD Player: Playing CD...");
    }
    public void pause() {
        System.out.println("CD Player: CD paused.");
    }
    public void stop() {
        System.out.println("CD Player: CD stopped.");
    }
}

class StreamingPlayer implements Playable {
    public void play() {
        System.out.println("Streaming Player: Streaming music...");
    }
    public void pause() {
        System.out.println("Streaming Player: Stream paused.");
    }
    public void stop() {
        System.out.println("Streaming Player: Stream stopped.");
    }
}
public class MusicPlayer{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Playable player = null;

        System.out.println("Choose Music Player:");
        System.out.println("1. MP3 Player");
        System.out.println("2. CD Player");
        System.out.println("3. Streaming Player");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: player = new MP3Player(); break;
            case 2: player = new CDPlayer(); break;
            case 3: player = new StreamingPlayer(); break;
            default:
                System.out.println("Invalid choice!");
                return;
        }
        while (true) {
            System.out.println("\nControl Options:");
            System.out.println("1. Play");
            System.out.println("2. Pause");
            System.out.println("3. Stop");
            System.out.println("4. Exit");
            int action = scanner.nextInt();

            switch (action) {
                case 1: player.play(); break;
                case 2: player.pause(); break;
                case 3: player.stop(); break;
                case 4: System.out.println("Exiting Player..."); return;
                default: System.out.println("Invalid action!");
            }
        }
    }
}
