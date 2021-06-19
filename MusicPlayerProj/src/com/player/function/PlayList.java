package com.player.function;
/**
 * �����б���
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
	private String playListName; //�����б�����
	private List<Song> musicList; //��Ÿ������б�
	/**
	 * ���췽��
	 * @param playListName �б���
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
	 * ��Ӹ����������б�
	 * ���ǰ���жϸ����Ƿ��Ѿ�����
	 * ��ӳɹ�����true��ʧ�ܷ���false
	 */
	public boolean addMusicToList(Song song) {
		for (Song s:musicList) {
			if (s.getId().equals(song.getId())) {
				System.out.println("����id�����ظ�");
				return false;
			}else if (s.equals(song)) {
				System.out.println("�����Ѵ���");
				return false;
			}
		}
		System.out.println(this.getPlayListName()+song+"��ӳɹ�");
		musicList.add(song);
		return true;
	}
	
	/**
	 * ���ݸ���id����
	 * @param id ���Ҹ�����id
	 * @return ���ز��ҵĸ�������null
	 */
	public Song searchSongById(String id) {
		Song song = null;
		for (Song song2:musicList) {
			if (song2.getId().equals(id)) {
				//�ҵ���
				song = song2;break;
			}
		}
		return song;
	}
	
	/**
	 * ���ݸ������ֲ���
	 * @param name ���Ҹ���������
	 * @return �����ҵ��ĸ�������null
	 */
	public Song searchSongByName(String name) {
		Song song = null;
		for (Song song2:musicList) {
			if (song2.getName().equals(name)) {
				//�ҵ���
				song = song2;break;
			}
		}
		return song;
	}
	
	/**
	 * �޸�id��Ӧ��������Ϣ
	 * @param id ��Ҫ�޸ĸ�����id
	 */
	public void updateSong(String id) {
		@SuppressWarnings("resource")
		Scanner updateScanner = new Scanner(System.in);
		Song song = searchSongById(id);
		if (song==null) {
			System.out.println("δ�ҵ�"+id+"��Ӧ�ĸ�����Ϣ");
		}else {
			System.out.println("�����µĸ���:");
			String nameString = updateScanner.next();
			System.out.println("�����µĸ���:");
			String singerString = updateScanner.next();
			song.setName(nameString);
			song.setSinger(singerString);
//			updateScanner.close();
		}	
	}
	
	/**
	 * ɾ����Ӧ������Ϣ
	 * @param id ��Ҫɾ���ĸ���id
	 */
	public void deleteSong(String id) {
		Song song = searchSongById(id);
		if (song!=null) {
			musicList.remove(song);
			System.out.println(song+"��ɾ��");
		}else {
			System.out.println("δ�ҵ�"+id+"��Ӧ�ĸ�����Ϣ");
		}
	}
	
	/**
	 * ��ʾ�����б������и���
	 */
	public void displayAllSong() {
		System.out.println("�����б��е����и���Ϊ��");
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
		System.out.println("�赥�����ɹ�");
		
	}
	
}
