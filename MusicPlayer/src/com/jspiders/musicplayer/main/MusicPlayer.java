package com.jspiders.musicplayer.main;

import java.util.*;
import java.lang.*;

import com.jspiders.musicplayer.entity.Song;
import com.jspiders.musicplayer.operations.SongOperations;

public class MusicPlayer {
	private static Scanner sc = new Scanner(System.in);
	private static int choice;
	
	public static void main(String[] args) {
		musicPlayerMenu();
	}
	
	public static void musicPlayerMenu() {
		SongOperations so =new SongOperations();
		System.out.println(
				"==========MENU========= \n"+
				"1. Play Song \n" +
				"2. Add/Remove Song \n"+
				"3. Edit Song \n"+
				"4. Exit \n"
				);
		System.out.print("Enter No :");
		choice = sc.nextInt();
		switch (choice) {
		case 1: {
			System.out.println(
					"========MENU======= \n"+
					"1. Play all Song \n" +
					"2. Play Random Song \n"+
					"3. Choose to Play Song \n"+
					"4. Go Back \n"
					);
					System.out.print("Enater No :");
					choice = sc.nextInt();
					switch (choice) {
					case 1: {
						SongOperations.playAllList();
						break;
					}
					case 2:{
						System.out.println("Playing Random Song");
						SongOperations.playRandomList();
						break;
					}
					case 3:{
						SongOperations.playList();
						break;
					}
					case 4:{
						musicPlayerMenu();
					}
					default:
						System.out.println("Enter Valid No.");
					}
					
			break;
			
		}
		case 2:{
			System.out.println(
					"=======Menu====== \n"+
					"1. Add Song \n"+
					"2. Remove Song \n"+
					"3. Go Back \n"
					);
			System.out.print("Enter No :");
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Add Song");
				SongOperations.addSong();
				break;
			}
			case 2:{
				System.out.println("Remove Song");
				SongOperations.removeSong();
				break;
			}
			case 3:{
				musicPlayerMenu();
				break;
			}
			default:
				System.out.println("Enter Valid No.");
			}
			break;
		}
		case 3:{
			System.out.println("====Select Song To Edit====");
			SongOperations.editSong();
			break;
		}
		case 4:{
			System.out.println("Thank You...");
			break;
		}
		default:
			System.out.println("Enter Valid No Try Again");
			musicPlayerMenu();
		}
		
	}
}