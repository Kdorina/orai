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
		System.out.println("allitas ? ertek_ha_igaz: ertek_ha_hamis");
		Scanner sc = new Scanner(System.in);
		
		int szam = sc.nextInt();
		String uzenet = (szam > 0)? "Pozitiv" : "Nulla vagy negetiv";
		System.out.println("Eredmeny: " + uzenet);
		
	}
}
