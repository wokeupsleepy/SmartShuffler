package musiclibrary;

import java.util.HashSet;
import java.util.Set;

public class SongFile {
	
	//we will get this information from the ID3 tag on the MP3 files
	
	Set<String> artistName = new HashSet<String>(); //perhaps multiple artists
	String albumName;
	String genre;
	int trackNumber;
	int yearCreated;
	
	public int getYearCreated() {
		return yearCreated;
	}

	public void setYearCreated(int yearCreated) {
		this.yearCreated = yearCreated;
	}

	public int getTrackNumber() {
		return trackNumber;
	}

	public void setTrackNumber(int trackNumber) {
		this.trackNumber = trackNumber;
	}

	public Set<String> getArtistName() {
		return artistName;
	}
	
	public void addArtist(String newArtist) {
		artistName.add(newArtist);
	}
	
	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

}
