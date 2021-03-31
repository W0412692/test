public class Main {

    public static void main(String[] args) {

        // The songs we are going to play
        Song robotRock = new Song();
        robotRock.name = "Robot Rock";
        robotRock.lengthInSeconds = 300;

        Song freeBird = new Song();
        freeBird.name = "Free Bird";
        freeBird.lengthInSeconds = 600;

        // instantiate our music player objects
        MP3Player mp3Player = new MP3Player();
        RecordPlayer recordPlayer = new RecordPlayer();

        // specify our selected songs
        mp3Player.selectedSong = robotRock;

        recordPlayer.selectedSong = freeBird;
        recordPlayer.isRecordPlayerCoverOpen = false; // close the cover on the record player

        // log information about our songs to the console
        System.out.println("First song: Name = " + robotRock.name + " Length = " + robotRock.lengthInSeconds);
        System.out.println("Second song: Name = " + freeBird.name + " Length = " + freeBird.lengthInSeconds);

        // set our volume levels
        mp3Player.volume = 100;
        recordPlayer.volume = 25;

        // play the songs
        mp3Player.isPlaying = true;
        recordPlayer.isPlaying = true;

        // update the battery level of our mp3 player
        mp3Player.batteryLevel = mp3Player.batteryLevel - 5;
        System.out.println("Current battery level: " + mp3Player.batteryLevel);

        // stop playing our songs
        mp3Player.isPlaying = false;
        recordPlayer.isPlaying = false;
        recordPlayer.isRecordPlayerCoverOpen = true; // open the cover of our record player when the song stops
    }
}
