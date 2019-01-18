package javabasic;

import java.util.Arrays;

public class ProgramingLogic {

	static char[][] battleboard = new char[10][10];
	
	
	
	public static void buildBattleboard() {
		
		for(char [] row: battleboard) {
			
			Arrays.fill(row,'*');
			
		}
	}

}
