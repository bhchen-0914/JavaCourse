package com.player.function;
/**
 * ��������
 * @author bhchen3
 *
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PlayListCollection {
	private Map<String, PlayList> playListMap;
	
	public PlayListCollection() {
		playListMap = new HashMap<String, PlayList>();
	}

	public Map<String, PlayList> getPlayListMap() {
		return playListMap;
	}
			
	/**
	 * �򲥷�������Ӳ����б�
	 * @param playList ��ӵĲ����б�
	 */
	public void addPlayList(PlayList playList) {
		Set<String> playListName = playListMap.keySet();
		for (String name:playListName) {
			if (name.equals(playList.getPlayListName())) {
				System.out.println("�����б��Ѵ��ڣ�");break;
			}
		}
		//�Բ����б��������Ϊkeyֵ���Ա�������
		playListMap.put(playList.getPlayListName(), playList);
//		System.out.println("��ӳɹ�");
	}
	
	/**
	 * ͨ�������б����Ʋ����б�
	 * @param name �����б���
	 * @return ���ض�Ӧ�Ĳ����б�
	 */
	public PlayList searchPlayListByName(String name) {
		PlayList playList = null;
		Set<String> playListSet = playListMap.keySet();
		for (String s:playListSet) {
			if (s.equals(name)) {
				playList = playListMap.get(s);break;
			}
		}
		return playList;
	}
	
	/**
	 * ɾ�������б�
	 * @param playListName ɾ���б������
	 */
	public void deletePlayList(String playListName) {
		PlayList playList = this.searchPlayListByName(playListName);
		if (playList!=null) {
			playListMap.remove(playList.getPlayListName());
			System.out.println("ɾ���ɹ���");
		}else {
			System.out.println("δ�ҵ��˲����б�");
		}	
	}
	
	/**
	 * ��ʾ���в����б�
	 */
	public void displayAllPlayList() {
		Set<String> playListSet = playListMap.keySet();
		System.out.println("�����б�����Ϊ��");
		for (String s:playListSet) {
			System.out.println(s);
		}
	}
		
}
