package tfc.princeton.terracefjukebox.search;

import tfc.princeton.terracefjukebox.util.SongInfo;

/**
 * This class searches Subsonic for songs
 * @author rob
 *
 */
public class SubsonicSearch implements ServiceSearch {

	@Override
	public SongInfo[] search(String name, String artist, String album) {
		// TODO Query subsonic, parse XML result, return song info array
		return null;
	}
	
}
