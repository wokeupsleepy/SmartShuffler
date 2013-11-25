package smartshuffle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import musiclibrary.SongFile;

public class SelectorNode {
	
	//the purpose of this class is to create objects called SelectorNodes
	//SelectorNodes will be used as nodes in a linked link (SmartPlaylist)
	//They will specify a category of music to form an ArrayList
	//The ArrayList is shuffled and the first song is selected, this song is the one that is played
	
	List<SongFile> songPool = new ArrayList<SongFile>();
	//refer to this: http://www.reddit.com/r/learnprogramming/comments/1ozctz/java_i_have_a_quick_question_about_declaring_and/
	//may want to use something else that's not ArrayList
	
	String nodeName;	
	boolean useArtist, useGenre, useAlbum, useYearOfCreation; //booleans default to "false", at the start no attributes are used
	
	
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
	
	void addSongByYearOfCreation(int desiredStartYear, int desiredEndYear, SongFile SongTester) {
		if(SongTester.getYearCreated() >= desiredStartYear && SongTester.getYearCreated() <= desiredEndYear) {
			songPool.add(SongTester);
		}
	}
	
	SongFile selectSong() {
		Collections.shuffle(songPool);
		return songPool.get(0);
	}
	
	//add methods to set and get "back" and "next" nodes
	
}
