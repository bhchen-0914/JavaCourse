package com.play.test;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.player.function.*;
public class Test {
	
	public void test() {
		Menu menu = new Menu();
		//�����������б�
		PlayList mainPlayList = new PlayList("�������б�");
		PlayListCollection player = new PlayListCollection();
		player.addPlayList(mainPlayList);
		Scanner sc = new Scanner(System.in);
		int inputMain=0,inputPlayList=0,inputPlayer=0;
		while (true) {
			while (true) {
				menu.mainMenu();
				try {
					System.out.println("������ָ��:");
					inputMain = sc.nextInt();
					break;
				} catch (InputMismatchException e) {
					System.out.println("����������");
					sc.next();
				}
			}
			if (inputMain==0) {
				System.out.println("�������!");
				break;
			}
			switch (inputMain) {
			case 1: 
				//����������
				while (true) {
					while (true) {
						menu.playerMenu();
						try {
							System.out.println("������ָ��:");
							inputPlayer = sc.nextInt();
							break;
						} catch (InputMismatchException e) {
							System.out.println("����������");
							sc.next();
						}
					}
					if (inputPlayer==9) {
						System.out.println("������һ���˵�");
						break;
					}
					switch (inputPlayer) {
					case 1:
						System.out.println("�����벥���б�����:");
						String addName = sc.next();
						player.addPlayList(new PlayList(addName));
						break;
					
					case 2:
						System.out.println("������Ҫɾ���Ĳ����б�����:");
						String deleteName = sc.next();
						if (deleteName.equals("�������б�")) {
							System.out.println(deleteName+"����ɾ��!");
						}else {
							player.deletePlayList(deleteName);
						}	
						break;
						
					case 3:
						System.out.println("ͨ�����ֲ�ѯ�����б���Ϣ");
						System.out.println("������Ҫ��ѯ�Ĳ����б����ƣ�");
						String searchName = sc.next();
						PlayList playListCat = player.searchPlayListByName(searchName);
						if (playListCat==null) {
							System.out.println("δ�ҵ������б�<"+searchName+">");
						}else {
							System.out.println("���ҵ������б�:"+playListCat.getPlayListName());
						}
						break;
						
					case 4:
						System.out.println("��ʾ���в����б�����");
						player.displayAllPlayList();
						break;
						
					default:
						System.out.println("��������ȷָ��:1~4,9");
						break;
					}
				}
				break;
				
			case 2:
				while (true) {
					while (true) {
						menu.playListMenu();
						try {
							System.out.println("������ָ��:");
							inputPlayList = sc.nextInt();
							break;
						} catch (InputMismatchException e) {
							System.out.println("����������");
							sc.next();
						}
					}
					if (inputPlayList==9) {
						System.out.println("������һ���˵�");
						break;
					}
					switch (inputPlayList) {
					case 1:
						System.out.println("--------��Ӹ������������б�--------");
						System.out.println("������Ӹ�������:");
						int count = sc.nextInt();
						for (int i =1;i<=count;i++) {
							boolean flag;
							System.out.println("������id:");
							String idString = sc.next();
							System.out.println("���������:");
							String nameString = sc.next();
							System.out.println("���������:");
							String singerString = sc.next();
							flag = mainPlayList.addMusicToList(new Song(idString, nameString, singerString));
							if (flag==false) {
								i--;
							}
							System.out.println("�ѳɹ����"+i+"�׸�");
						}break;
						
						case 2:
							System.out.println("--------��Ӹ�������ͨ�����б�--------");
							System.out.println("�����벥���б�����:");
							String playListName = sc.next();
							PlayList playList = player.searchPlayListByName(playListName);
							if (playList == null) {
								System.out.println("�˲����б����ڣ�");
								break;
							} else {
								System.out.println("������Ӹ�������:");
								
								int num = sc.nextInt();
								Song song;
								for (int i =1;i<=num;i++) {
									System.out.println("������id:");
									String idString = sc.next();
									song = mainPlayList.searchSongById(idString);
									//���������б���ڸ�������ֱ����ӵ���ͨ�б�
									if (song!=null) {
										playList.addMusicToList(song);
									}else {
										System.out.println("���������:");
										String nameString = sc.next();
										System.out.println("���������:");
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
							System.out.println("--------ͨ������id��ѯ�����б��и���--------");
							break;
							
						case 4:
							System.out.println("ͨ���������Ʋ�ѯ�����б��еĸ���");
							break;
						
						case 5:
							System.out.println("�޸Ĳ����б��еĸ���");
							break;
							
						case 6:
							System.out.println("ɾ�������б��еĸ���");
							break;
						
						case 7:
							System.out.println("��ʾ�����б��е����и���");
							break;
						
						case 8:
							System.out.println("--------�������и����嵥--------");
						try {
							mainPlayList.toMusicList("music.txt");
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
							break;
					default:
						System.out.println("��������ȷָ��:1~9");
						break;
					}
				}
				break;
				
			default:
				System.out.println("��������ȷָ��:0~2");
				break;
		}

			}
		sc.close();
	}

	public static void main(String[] args) {
		new Test().test();
		}
	}
