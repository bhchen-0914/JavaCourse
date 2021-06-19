package com.player.function;
/**
 * 播放器类
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
	 * 向播放器中添加播放列表
	 * @param playList 添加的播放列表
	 */
	public void addPlayList(PlayList playList) {
		Set<String> playListName = playListMap.keySet();
		for (String name:playListName) {
			if (name.equals(playList.getPlayListName())) {
				System.out.println("播放列表已存在！");break;
			}
		}
		//以播放列表的名称作为key值，以便于索引
		playListMap.put(playList.getPlayListName(), playList);
//		System.out.println("添加成功");
	}
	
	/**
	 * 通过播放列表名称查找列表
	 * @param name 播放列表名
	 * @return 返回对应的播放列表
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
	 * 删除播放列表
	 * @param playListName 删除列表的名字
	 */
	public void deletePlayList(String playListName) {
		PlayList playList = this.searchPlayListByName(playListName);
		if (playList!=null) {
			playListMap.remove(playList.getPlayListName());
			System.out.println("删除成功！");
		}else {
			System.out.println("未找到此播放列表");
		}	
	}
	
	/**
	 * 显示所有播放列表
	 */
	public void displayAllPlayList() {
		Set<String> playListSet = playListMap.keySet();
		System.out.println("播放列表名称为：");
		for (String s:playListSet) {
			System.out.println(s);
		}
	}
		
}
