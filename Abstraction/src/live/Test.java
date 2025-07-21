package live;



import music.string.Veena;
import music.wind.Saxophone;
import music.playable;

public class Test {
    public static void main(String[] args) {
        // a. Create instance of Veena and call play()
        Veena veena = new Veena();
        veena.play();

        // b. Create instance of Saxophone and call play()
        Saxophone sax = new Saxophone();
        sax.play();

        // c. Place both in a variable of type Playable and call play()
        playable p1 = veena;
        playable p2 = sax;

        System.out.println("Using Playable interface references:");
        p1.play();
        p2.play();
    }
}
