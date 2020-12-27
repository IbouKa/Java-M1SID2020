package Num;

public class NumberOcc {
	
	 
		  private static String s;
		  private static char c;

		  public static int getNbOcc(String s, char c) {
		    int size = s.length();
		    int count = 0;
		    for (int i = 0; i < size; i++) {
		      if (s.charAt(i) == c)
		        count++;
		    }
		    return count;
		  }
		  
		  public static void afficheNbOcc() {
		    System.out.println(NumberOcc.getNbOcc(s, c));
		  }
		  
		  public static int getNbVoy(String s) {
		    int size = s.length();
		    int count = 0;
		    for (int i = 0; i < size; i++) {
		      String voy = "aoiueéèê";
		      for (int j = 0; j < voy .length(); j++) {
		        if (s.charAt(i) == voy.charAt(j))
		          count ++;
		      }
		    }
		    return count;
		  }

		  public static void afficheNbVoy() {
		    System.out.println(NumberOcc.getNbVoy(s));
		  }

		  public static void main(String[] args) {
		    s = "abdoulazizfffaa";
		    c = 'a';
		    NumberOcc.afficheNbOcc();
		    NumberOcc.afficheNbVoy();
		  }

}


