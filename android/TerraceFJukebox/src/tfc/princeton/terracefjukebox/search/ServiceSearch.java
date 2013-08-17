package tfc.princeton.terracefjukebox.search;

import tfc.princeton.terracefjukebox.util.SongInfo;

/**
 * Classes which search for songs from a service should inherit this interface
 * @author rob
 */
public interface ServiceSearch {
	
	public SongInfo[] search(String name, String artist, String album);
	
}
