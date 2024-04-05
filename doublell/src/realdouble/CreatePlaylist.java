package realdouble;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CreatePlaylist {
	Node head;
	Node tail;
	Node currentSong;
	int size;
	
	public void addSongs(String songTitle,String artist)
	{
		Song newSongs=new Song(songTitle, artist);
		Node node= new Node();
		node.data= newSongs;
		if(head==null)
		{
			head= node;
			tail=node;
			currentSong=node;
		
		}
		else
		{
			node.prev=tail;
			tail.next=node;
			tail=node;
		}
		size++;
		
	}
	public void playcurrentSong()
	{
		if(currentSong!=null)
		{
			System.out.println("Current song is "+ currentSong.data);
		}
		else
		{
			System.out.println("Playlist is empty");
		}
	}
	public void playNextSong()
	{
		if(currentSong!=null && currentSong.next!=null)
		{
			currentSong=currentSong.next;
			System.out.println("Next song is " + currentSong.data);
			
		}
		else
		{
			System.out.println("Playlist is empty");
		}
	}
	public void playPrevSong()
	{
		if(currentSong!=null && currentSong.prev!=null)
		{
			currentSong=currentSong.prev;
			System.out.println("Previous song is " + currentSong.data);
			
		}
		else
		{
			System.out.println("Playlist is empty");
		}
	}
	//jus display
	public void displayPlaylist()
	{
		Node tempNode=head;
		int index=0;
		while(index<size)
		{
			System.out.println(tempNode.data);
			tempNode=tempNode.next;
			index++;
		}
	}
	public int searchSong(String searchSong)
	{
		Node tempNode=head;
		for(int i=0;i<size;i++)
		{
			if(tempNode.data.songTitle==searchSong)
			{
				System.out.println("the song is present at index of "+ i);
				return 1;
			}
			tempNode=tempNode.next;
		}
		System.out.println("the song is not present");
		return 0;
	}
	//search by artist name
	public void search(String artistname) {
		List list=new ArrayList();
		int index=0;
		Node tempNode=head;
		while(index<size) {
		if(tempNode.data.artist.equals(artistname))
		{
			list.add(tempNode.data);
		
		}
		tempNode=tempNode.next;
		index++;
		}
	
		for(Object song:list)
		{
			System.out.println(song);
		}
		
	}
	//disply based on sorting
	
	public void displaybasedonsongtitle()
	{
		List list=new ArrayList();
		int index=0;
		Node tempNode=head;
		while(index<size)
		{
			list.add(tempNode.data.songTitle+ " "+tempNode.data.artist);
			tempNode=tempNode.next;
			index++;
		}
		Collections.sort(list);
		for(Object song:list)
		{
			System.out.println(song);
		}
		
	}

}
