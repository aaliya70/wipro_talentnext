package Arrays;
import java.util.*;
public class Array4{
	public static void main(String[] args) {
		int[] values = new int[52];
		int index=0;
		for(char ch='A'; ch<='Z';ch++) {
			values[index++]=(int) ch;
		}
		for(char ch ='a';ch<='z';ch++) {
			values[index++]=(int) ch;
		}
		for(int ascii : values) {
			System.out.print(ascii+" ");
		}
	}

}