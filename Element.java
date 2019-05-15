package Projekt;

public class Element {
		public String key;
		public SongTree songtree;
		/*public String name;
		public String artist;
		public String album;
		public String length;
		*/
		public Element(String key, String name, String artist, String album, String length) {
			this.key = key;
			/*this.name = name;
			this.artist = artist;
			this.album = album;
			this.length = length;*/
		}
		public String toString() {
			return "";//name + " - " + artist + " (" + album + ") " + length;
		}
		
	}
