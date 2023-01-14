

import java.util.*;

public class LetturaCl {
	public static String leggiSt(String mess) {
		Scanner in=new Scanner(System.in);
		System.out.print(mess);
		String s=in.nextLine();
		return s;
	}
	public static int leggiI(String mess) {
		Scanner in=new Scanner(System.in);
		System.out.println(mess);
		int s=in.nextInt();
		return s;
	}
	public static char leggiC(String mess) {
		Scanner in=new Scanner(System.in);
		System.out.println(mess);
		String s=in.nextLine();
		return s.charAt(0);
	}
	public static float leggiF(String mess) {
		Scanner in=new Scanner(System.in);
		System.out.println(mess);
		float s=in.nextFloat();
		return s;
	}
	public static boolean leggiB(String mess) {
		Scanner in = new Scanner(System.in);
		System.out.println(mess+"(S/N)");
		char c= in.nextLine().charAt(0);
		if(c=='S'|| c=='s')
			return true;
		return false;
	}
}

