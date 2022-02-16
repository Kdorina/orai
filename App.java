/*
* File: App.java
* Author: Kovács Dorina
* Copyright: 2022, Kovács Dorina
* Group: Szoft I/N
* Date: 2021-02-16
* Github: https://github.com/Kdorina/
* Licenc: GNU GPL
*/
import java.util.Scanner;

class App{
	public static void main(String[] args){
		System.out.println("Kovacs Dorina, 2022-02-16, Szoft I N");
		System.out.println("Irassuk ki a szamokat betuvel");
		Scanner sc = new Scanner(System.in);

		System.out.print("Szam 1-10-ig: ");
		int szam = sc.nextInt();
		if (szam <1 || szam> 12){
			System.out.print("Nem megfelelo szam");
			System.exit(0);
			
			}
		switch(szam){
			case 1:
				System.out.println("egy");
				break;
			case 2:
				System.out.println("ketto");
				break;
			case 3:
				System.out.println("harom");
				break;
			case 4:
				System.out.println("negy");
				break;
			case 5:
				System.out.println("ot");
				break;
			case 6:
				System.out.println("hat");
				break;
			case 7:
				System.out.println("het");
				break;
			case 8:
				System.out.println("nyolc");
				break;
			case 9:
				System.out.println("kilenc");
				break;
			case 10:
				System.out.println("tiz");
				break;
			}
		
		}
}
