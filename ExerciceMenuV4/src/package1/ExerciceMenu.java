package package1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ExerciceMenu {
		public static void main(String[] args) {
			menu();
		}
		
		public static void menu() {
			int choixUtilisateur = affichage();
			switch (choixUtilisateur) {
			case 1 :
				exercice1();
				break;
			case 2 :
				exercice2();
				break;
			case 3 :
				exercice3();
				break;
			case 4 : 
				exercice4();
				break;
			case 5 :
				exercice5();
				break;
			case 6 :
				exercice6();
				break;
			case 7 :
				exercice7();
				break;
			case 8 :
				exercice8();
				break;
			case 9 :
				exercice9();
				break;
			case 10 :
				exercice10();
				break;
			case 0 :
				System.out.println("fermeture du programme...");
				System.exit(0);
		 }
		}
		
		public static int affichage() {
			System.out.println("voici le menu du programme : ");
			System.out.println("tapez 1 pour l'exercice 1");
			System.out.println("tapez 2 pour l'exercice 2");
			System.out.println("tapez 3 pour l'exercice 3");
			System.out.println("tapez 4 pour l'exercice 4");
			System.out.println("tapez 5 pour l'exercice 5");
			System.out.println("tapez 6 pour l'exercice 6");
			System.out.println("tapez 7 pour l'exercice 7");
			System.out.println("tapez 8 pour l'exercice 8");
			System.out.println("tapez 9 pour l'exercice 9");
			System.out.println("tapez 10 pour l'exercice 10");
			System.out.println("tapez 0 pour fermer le programme");
			Scanner sc = new Scanner(System.in);
			int str = sc.nextInt();
			return str;
		}
		
		public static void exercice1() {
			System.out.println("je vais choisir un nombre entre 1 et 5, nous verrons si vous arrivez a trouver celui que j'ai choisi");
			Random r = new Random();
			int n = r.nextInt(5);
			System.out.println("Veuillez choisir un nombre entre 1 et 5 :");
			Scanner sc = new Scanner(System.in);
			while (true) {
				int str1 = sc.nextInt();
				if (n != str1) {
					System.out.println("Vous avez saisi le nombre : " + str1);
					System.out.println("désolé, il faut reessayer");
				}
				if (n == str1) {
					System.out.println("Vous avez saisi le nombre : " + str1);
					System.out.println("bravo");
					System.out.println("voulez vous reessayer? oui ou non ?");
					Scanner sc1= new Scanner(System.in);
					String stri1 = sc1.nextLine();
					if (stri1.equals("oui")) {
						exercice1();
					}
					if (stri1.equals("non")) {
						menu();
					}
				}
			}
		}
		public static void exercice2() {
			System.out.println("je vais choisir un nombre entre 10 et 20, nous verrons si vous arrivez a trouver celui que j'ai choisi");
			Random r2 = new Random();
			int n2 = r2.nextInt(20);
			System.out.println("Veuillez choisir un nombre entre 10 et 20 :");
			Scanner sc = new Scanner(System.in);
			while (true) {
				int str2 = sc.nextInt();
				System.out.println("Vous avez saisi le nombre : " + str2);
					if (n2 != str2) {
						System.out.println("désolé, il faut reessayer");
						if (str2 < 10) {
							System.out.println(": votre chiffre est au dessous de la borne minimale (10)");
						}
						if (str2 > 20) {
							System.out.println(": votre chiffre est au dessus de la borne maximal (20)");
						}
						if (str2 < 10 && str2 > 20) {
							System.out.println("ce chiffre n'est pas le bon");
						}
					}
					if (n2 == str2) {
						System.out.println("bravo");
						System.out.println("voulez vous reessayer? oui ou non ?");
						Scanner sc1= new Scanner(System.in);
						String stri1 = sc1.nextLine();
						if (stri1.equals("oui")) {
							exercice2();
						}
						if (stri1.equals("non")) {
							menu();
						}
					}
			}
		}
		public static void exercice3() {
			System.out.println("choisir un chiffre et je vous indique les 10 suivants :");
			Scanner sc = new Scanner(System.in);
			int str3 = sc.nextInt();
			System.out.println("vous avez choisi ce chiffre : " + str3);
			int a2 = str3 + 1;
			int b2 = str3 + 2;
			int c2 = str3 + 3;
			int d2 = str3 + 4;
			int e2 = str3 + 5;
			int f2 = str3 + 6;
			int g2 = str3 + 7;
			int h2 = str3 + 8;
			int i2 = str3 + 9;
			int j2 = str3 + 10;
			System.out.println("votre chiffre : " + str3 + " " + "et les dix suivants :" + " " + a2 + " " + b2 + " "
					+ c2 + " " + d2 + " " + e2 + " " + f2 + " " + g2 + " " + h2 + " " + i2 + " " + j2 + ".");
			System.out.println("voulez vous reessayer? oui ou non ?");
			Scanner sc1= new Scanner(System.in);
			String stri1 = sc1.nextLine();
			if (stri1.equals("oui")) {
				exercice3();
			}
			if (stri1.equals("non")) {
				menu();
			}
		}
		public static void exercice4() {
			System.out.println("choisir un chiffre et je vous indique les 10 suivants :");
			Scanner sc = new Scanner(System.in);
			int str4 = sc.nextInt();
			int chiffre[] = { str4 };
			int a3 = str4 + 1;
			int b3 = str4 + 2;
			int c3 = str4 + 3;
			int d3 = str4 + 4;
			int e3 = str4 + 5;
			int f3 = str4 + 6;
			int g3 = str4 + 7;
			int h3 = str4 + 8;
			int i3 = str4 + 9;
			int j3 = str4 + 10;
			for (int n3 = 0; n3 < chiffre.length; n3++) {
				System.out.println("vous avez choisi ce chiffre : " + str4);
				System.out.println("votre chiffre : " + str4 + " " + "et les dix suivants :" + " " + a3 + " " + b3 + " " + c3 + " " + d3 + " " + e3 + " " + f3 + " " + g3 + " " + h3 + " " + i3 + " " + j3 + ".");	
				System.out.println("voulez vous reessayer? oui ou non ?");
			Scanner sc1= new Scanner(System.in);
			String stri1 = sc1.nextLine();
			if (stri1.equals("oui")) {
				exercice4();
			}
			if (stri1.equals("non")) {
				menu();
			}
			}
	    }
		public static void exercice5() {
			System.out.println("choisir un chiffre et je vous indiquerais sa table de multiplication jusqu'a 10 :");
			Scanner sc = new Scanner(System.in);
			int str5 = sc.nextInt();
			int a4 = str5 * 1;
			int b4 = str5 * 2;
			int c4 = str5 * 3;
			int d4 = str5 * 4;
			int e4 = str5 * 5;
			int f4 = str5 * 6;
			int g4 = str5 * 7;
			int h4 = str5 * 8;
			int i4 = str5 * 9;
			int j4 = str5 * 10;
			System.out.println("vous avez choisi le chiffre :" + str5);
			System.out.println("voici sa table de multiplication");
			System.out.println(str5 + "*1 = " + a4);
			System.out.println(str5 + "*2 = " + b4);
			System.out.println(str5 + "*3 = " + c4);
			System.out.println(str5 + "*4 = " + d4);
			System.out.println(str5 + "*5 = " + e4);
			System.out.println(str5 + "*6 = " + f4);
			System.out.println(str5 + "*7 = " + g4);
			System.out.println(str5 + "*8 = " + h4);
			System.out.println(str5 + "*9 = " + i4);
			System.out.println(str5 + "*10 = " + j4);
			System.out.println("voulez vous reessayer? oui ou non ?");
			Scanner sc1= new Scanner(System.in);
			String stri1 = sc1.nextLine();
			if (stri1.equals("oui")) {
				exercice5();
			}
			if (stri1.equals("non")) {
				menu();
			}
		}
		public static void exercice6() {
			System.out.println("choisir un chiffre et je vous indiquerais la somme de ses entiers positifs :");
			int s = 1;
			Scanner sc= new Scanner(System.in);
			int str6 = sc.nextInt();
			for (int i = 0; i < str6; i++) {
				s = s + i;
				System.out.println("vous avez choisi" + str6);
				System.out.println("voici la somme de ses entiers positifs" + s);
			}
			System.out.println("voulez vous reessayer? oui ou non ?");
			Scanner sc1= new Scanner(System.in);
			String stri1 = sc1.nextLine();
			if (stri1.equals("oui")) {
				exercice6();
			}
			if (stri1.equals("non")) {
				menu();
			}
		}
		public static void exercice7() {
			System.out.println("choisir un chiffre et je vous indiquerais la somme de ses entiers positifs :");
			Scanner sc= new Scanner(System.in);
			int str7 = sc.nextInt();
			System.out.println("vous avez choisi" + str7);
			if (str7 != 0) {
				for (int i = str7 - 1; i >= 1; i--) {
					str7 = str7 * i;
					System.out.println("la factorielle est" + str7);
				}
			} else 
				str7=1;
				System.out.println("la factorielle est" + str7);
				System.out.println("voulez vous reessayer? oui ou non ?");
			Scanner sc1= new Scanner(System.in);
			String stri1 = sc1.nextLine();
			if (stri1.equals("oui")) {
				exercice7();
			}
			if (stri1.equals("non")) {
				menu();
			}
		}
		public static void exercice8() {
			System.out.println("choisir 20 chiffres et je vous dirais lequels est le plus grand");
			int a = 0;
			int tableauChiffres[]  = new int[20];
			int grandChiffre = 0;
			while (a<=21) {
				Scanner sc= new Scanner(System.in);
				int str8= sc.nextInt();
				tableauChiffres[a] = str8;
				System.out.println("votre chiffre " + a + " est " + str8);
				if (grandChiffre < str8) {
					grandChiffre = str8;
				}
				a++;
			if (a==21) {
				System.out.println("votre tableau de chiffres :" + Arrays.toString(tableauChiffres));
				System.out.println("le plus grand chiffre de vos choix est :" + grandChiffre);
				System.out.println("voulez vous reessayer? oui ou non ?");
				Scanner sc1= new Scanner(System.in);
				String stri1 = sc1.nextLine();
				if (stri1.equals("oui")) {
					exercice8();
				}
				if (stri1.equals("non")) {
					menu();
				}
			}
				
				
			}
			
		}
		public static void exercice9() {
			System.out.println("choisir des chiffres et je vous dirais lequels est le plus grand");
			System.out.println("tapez '0' pour terminer");
			int a = 0;
			ArrayList<Integer> tableauChiffres = new ArrayList<Integer>();
			int grandChiffre = 0;
			Scanner sc= new Scanner(System.in);
			while (true) {
				int str9= sc.nextInt();
				tableauChiffres.add(str9);
				System.out.println("votre chiffre " + a + " est " + str9);
				if (grandChiffre < str9) {
					grandChiffre = str9;
				}
				a++;
			if (str9 == 0) {
				System.out.println("votre tableau de chiffres :" + tableauChiffres);
				System.out.println("le plus grand chiffre de vos choix est :" + grandChiffre);
				System.out.println("voulez vous reessayer? oui ou non ?");
				Scanner sc1= new Scanner(System.in);
				String stri1 = sc1.nextLine();
				if (stri1.equals("oui")) {
					exercice9();
				}
				if (stri1.equals("non")) {
					menu();
				}
			}	
			}
		}
		public static void exercice10() {
			System.out.println("comme une caisse :");
			System.out.println("je vais calculez la somme que vous devez et la somme que l'on doit vous rendre");
			int somres = 0;
			int sompos = 0;
			int somdu = 0;
			int a = 0;
			int b = 0;
			int c = 0;
			System.out.println("tapez la somme que vous possedez");
			Scanner sc= new Scanner(System.in);
			int str10= sc.nextInt();
			sompos = str10;
			System.out.println("vous possedez : " + str10 + "euros");
			System.out.println("tapez le prix des articles que vous avez choisi et finissez par 0");
			Scanner sc1= new Scanner(System.in);
			int str11= sc1.nextInt();
			while (str11 > 0) {
				somdu = str11+somdu;	
			}
			if (str11 == 0) {
				somres = sompos-somdu;
				System.out.println("il va vous rendre" + somres);
				while (somres >= 10) {
					somres -= 10;
					a+=1;
					while (4<somres && somres<10) {
						somres-=5;
						b+=1;
						while (0<somres && somres<5) {
							somres -= 1;
							c+=1;	
						}
					}
			    }
				System.out.println("on va vous rendre " + a + " billets de 10 " + b + " billet de 5 " + c + " pieces de 1");
				System.out.println("voulez vous reessayer? oui ou non ?");
				Scanner sc3= new Scanner(System.in);
				String stri1 = sc3.nextLine();
				if (stri1.equals("oui")) {
					exercice10();
				}
				if (stri1.equals("non")) {
					menu();
				}
			}
		}
		public static void exercice11() {
			System.out.println("je vais calculer vos chances de gagner aux tierce, quinté et autres impots volontaires");
			System.out.print("tapez le nombre de chevaux en course");
			int a = 1;
			int b = 1;
			int c = 1;
			int nbrChev=1;
			int chevJoue=1;
			Scanner sc= new Scanner(System.in);
			int str11= sc.nextInt();
			nbrChev = str11;
			Scanner sc1= new Scanner(System.in);
			int str12= sc1.nextInt();
			chevJoue = str12;
			int i = 2;	
		}
}