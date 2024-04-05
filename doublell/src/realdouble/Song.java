package realdouble;

public class Song {

	String songTitle;
	String artist;
	public Song(String songtitle, String artist) {
		
		this.songTitle = songtitle;
		this.artist = artist;
	}
	@Override
	public String toString() {
		return "Songtitle= " + songTitle + ", Artist is = " + artist;
	}
}
class Node
{
	public Song data;
	public Node prev;
	public Node next;
}
