package com.player.function;
/**
 * 播放列表类
 * @author bhchen3
 *
 */


import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class PlayList {
	private String playListName; //播放列表名称
	private List<Song> musicList; //存放歌曲的列表
	/**
	 * 构造方法
	 * @param playListName 列表名
	 */
	public PlayList(String playListName) {
		this.playListName = playListName;
		musicList = new ArrayList<Song>();
	}
	
	
	public String getPlayListName() {
		return playListName;
	}


	public void setPlayListName(String playListName) {
		this.playListName = playListName;
	}


	public List<Song> getMusicList() {
		return musicList;
	}


	/**
	 * 添加歌曲到播放列表
	 * 添加前需判断歌曲是否已经存在
	 * 添加成功返回true，失败返回false
	 */
	public boolean addMusicToList(Song song) {
		for (Song s:musicList) {
			if (s.getId().equals(song.getId())) {
				System.out.println("歌曲id不能重复");
				return false;
			}else if (s.equals(song)) {
				System.out.println("歌曲已存在");
				return false;
			}
		}
		System.out.println(this.getPlayListName()+song+"添加成功");
		musicList.add(song);
		return true;
	}
	
	/**
	 * 根据歌曲id查找
	 * @param id 查找歌曲的id
	 * @return 返回查找的歌曲或者null
	 */
	public Song searchSongById(String id) {
		Song song = null;
		for (Song song2:musicList) {
			if (song2.getId().equals(id)) {
				//找到了
				song = song2;break;
			}
		}
		return song;
	}
	
	/**
	 * 根据歌曲名字查找
	 * @param name 查找歌曲的名字
	 * @return 返回找到的歌曲或者null
	 */
	public Song searchSongByName(String name) {
		Song song = null;
		for (Song song2:musicList) {
			if (song2.getName().equals(name)) {
				//找到了
				song = song2;break;
			}
		}
		return song;
	}
	
	/**
	 * 修改id对应歌曲的信息
	 * @param id 需要修改歌曲的id
	 */
	public void updateSong(String id) {
		@SuppressWarnings("resource")
		Scanner updateScanner = new Scanner(System.in);
		Song song = searchSongById(id);
		if (song==null) {
			System.out.println("未找到"+id+"对应的歌曲信息");
		}else {
			System.out.println("输入新的歌名:");
			String nameString = updateScanner.next();
			System.out.println("输入新的歌手:");
			String singerString = updateScanner.next();
			song.setName(nameString);
			song.setSinger(singerString);
//			updateScanner.close();
		}	
	}
	
	/**
	 * 删除对应歌曲信息
	 * @param id 需要删除的歌曲id
	 */
	public void deleteSong(String id) {
		Song song = searchSongById(id);
		if (song!=null) {
			musicList.remove(song);
			System.out.println(song+"已删除");
		}else {
			System.out.println("未找到"+id+"对应的歌曲信息");
		}
	}
	
	/**
	 * 显示播放列表中所有歌曲
	 */
	public void displayAllSong() {
		System.out.println("播放列表中的所有歌曲为：");
		for (Song song:musicList) {
			System.out.println(song);
		}
	}
	
	public void toMusicList(String listName) throws IOException {
		FileOutputStream fos = new FileOutputStream(listName);
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		for (Song song:musicList) {
			bw.write(song.toString());
			bw.flush();
			bw.newLine();
		}
		bw.close();
		System.out.println("歌单创建成功");
		
	}
	
}
