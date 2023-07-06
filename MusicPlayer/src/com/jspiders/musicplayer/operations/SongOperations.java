package com.jspiders.musicplayer.operations;

import java.util.*;

import com.jspiders.musicplayer.entity.Song;
import com.jspiders.musicplayer.main.MusicPlayer;

public class SongOperations extends MusicPlayer {
	
	public static void addSong() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter id :");
		int id = sc.nextInt();
		System.out.print("Enter Song Name :");
		//String song_name = sc.nextLine();
		String song = sc.next();
		System.out.print("Enter Singer Name :");
		String singer_name = sc.next();
		System.out.print("Enter Song Duration :");
		double duration = sc.nextDouble();
		
		Song s1 = new Song(id, song, singer_name, duration);
		
		System.out.println("Song Add Successfully ");
		System.out.println(s1);
		musicPlayerMenu();
		System.out.println();
		
	}
	
	public static void removeSong() {
		System.out.println("1. Song Name :Kesariya,"
				+ " Singer Name : Arijit Singh, Duration: 4.2");
		System.out.println("2. Song Name :Man Meri Jaan,"
				+ " Singer Name : King, Duration: 4.0");
		System.out.println("3. Song Name :Jeena Jeena,"
				+ " Singer Name : Atif Aslam, Duration: 3.5");
		System.out.println("1. Song Name :Pathaan,"
				+ " Singer Name : Arijit Singh, Duration: 3.0");
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Select Song to Remove :");
		int choose = sc1.nextInt();
		switch (choose) {
		case 1: {
			System.out.println("Kesariya by Arijit Singh is Removed");
			break;
		}
		case 2: {
			System.out.println("Man MEri Jaan by King is Removed");
			break;
		}
		case 3: {
			System.out.println("Jeena Jeena by Atif Aslam is Removed");
			break;
		}
		case 4: {
			System.out.println("Pathaan by Arijit Singh is Removed");
			break;
		}
		default:
			System.out.println("Enter Valid Song No ");
			removeSong();
		}
		backMenu();
		
	}
	
	public static void editSong() {
		System.out.println("1. Song Name :Kesariya,"
				+ " Singer Name : Arijit Singh, Duration: 4.2");
		System.out.println("2. Song Name :Man Meri Jaan,"
				+ " Singer Name : King, Duration: 4.0");
		System.out.println("3. Song Name :Jeena Jeena,"
				+ " Singer Name : Atif Aslam, Duration: 3.5");
		System.out.println("1. Song Name :Pathaan,"
				+ " Singer Name : Arijit Singh, Duration: 3.0");
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Select Song to Edit :");
		int choose = sc1.nextInt();
		if (choose <5 && choose >0) {
			
		}else {
			System.out.println("Select Valid Song No..");
			editSong();
			
		}
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Song Name :");
		//String song_name = sc.nextLine();
		String song = sc.next();
		System.out.print("Enter Singer Name :");
		String singer_name = sc.next();
		System.out.print("Enter Song Duration :");
		double duration = sc.nextDouble();
		
		Song s1 = new Song(choose, song, singer_name, duration);
		System.out.println("======================");
		System.out.println("Song Edit Successfully ");
		System.out.println(s1);
		System.out.println("======================");
		backMenu();
		
		
	}
	
	public static void backMenu() {
		Scanner sc1= new Scanner(System.in);
		System.out.print("To Go Back Enter 1 :");
		int back = sc1.nextInt();
		if (back==1) {
			musicPlayerMenu();
		}else {
			System.out.println("Enter 1 to Go Back");
			backMenu();
		}
	}
	
	public static void playAllList() {
		System.out.println("====Playing All Song===");
		System.out.println("");
		System.out.println("1. Song Name :Kesariya,"
				+ " Singer Name : Arijit Singh, Duration: 4.2");
		System.out.println("2. Song Name :Man Meri Jaan,"
				+ " Singer Name : King, Duration: 4.0");
		System.out.println("3. Song Name :Jeena Jeena,"
				+ " Singer Name : Atif Aslam, Duration: 3.5");
		System.out.println("1. Song Name :Pathaan,"
				+ " Singer Name : Arijit Singh, Duration: 3.0");
		System.out.println("");
		System.out.println("Kesariya by Arijit Singh is Playing now...");
		backMenu();
	}
	
	public static void playRandomList() {
		System.out.println("1. Song Name :Kesariya,"
				+ " Singer Name : Arijit Singh, Duration: 4.2");
		System.out.println("2. Song Name :Man Meri Jaan,"
				+ " Singer Name : King, Duration: 4.0");
		System.out.println("3. Song Name :Jeena Jeena,"
				+ " Singer Name : Atif Aslam, Duration: 3.5");
		System.out.println("1. Song Name :Pathaan,"
				+ " Singer Name : Arijit Singh, Duration: 3.0");;
		System.out.println("");
		System.out.println("Jeena Jenna by Atif Aslam is Playing now...");
		backMenu();
	}
	
	public static void playList() {
		System.out.println("1. Song Name :Kesariya,"
				+ " Singer Name : Arijit Singh, Duration: 4.2");
		System.out.println("2. Song Name :Man Meri Jaan,"
				+ " Singer Name : King, Duration: 4.0");
		System.out.println("3. Song Name :Jeena Jeena,"
				+ " Singer Name : Atif Aslam, Duration: 3.5");
		System.out.println("1. Song Name :Pathaan,"
				+ " Singer Name : Arijit Singh, Duration: 3.0");
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Select Song to Play :");
		int choose = sc1.nextInt();
		switch (choose) {
		case 1: {
			System.out.println("Kesariya by Arijit Singh is Playing now...");
			break;
		}
		case 2: {
			System.out.println("Man Meri Jaan by King is Playing now...");
			break;
		}
		case 3: {
			System.out.println("Jeena Jeena by Atif Aslam is Playing now...");
			break;
		}
		case 4: {
			System.out.println("Pathaan by Arijit Singh is Playing now...");
			break;
		}
		default:
			System.out.println("Enter Valid Song No ");
			playList();
		}
		backMenu();
	}
	
}