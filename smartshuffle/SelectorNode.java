package smartshuffle;

import java.util.ArrayList;
import java.util.Collections;

import musiclibrary.SongFile;

public class SelectorNode {
	
	//the purpose of this class is to create objects called SelectorNodes
	//SelectorNodes will be used as nodes in a linked link (SmartPlaylist)
	//They will specify a category of music to form an ArrayList
	//The ArrayList is shuffled and the first song is selected, this song is the one that is played
	
	ArrayList<SongFile> songPool = new ArrayList<SongFile>();
	
	void addSongByGenre(String desiredGenre, SongFile SongTester) {
		if(desiredGenre.equals(SongTester.getGenre())) {
			songPool.add(SongTester);
		}
	}
	
	void addSongByArtist(String desiredArtist, SongFile SongTester) {
		if(SongTester.getArtistName().contains(desiredArtist)) {
			songPool.add(SongTester);
		}
	}
	
	void addSongByAlbum(String desiredAlbum, SongFile SongTester) {
		if(desiredAlbum.equals(SongTester.getAlbumName())) {
			songPool.add(SongTester);
		}
	}
	
	SongFile selectSong() {
		Collections.shuffle(songPool);
		return songPool.get(0);
	}
	
	//add methods to set and get "back" and "next" nodes
	
}
