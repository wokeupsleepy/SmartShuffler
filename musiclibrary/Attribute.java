package musiclibrary;

import java.util.HashSet;
import java.util.Set;

public interface Attribute {
	
	//these are the attributes that the selector node can use to create the songPool
	enum attributeTypes {
		ARTISTNAME, GENRE, ALBUMNAME, YEARCREATIONRANGE
	}
	
	Set<SongFile> songCategory = new HashSet<SongFile>();
	
	void addSongsToCategory();
	
}
