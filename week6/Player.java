public class Player {
    
    private String playlist;

    Player () {

    }

    Player (String playList) {
        this.playlist = playList;
    }

    public void start() {
        System.out.println("start");
    }

    public void pause() {
        System.out.println("pause");
    }

    public void stop() {
        System.out.println("stop");
    }

    public static void main(String[] args) {
        MusicPlayer mp = new MusicPlayer("");
        mp.start();
        mp.pause();
        mp.stop();
    }
}

class MusicPlayer extends Player {
    MusicPlayer(String playList ) {
        super(playList);
    }
    MusicPlayer() {
        super("");
    }

    public void start() {
        System.out.println("Playing advertisement now.........."); //Spotify
    }
}