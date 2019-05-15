package Projekt;

public class SongTree{
	
	public Song root;
	
	public SongTree() {
		root = null;
	}
	
	/*public int compareTo(Song other) {
		return 1;
	}*/

	public void addSong(Song song) {
		Song temp = root;
		Song parent;
		if(root == null) {
			root = song;
		}
		else {
			while(true) {
				parent = temp;
				if(temp.name.compareTo(song.name)<0) {
					temp = temp.right;
					if(temp == null) {
						song = parent.right;
						return;
					}
				}
				else if(temp.name.compareTo(song.name)==0) {
					return;
				}
				else {
					temp = temp.left;
					if(temp == null) {
						song = parent.left;
						return;
					}
				}
			}
		}
	}
	
	public void remove(Song song) {
		Song temp = root;
		
	}
	
	public void printPreOrder(Song song) {
        System.out.println(song);       // Node
        if(song.left != null )
            printPreOrder(song.left);           // Left
        if( song.right != null )
            printPreOrder(song.right);          // Right
    }

/*
    void printPostOrder( )
    {
        if( left != null )
            left.printPostOrder( );          // Left
        if( right != null )
            right.printPostOrder( );         // Right
        System.out.println( element );       // Node
    }

    void printInOrder( )
    {
        if( left != null )
            left.printInOrder( );            // Left
        System.out.println( element );       // Node
        if( right != null )
            right.printInOrder( );           // Right
    }
*/

	
}

class Song{
	
	public Song left;
	public Song right;
	public int length;
	public String name;
	public String artist;
	
	public Song(Song left, Song right, int length, String name, String artist) {
		this.left = left;
		this.right = right;
		this.length = length;
		this.name = name;
		this.artist = artist;
	}
	
	public String toString() {
		return name + " - " + artist + " (" + length + ")";
	}
}
