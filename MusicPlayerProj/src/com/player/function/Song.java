package com.player.function;

import java.io.Serializable;

/**
 * ∏Ë«˙¿‡
 * 
 * @author bhchen3
 *
 */
@SuppressWarnings("serial")
public class Song implements Serializable{
	private String id;
	private String name;
	private String singer;

	public Song(String id, String name, String singer) {
		this.id = id;
		this.name = name;
		this.singer = singer;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((singer == null) ? 0 : singer.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj==this)
			return true;
		if (obj.getClass()==Song.class) {
			Song song = (Song)obj;
			return (this.getName().equals(song.getName()))&&(this.getSinger().equals(song.getSinger()));
		}
		return false;
	}

	@Override
	public String toString() {
		return "∏Ë«˙–≈œ¢ <∏Ë«˙id:" + id + ", ∏Ë«˙√˚≥∆:" + name + ", ∏Ë ÷:" + singer + ">";
	}
	
	

}
