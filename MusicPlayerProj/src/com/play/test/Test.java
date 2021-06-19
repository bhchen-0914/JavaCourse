package com.play.test;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.player.function.*;
public class Test {
	
	public void test() {
		Menu menu = new Menu();
		//创建主播放列表
		PlayList mainPlayList = new PlayList("主播放列表");
		PlayListCollection player = new PlayListCollection();
		player.addPlayList(mainPlayList);
		Scanner sc = new Scanner(System.in);
		int inputMain=0,inputPlayList=0,inputPlayer=0;
		while (true) {
			while (true) {
				menu.mainMenu();
				try {
					System.out.println("请输入指令:");
					inputMain = sc.nextInt();
					break;
				} catch (InputMismatchException e) {
					System.out.println("请输入整数");
					sc.next();
				}
			}
			if (inputMain==0) {
				System.out.println("程序结束!");
				break;
			}
			switch (inputMain) {
			case 1: 
				//播放器管理
				while (true) {
					while (true) {
						menu.playerMenu();
						try {
							System.out.println("请输入指令:");
							inputPlayer = sc.nextInt();
							break;
						} catch (InputMismatchException e) {
							System.out.println("请输入整数");
							sc.next();
						}
					}
					if (inputPlayer==9) {
						System.out.println("返回上一级菜单");
						break;
					}
					switch (inputPlayer) {
					case 1:
						System.out.println("请输入播放列表名称:");
						String addName = sc.next();
						player.addPlayList(new PlayList(addName));
						break;
					
					case 2:
						System.out.println("请输入要删除的播放列表名称:");
						String deleteName = sc.next();
						if (deleteName.equals("主播放列表")) {
							System.out.println(deleteName+"不可删除!");
						}else {
							player.deletePlayList(deleteName);
						}	
						break;
						
					case 3:
						System.out.println("通过名字查询播放列表信息");
						System.out.println("请输入要查询的播放列表名称：");
						String searchName = sc.next();
						PlayList playListCat = player.searchPlayListByName(searchName);
						if (playListCat==null) {
							System.out.println("未找到播放列表<"+searchName+">");
						}else {
							System.out.println("已找到播放列表:"+playListCat.getPlayListName());
						}
						break;
						
					case 4:
						System.out.println("显示所有播放列表名称");
						player.displayAllPlayList();
						break;
						
					default:
						System.out.println("请输入正确指令:1~4,9");
						break;
					}
				}
				break;
				
			case 2:
				while (true) {
					while (true) {
						menu.playListMenu();
						try {
							System.out.println("请输入指令:");
							inputPlayList = sc.nextInt();
							break;
						} catch (InputMismatchException e) {
							System.out.println("请输入整数");
							sc.next();
						}
					}
					if (inputPlayList==9) {
						System.out.println("返回上一级菜单");
						break;
					}
					switch (inputPlayList) {
					case 1:
						System.out.println("--------添加歌曲到主播放列表--------");
						System.out.println("输入添加歌曲数量:");
						int count = sc.nextInt();
						for (int i =1;i<=count;i++) {
							boolean flag;
							System.out.println("请输入id:");
							String idString = sc.next();
							System.out.println("请输入歌名:");
							String nameString = sc.next();
							System.out.println("请输入歌手:");
							String singerString = sc.next();
							flag = mainPlayList.addMusicToList(new Song(idString, nameString, singerString));
							if (flag==false) {
								i--;
							}
							System.out.println("已成功添加"+i+"首歌");
						}break;
						
						case 2:
							System.out.println("--------添加歌曲到普通播放列表--------");
							System.out.println("请输入播放列表名称:");
							String playListName = sc.next();
							PlayList playList = player.searchPlayListByName(playListName);
							if (playList == null) {
								System.out.println("此播放列表不存在！");
								break;
							} else {
								System.out.println("输入添加歌曲数量:");
								
								int num = sc.nextInt();
								Song song;
								for (int i =1;i<=num;i++) {
									System.out.println("请输入id:");
									String idString = sc.next();
									song = mainPlayList.searchSongById(idString);
									//若主播放列表存在歌曲，则直接添加到普通列表
									if (song!=null) {
										playList.addMusicToList(song);
									}else {
										System.out.println("请输入歌名:");
										String nameString = sc.next();
										System.out.println("请输入歌手:");
										String singerString = sc.next();
										song = new Song(idString, nameString, singerString);
										boolean b = mainPlayList.addMusicToList(song);
										if (b) {
											playList.addMusicToList(song);
										}							
									}
							   }	
							}				
						break;
						
						case 3:
							System.out.println("--------通过歌曲id查询歌曲列表中歌曲--------");
							break;
							
						case 4:
							System.out.println("通过歌曲名称查询播放列表中的歌曲");
							break;
						
						case 5:
							System.out.println("修改播放列表中的歌曲");
							break;
							
						case 6:
							System.out.println("删除播放列表中的歌曲");
							break;
						
						case 7:
							System.out.println("显示播放列表中的所有歌曲");
							break;
						
						case 8:
							System.out.println("--------导出所有歌曲清单--------");
						try {
							mainPlayList.toMusicList("music.txt");
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
							break;
					default:
						System.out.println("请输入正确指令:1~9");
						break;
					}
				}
				break;
				
			default:
				System.out.println("请输入正确指令:0~2");
				break;
		}

			}
		sc.close();
	}

	public static void main(String[] args) {
		new Test().test();
		}
	}
