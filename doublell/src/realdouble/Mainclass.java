package realdouble;

public class Mainclass {
	public static void main(String[] args) {
		CreatePlaylist cpl=new CreatePlaylist();
cpl.addSongs("you and i", "one direction");
		cpl.addSongs("story of my life", "one direction");
		cpl.addSongs("one lie", "one direction");
		cpl.addSongs("Hall of fame", "Script");
		cpl.addSongs("My love", "backstreet boys");
		cpl.addSongs("Baby", "Justin bieber");
		cpl.addSongs("on my way", "Alan Walker");
		cpl.playcurrentSong();
		cpl.playNextSong();
		cpl.playNextSong();
		cpl.playNextSong();
		cpl.playPrevSong();
		
		System.out.println("Playlist is");
		cpl.displayPlaylist();
		System.out.println("searching based on song title");
		cpl.searchSong("Baby");
		System.out.println("searching based on the artist name");
		cpl.search("one direction");
		System.out.println("the ordered playlist is");
		cpl.displaybasedonsongtitle();

	}

}
