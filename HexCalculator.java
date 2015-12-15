

import java.util.*;
import java.lang.*;
import java.io.*;



class HexCalculator{
	
	public static void main (String[] args) throws java.lang.Exception{
		HexCalculator(){
			baseNumATotal();
			baseNumATotal();
			ansDef();
		}
		Scanner input = new Scanner(System.in);
		final char[] HEXCHARS = {0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F};
		String ans;
		double baseAns;
		double[charNumA.length] baseNumAC;
		double[charNumB.length] baseNumBC;
		double baseNumA;
		double BaseNumB;
		//I like to predefine variables.
		//Also, this would be much easier in python, and that is why I'm doing it in java.
		//Makes no sense, right?
		//I like to overcomplicate things.
		
		System.out.println("Enter first number:");
		String numA = input.nextLine();
		
		System.out.println("Enter operation:");
		String oper = input.nextLine();
		
		System.out.println("Enter second number:");
		String numB = input.nextLine();
		
		char[] charNumA = numA.toCharArray();
		char[] charNumB = numB.toCharArray();
		
		switch(oper){
			case '+': baseAns = baseNumA + baseNumB;
				break;
			case '-': baseAns = baseNumA - baseNumB;
				break;
			case '*': baseAns = baseNumA * baseNumB;
				break;
			case '/': baseAns = baseNumA / baseNumB;
				break;
			case '^': baseAns = (Math.pow(baseNumA, baseNumB));
				break;
			case 'rt': baseAns = (Math.pow(baseNumA, 1/baseNumB));
				break;
			default: System.out.println("ERROR: INVALID INPUT");
				break;
		}
		//below is the loop that will turn a hexadecimal array to a decimal array for the
		//first number
		while(int counter=1;counter<=charNumA.length){
			switch(baseNumAC[counter]){
				case 0: baseNumAC[counter] = 0;
					break;
				case 1: baseNumAC[counter] = 1;
					break;
				case 2: baseNumAC[counter] = 2;
					break;
				case 3: baseNumAC[counter] = 3;
					break;
				case 4: baseNumAC[counter] = 4;
					break;
				case 5: baseNumAC[counter] = 5;
					break;
				case 6: baseNumAC[counter] = 6;
					break;
				case 7: baseNumAC[counter] = 7;
					break;
				case 8: baseNumAC[counter] = 8;
					break;
				case 9: baseNumAC[counter] = 9;
					break;
				case A: baseNumAC[counter] = 10;
					break;
				case B: baseNumAC[counter] = 11;
					break;
				case C: baseNumAC[counter] = 12;
					break;
				case D: baseNumAC[counter] = 13;
					break;
				case E: basenumAC[counter] = 14;
					break;
				case F: baseNumAC[counter] = 15;
					break;
				default: System.out.println("ERROR: INVALID CHARACTER: " + charNumA[counter]);
					break;
			}
			counter++
		}
		//below is the loop that will be used to conver a hexadecimal array to a decimal array
		//for the second number
		for(int counter=1;counter<=charNumB.length;counter++){
			switch(baseNumBC[counter]){
				case 0: baseNumBC[counter] = 0;
					break;
				case 1: baseNumBC[counter] = 1;
					break;
				case 2: baseNumBC[counter] = 2;
					break;
				case 3: baseNumBC[counter] = 3;
					break;
				case 4: baseNumBC[counter] = 4;
					break;
				case 5: baseNumBC[counter] = 5;
					break;
				case 6: baseNumBC[counter] = 6;
					break;
				case 7: baseNumBC[counter] = 7;
					break;
				case 8: baseNumBC[counter] = 8;
					break;
				case 9: baseNumBC[counter] = 9;
					break;
				case A: baseNumBC[counter] = 10;
					break;
				case B: baseNumBC[counter] = 11;
					break;
				case C: baseNumBC[counter] = 12;
					break;
				case D: baseNumBC[counter] = 13;
					break;
				case E: basenumBC[counter] = 14;
					break;
				case F: baseNumBC[counter] = 15;
					break;
				default: System.out.println("ERROR: INVALID CHARACTER: " + charNumB[counter]);
					break;
			}
		}
		double[] baseNumADigitHold1;
		double[] baseNumADigitHold2;
		for(int counter=1;counter<=baseNumAC.length;counter++){
			baseNumADigitHold1[counter] = (Math.pow(baseNumAC[counter], counter));
		}
		baseNumATotal(){
			for(int counter=1;counter<=baseNumAC.length;counter++){
				if(counter==1){
					baseNumADigitHold2[counter] = baseNumADigitHold1[counter];
				}else if(counter==baseNumAC.length){
					baseNumA = baseNumADigitHold2[counter-1] + 
					baseNumADigitHold1[counter];
				}else{
					baseNumADigitHold2[counter] = baseNumADigitHold2[counter-1] + 
					baseNumADigitHold1[counter];
				}
			}
			baseNumA = baseNumADigitHold2[baseNumAC.length];
			return baseNumA;
		}
		baseNumBTotal(){
			for(int counter=1;counter<=baseNumBC.length;counter++){
				if(counter==1){
					baseNumBDigitHold2[counter] = baseNumBDigitHold1[counter];
				}else if(counter==baseNumBC.length){
					baseNumB = baseNumBDigitHold2[counter-1] + 
					baseNumBDigitHold1[counter];
				}else{
					baseNumBDigitHold2[counter] = baseNumBDigitHold2[counter-1] + 
					baseNumBDigitHold1[counter];
				}
			}
			baseNumB = baseNumDigitHold2[baseNumBC.length];
			return baseNumB;
		}
		void ansDef(){
			int remainder;
			while(baseAns>0){
				remainder = baseAns % 16;
				ans = HEXCHARS[remainder] + str;
				baseAns = baseAns / 16;
			}
			System.out.println("Answer: " + ans);
			File output = new File("output.txt");
			output.createNewFile();
			FileWriter writer = new FileWriter(output);
			writer.write(ans);
			writer.flush();
			writer.close();
		}
	}
}
