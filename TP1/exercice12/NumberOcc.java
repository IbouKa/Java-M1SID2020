package exercice12;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberOcc{
	/*
	 * Cette methode retourne le nombre d'apparition d'un caractére dans une chaine string
	 * arguments: chaine s et caractére c
	 */
	public static int getNbOcc(String s,char c) {
		int nb=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==c)
				nb+=1;
		};
		return nb;
	};
	
	public static void afficheNbOcc(String s,char c){
		System.out.println("Le nombre d'occurence de "+c+" est  :"+NumberOcc.getNbOcc(s,c));
	};
	/*
	 * Cette méthode vérifie l'existance d'un caractére dans un tableau de caractére
	 * retourne un boolean
	 */
	public static boolean existeEl(char[] tab, char val) {
        boolean b = false;
        for(char i : tab){
            if(i == val){
                b = true;
                break;
            }
        }
        return b;
    }
	/*
	 * Cette méthode retourne le nombre des voyelles qui apparaissent dans une chaine string
	 */
	public static int getNbVoy(String s) {
		int nb=0;
		char[] voy=new char[6];
		voy[0]='a';
		voy[1]='o';
		voy[2]='i';
		voy[3]='u';
		voy[4]='e';
		voy[5]='y';
		
		char[] voyExiste=new char[6];
		int j=0;
		//Parcourir la chaine s
		for(int i=0;i<s.length();i++) {
			// verifier si l'element est dans le tableau de voyelle et n'est pas déja renseigné
			if( NumberOcc.existeEl(voy,s.charAt(i)) & !(NumberOcc.existeEl(voyExiste,s.charAt(i)))) {
				nb+=1;
				voyExiste[j]=s.charAt(i);
				j++;
			};
		};
		return nb;
	};
	public static void afficheNbVoy(String s){
		System.out.println("Le nombre de voyelle est :"+NumberOcc.getNbVoy(s));
	};
	

}
