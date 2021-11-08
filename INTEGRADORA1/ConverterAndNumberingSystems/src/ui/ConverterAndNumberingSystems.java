
package ui;

import java.util.Scanner;
import java.lang.Math;
/**
* Descripción:In this class you will find all the code of the system that serves as a converter and converter of numbers (bin, hex, dec)<br>

*/
public class ConverterAndNumberingSystems{
	
		
		static int [] binary;
		static int [] decimal;
		static String [] HexaDecimal;
		static int [] BinaryCalculator1;
		static int [] BinaryCalculator2;
		static String [] binaryMultiplication;
		
		
		static Scanner sc = new Scanner (System.in);
	 /**
    * Descripción: This method is used to call the main menu and start </br>
	* @param args[] String
    */
	public static void main(String[]args){
		homeMenu();
	}
	/**
    * Descripción: This method executes the main menu of the calculator and numbering system converter. It also calls the conversion menu and binary calculator menu methods. </br>

    */
	public static void homeMenu(){ 
		
		

		
		boolean leave = false;
		while (!leave){
			System.out.println("------------------------------------------------------------------------------------------------------------------------");
			System.out.println("CALCULATOR OR CONVERTER OF ENUMERATION SYSTEMS");
			System.out.println(" ");
			System.out.println("Then select what you want to do:");
			System.out.println(" ");
			System.out.println("1.Select the binary calculator");
			System.out.println("2.Select the converter between numbering systems");
			System.out.println("0.Exit");
			System.out.println("------------------------------------------------------------------------------------------------------------------------");
			int answerMenu = sc.nextInt();
			if(answerMenu==1){
				menuCalculator();
			}
			if(answerMenu==2){
				menuConverter();
			}
			if (answerMenu==0){
				leave=true;
			}	
			if (answerMenu!=0 && answerMenu!=1 && answerMenu!=2){
				System.out.println("! Please enter a number that appears on the screen!");
			}
		}	
	}
	/**
    * Descripción:This method serves as a menu to select the type of enumeration system and pass it to the other systems, in this method the validation methods and the conversion methods are called.</br>

    */
	public static void menuConverter(){
		Scanner sc = new Scanner (System.in);
		boolean leave = false;
		while (!leave){
			System.out.println("------------------------------------------------------------------------------------------------------------------------");
			System.out.println("Then select what type of system you want to use:");
			System.out.println(" ");
			System.out.println("1.Binary");
			System.out.println("2.decimal");
			System.out.println("3.Hexadecimal");
			System.out.println("0.Back");
			System.out.println("------------------------------------------------------------------------------------------------------------------------");
			int answerMenu = sc.nextInt();
			if (answerMenu==1){
				System.out.print("Enter the number of digits you are going to enter:");
				int numberOfDigits = sc.nextInt();
				binary = new int[numberOfDigits];
				
				for (int veces = 0;veces<numberOfDigits;veces++){
					
					System.out.println("Enter the digit");
					int number = sc.nextInt();
					//validateBinary(number);
					if (validateBinary(number)==false){
						System.out.println("You have made a mistake typing the numbers, remember you cannot enter numbers that are not either 1 or 0, that's how the binary system is.");
						System.out.println("Also remember, digit by digit please");
						System.out.println("");
						System.out.println("");
						System.out.println("------------------------------------------------------------------------------------------------------------------------");
						System.out.println("RETURN TO THE HOME MENU");
						System.out.println("------------------------------------------------------------------------------------------------------------------------");
						veces=numberOfDigits;
						leave=true;
					}
					if (validateBinary(number)==true){
						binary[veces]=number;
					}
					
					
				}
				binarynumber(numberOfDigits);

				
			}
			if (answerMenu==2){
				System.out.print("Enter the number of digits you are going to enter:");
				int numberOfDigits = sc.nextInt();
				decimal = new int[numberOfDigits];
				for (int veces = 0;veces<numberOfDigits;veces++){
					
					System.out.println("Enter the digit");
					int number = sc.nextInt();
					//validateDecimal(number);
					if (validateDecimal(number)==false){
						System.out.println("You have made a mistake typing the numbers, remember you cannot enter numbers that are not from 0 to 9 that is the decimal system.");
						System.out.println("Also remember, digit by digit please");
						System.out.println("");
						System.out.println("");
						System.out.println("------------------------------------------------------------------------------------------------------------------------");
						System.out.println("RETURN TO THE HOME MENU");
						System.out.println("------------------------------------------------------------------------------------------------------------------------");
						veces=numberOfDigits;
						leave=true;
					}
					if (validateDecimal(number)==true){
						decimal[veces]=number;
					}
				}
				numberDecimal (numberOfDigits);

			}
			if (answerMenu==3){  
				System.out.print("Enter the number of digits you are going to enter:");
				int numberOfDigits = sc.nextInt();
				HexaDecimal = new String [numberOfDigits];
				
				for (int veces = 0;veces<numberOfDigits;veces++){
					
					System.out.println("Enter the digit");
					
					String number = sc.next().toUpperCase();
	
					
					//validateHexadecimal(number);
					
					if (validateHexadecimal(number)==false){
						System.out.println("You have made a mistake placing the numbers, remember you cannot enter numbers that are not from 0 to 9 or from A to F that is the hexadecimaldecimal system.");
						System.out.println("Also remember, digit by digit please");
						System.out.println("");
						System.out.println("");
						System.out.println("------------------------------------------------------------------------------------------------------------------------");
						System.out.println("RETURN TO THE HOME MENU");
						System.out.println("------------------------------------------------------------------------------------------------------------------------");
						veces=numberOfDigits;
						leave=true;
					}
					if (validateHexadecimal(number)==true){
						HexaDecimal[veces]=number;

					}
					
				}
				 numberHexadecimal(numberOfDigits);

				
				
			}
			if (answerMenu==0){
				leave=true;
			}	
			if (answerMenu!=0 && answerMenu!=1 && answerMenu!=2 && answerMenu!=3){
				System.out.println("! Please enter a number that appears on the screen!");
			}
		}	
	}
	
	
	//---------------------------------------------------------------------------------CALCULADORA MENU PRINCIPAL---------------------------------------------------------------------------------
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	/**
    * Descripción: This method serves as a menu to enter the 2 binary numbers and select the operation you want to perform, in this method the method of validation of binaries and the method of the operation to be performed is called.</br>

    */
	public static void menuCalculator(){
		String binaryNum="";
		boolean leave = false;
		while (!leave){
			System.out.print("Enter the number of digits you are going to enter for the first number:");
			int numberOfDigits = sc.nextInt();
			BinaryCalculator1 = new int[numberOfDigits];
					
			for (int veces = 0;veces<numberOfDigits;veces++){
						
				System.out.println("Enter the digit");
				int number = sc.nextInt();
				//validateBinary(number);
				if (validateBinary(number)==false){
					System.out.println("You have made a mistake typing the numbers, remember you cannot enter numbers that are not either 1 or 0, that's how the binary system is.");
					System.out.println("Also remember, digit by digit please");
					System.out.println("");
					System.out.println("");
					System.out.println("------------------------------------------------------------------------------------------------------------------------");
					System.out.println("RETURN TO THE HOME MENU");
					System.out.println("------------------------------------------------------------------------------------------------------------------------");
					
					leave=true;
					veces=numberOfDigits;
				}
				if (validateBinary(number)==true){
					BinaryCalculator1[veces]=number;
				}
						
						
			}
			
			
			if (leave==false){
				System.out.print("Enter the number of digits you are going to enter for the second number:");
				int numberOfDigits2 = sc.nextInt();
				BinaryCalculator2 = new int[numberOfDigits2];
						
				for (int veces = 0;veces<numberOfDigits2;veces++){
							
					System.out.println("Enter the digit");
					int number2 = sc.nextInt();
					validateBinary2(number2);
					if (validateBinary2(number2)==false){
						System.out.println("You have made a mistake typing the numbers, remember you cannot enter numbers that are not either 1 or 0, that's how the binary system is.");
						System.out.println("Also remember, digit by digit please");
						System.out.println("");
						System.out.println("");
						System.out.println("------------------------------------------------------------------------------------------------------------------------");
						System.out.println("RETURN TO THE HOME MENU");
						System.out.println("------------------------------------------------------------------------------------------------------------------------");
						leave=true;
						veces=numberOfDigits2;
						
					}
					if (validateBinary2(number2)==true){
						BinaryCalculator2[veces]=number2;
					}
							
							
				}
				

				if (leave==false){
					System.out.println("------------------------------------------------------------------------------------------------------------------------");
					System.out.println("Then select what type of operation you want to perform between the 2 numbers");
					System.out.println(" ");
					System.out.println("IMPORTANT: Keep in mind that the first number would be (a) and the second (b)");
					System.out.println(" ");
					System.out.println("1.Sum (a + b)");
					System.out.println("2. Subtraction (a-b)");
					System.out.println("3.Multiplication (a*b)");
					System.out.println("4.Division (a/b)");
					System.out.println("0.Back");
					System.out.println("------------------------------------------------------------------------------------------------------------------------");
					System.out.println("Choose:");
					int answerMenu = sc.nextInt();
					if (answerMenu==1){
						System.out.println("------------------------------------------------------------------------------------------------------------------------");
						System.out.println("The result is :"+sum(numberOfDigits,numberOfDigits2));
						binaryNum=sum(numberOfDigits,numberOfDigits2);
						System.out.println("When converted to decimal is  "+calculatorConversor(binaryNum));
						System.out.println("------------------------------------------------------------------------------------------------------------------------");
					}
					if (answerMenu==2){
						
						System.out.println("------------------------------------------------------------------------------------------------------------------------");
						System.out.println("The result is :"+subtraction(numberOfDigits,numberOfDigits2));
						binaryNum=subtraction(numberOfDigits,numberOfDigits2);
						System.out.println("When converted to decimal is  "+calculatorConversor(binaryNum));
						System.out.println("------------------------------------------------------------------------------------------------------------------------");
					}
					if (answerMenu==3){
						System.out.println("------------------------------------------------------------------------------------------------------------------------");
						System.out.println("The result is :"+multiplication(numberOfDigits,numberOfDigits2));
						binaryNum=multiplication(numberOfDigits,numberOfDigits2);
						System.out.println("When converted to decimal is  "+calculatorConversor(binaryNum));
						System.out.println("------------------------------------------------------------------------------------------------------------------------");
						
						
					}
					if (answerMenu==4){
						System.out.println("------------------------------------------------------------------------------------------------------------------------");
						System.out.println("The result is :"+division(numberOfDigits,numberOfDigits2));
						binaryNum=division(numberOfDigits,numberOfDigits2);
						System.out.println("When converted to decimal is  "+calculatorConversor(binaryNum));
						System.out.println("------------------------------------------------------------------------------------------------------------------------");
						
					}
					if (answerMenu==0){
					leave=true;
					}	
					
				}
			}
			
			
			leave=true;
		}
	}

	
	
	//---------------------------------------------------------------------------VALIDADORES----------------------------------------------------------------------------------
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//--------------------VALIDA BIN---------------------------------------------------------------------------------------------------------------------------------------------------------
	/**
    * Descripción: This method is used to validate the binary number 1 in the calculator or to validate the binary number that is entered in the converter.</br>
    * @param number int, be a binary number
    * @return out boolean
	
    */
	public static boolean validateBinary(int number){
		boolean out=true;
		if (number/10!=0){
			out= false;
			}
		if (number!=0 && number!=1){
			out=false;
		}
		return out;
	}
	/**
    * Descripción: This method serves to validate the second binary number that is entered in the calculator.</br>
    * @param number2 int, be a binary number
    * @return out boolean
	
    */
	public static boolean validateBinary2(int number2){
		boolean out=true;
		if (number2/10!=0){
			out= false;
			}
		if (number2!=0 && number2!=1){
			out= false;
		}
		return out;
	}
	
	//-----------------------VALIDA DECI------------------------------------------------------------------------------------------------------------------------------------------------------
	/**
    * Descripción: This method serves to validate the decimal number that was entered for the number converter.</br>
    * @param number int, be a decimal number
    * @return out boolean

    */
	public static boolean validateDecimal(int number){
		boolean out=true;
		if (number/10!=0){
			out= false;
			}
		return out;
	}
	//------------------------VALIDA HEXA-----------------------------------------------------------------------------------------------------------------------------------------------------
	/**
    * Descripción: This method serves to validate the hexadecimal number that was entered for the number converter.</br>
    * @param number int, be a hexadecimal number
    * @return out boolean
	
    */
	public static boolean validateHexadecimal(String number){
		boolean out = false;
		
		
		String [] hexadecimalNumbersArray = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
		for(int j=0;j<16 && !out;j++){
			if(number.equals(hexadecimalNumbersArray[j])){
				out=true;
			}
			
		}
		
		return out;
		

	}
	//---------------------------------------------------------------------------------CONVERSORES---------------------------------------------------------------------------------
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//-------------------DE binary A HEXA Y DECI----------------------------------------------------------------------------------------------------------------------------------
	/**
    * Descripción: This method is used to convert the binary number that was entered to a decimal number and a hexadecimal number.</br>
    * @param numberOfDigits int, It is the number of digits of the number that I entered
    
    */
	public static void binarynumber(int numberOfDigits){
		//int accountant = 0; is not used
		int TotalBinaryNumber=0;
		int binarynumber=0;
		int potency;
		int position = numberOfDigits;
		for (int e = 0;e<numberOfDigits;e++){
			potency= (int) Math.pow(2,e);
			binarynumber = binary[position-1]*potency;
			TotalBinaryNumber+=binarynumber;
			position--;
			
		}
		System.out.println("RESULTS:");
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		System.out.println("IN decimal->");
		System.out.print("The number: ");
		for (int e=0;e<numberOfDigits;e++){
			System.out.print(binary[e]);
		}
		System.out.println(" in binary ");
		System.out.print(" when converted to decimal is " + TotalBinaryNumber);
		System.out.println(" ");
		//--------------------------------------------------------------------------------------
		int totalmodule;
		String hexadecimal = "";
		char[] Hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		while (TotalBinaryNumber > 0) {
			totalmodule = TotalBinaryNumber % 16;
			char characterHexadecimal = Hexa[totalmodule];
			hexadecimal = characterHexadecimal + hexadecimal;
			TotalBinaryNumber = TotalBinaryNumber / 16;
		}
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		System.out.println("IN HEXADECIMAL->");
		System.out.println(" and when going to hexadecimal it is " + hexadecimal);
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
	}
	//-------------------DE DECI A BIN Y A HEXA----------------------------------------------------------------------------------------------------------------------------------------------------------
	/**
    * Descripción: This method is used to convert the decimal number that was entered to a binary number and a hexadecimal number.
    * @param numberOfDigits int, It is the number of digits of the number that I entered
    */
	public static void numberDecimal (int numberOfDigits){
		int totalDecimalNumber=0;
		int numberDecimal =0;
		int potencyOf10;
		int position = numberOfDigits;
		for(int e=0;e<numberOfDigits;e++){
			potencyOf10= (int) Math.pow(10,e);
			numberDecimal =decimal[position-1]*potencyOf10;
			totalDecimalNumber+=numberDecimal ;
			
			position--;
		}

		int totalmodule;
		String hexadecimal = "";
		char[] Hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		while (totalDecimalNumber > 0) {
			totalmodule = totalDecimalNumber % 16;
			char characterHexadecimal = Hexa[totalmodule];
			hexadecimal = characterHexadecimal + hexadecimal;
			totalDecimalNumber = totalDecimalNumber / 16;
		}
		System.out.println("RESULTS:");
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		System.out.println("IN HEXADECIMAL->");
		System.out.print("The number: ");
		for (int x = 0;x<numberOfDigits;x++){
			System.out.print(decimal[x]);
		}
		System.out.println(" en decimal ");
		System.out.print(" when converted to decimal is " + hexadecimal);
		System.out.println(" ");
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		//------------------------------------------------------------------
		totalDecimalNumber=0;
		numberDecimal =0;
		potencyOf10=0;
		position = numberOfDigits;
		for(int e=0;e<numberOfDigits;e++){
			potencyOf10= (int) Math.pow(10,e);
			numberDecimal =decimal[position-1]*potencyOf10;
			totalDecimalNumber+=numberDecimal ;
			
			position--;
		}
		//--------------------------------------------------------------------
		String binary = "";
		while (totalDecimalNumber > 0) {
			binary = totalDecimalNumber % 2 + binary;
			totalDecimalNumber = totalDecimalNumber / 2;
		}
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		System.out.println("IN BINARY->");
		System.out.println(" and when going to binary it is " + binary);
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		
		
	}
	//---------------------------DE HEXA A BIN Y DECI--------------------------------------------------------------------------------------------------------------------------------------------------
	/**
    * Descripción: This method is used to convert the hexadecimal number that was entered to a binary number and a decimal number.</br>
    * @param numberOfDigits int, It is the number of digits of the number that I entered
 
    */
	public static void  numberHexadecimal(int numberOfDigits){
		//int accountant = 0; is not used
		int totalNumberHexadecimal=0;
		int  numberHexadecimal=0;
		int potency;
		int position = numberOfDigits;
		int numberOfHEXA=0;
		for (int e = 0;e<numberOfDigits;e++){
			potency= (int) Math.pow(16,e);
			if (HexaDecimal[position-1].equals("0")){
				numberOfHEXA=0;
			}
			if (HexaDecimal[position-1].equals("1")){
				numberOfHEXA=1;
			}
			if (HexaDecimal[position-1].equals("2")){
				numberOfHEXA=2;
			}
			if (HexaDecimal[position-1].equals("3")){
				numberOfHEXA=3;
			}
			if (HexaDecimal[position-1].equals("4")){
				numberOfHEXA=4;
			}
			if (HexaDecimal[position-1].equals("5")){
				numberOfHEXA=5;
			}
			if (HexaDecimal[position-1].equals("6")){
				numberOfHEXA=6;
			}
			if (HexaDecimal[position-1].equals("7")){
				numberOfHEXA=7;
			}
			if (HexaDecimal[position-1].equals("8")){
				numberOfHEXA=8;
			}
			if (HexaDecimal[position-1].equals("9")){
				numberOfHEXA=9;
			}
			if (HexaDecimal[position-1].equals("A")){
				numberOfHEXA=10;
			}
			if (HexaDecimal[position-1].equals("B")){
				numberOfHEXA=11;
			}
			if (HexaDecimal[position-1].equals("C")){
				numberOfHEXA=12;
			}
			if (HexaDecimal[position-1].equals("D")){
				numberOfHEXA=13;
			}
			if (HexaDecimal[position-1].equals("E")){
				numberOfHEXA=14;
			}
			if (HexaDecimal[position-1].equals("F")){
				numberOfHEXA=15;
			}
			
			 numberHexadecimal = numberOfHEXA*potency;
			totalNumberHexadecimal+= numberHexadecimal;
			position--;
			
		}
		System.out.println("RESULTS:");
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		System.out.println("IN decimal->");
		System.out.print("The number: ");
		for (int e=0;e<numberOfDigits;e++){
			System.out.print(HexaDecimal[e]);
		}
		System.out.println(" en hexadecimal ");
		System.out.print(" when converted to decimal is " + totalNumberHexadecimal);
		System.out.println(" ");
		//---------------------------------------------------------------------------------------------
		
		String binary = "";
		while (totalNumberHexadecimal > 0) {
			binary = totalNumberHexadecimal % 2 + binary;
			totalNumberHexadecimal = totalNumberHexadecimal / 2;
		}
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		System.out.println("IN BINARY->");
		System.out.println(" and when going to binary it is " + binary);
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
	}
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------CALULADORAS PARA LOS BINARIOS---------------------------------------------------------------
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	/**
    * Descripción: This method is in charge of receiving the number of digits of the first number and the number of digits of the second number and making a typical sum (first number + second number)
	* @param numberOfDigits int
	* @param numberOfDigits2 int
    * @return sum String ,This is the result of the sum.
    */
	public static String sum(int numberOfDigits,int numberOfDigits2){
		
		char carry='0';
		
		//int result; is not used
		String sum=" ";
		int position1=0;
		int position2=0;
		int numberCyclesCalculator=0;
		
		//int potency=0; is not used
		
		int unlimitedPosition1=numberOfDigits;
		int unlimitedPosition2=numberOfDigits2;
		
		if (numberOfDigits<numberOfDigits2){
			numberCyclesCalculator=numberOfDigits2;
			
		}
		if(numberOfDigits>=numberOfDigits2){
			numberCyclesCalculator=numberOfDigits;
			
		}
		for(int s=0;s<numberCyclesCalculator;s++){
			position1=unlimitedPosition1;
			position2=unlimitedPosition2;
			
			if (position1>0 && position2>0){
				if (BinaryCalculator1[position1-1]==0 && BinaryCalculator2[position2-1]==0){
					if(carry=='0'){
						sum="0"+sum;
						
					}else{
						if(carry=='1'){
						
							sum="1"+sum;
							carry='0';
						}
					}
					
				}
				if ((BinaryCalculator1[position1-1]==1 && BinaryCalculator2[position2-1]==0)||(BinaryCalculator1[position1-1]==0 && BinaryCalculator2[position2-1]==1)){
					if(carry=='0'){
						sum="1"+sum;
						
					}else{
						if(carry=='1'){
							carry='1';
							sum="0"+sum;
						}
					}
				}
				
				if (BinaryCalculator1[position1-1]==1 && BinaryCalculator2[position2-1]==1){
					if(carry=='0'){
						carry='1';
						sum="0"+sum;
						
					}else{
						if(carry=='1'){
						
							sum="1"+sum;
							carry='1';
						}
					}
					
				}
				unlimitedPosition1--;
				unlimitedPosition2--;
			}

			if (position1>0 && position2==0){
				
				if (BinaryCalculator1[position1-1]==0){
					if(carry=='0'){
						sum="0"+sum;
						
					}else{
						carry='0';
						sum="1"+sum;
					}
						
					
				}

				if (BinaryCalculator1[position1-1]==1){
					if(carry=='0'){
						sum="1"+sum;
						
					}else{
						carry='1';
						sum="0"+sum;
					}
						
				}
				
				unlimitedPosition1--;
			}

			
			
			if (position2>0 && position1==0){
				if (BinaryCalculator2[position2-1]==0){
					if(carry=='0'){
						sum="0"+sum;
						
					}else{
						
						sum="1"+sum;
					}
						
					
				}
				if (BinaryCalculator2[position2-1]==1){
					if(carry=='0'){
						sum="1"+sum;
						
					}else{
						carry='1';
						sum="0"+sum;
					}
						
				}
				
				
				unlimitedPosition2--;
			}
					
			
		}
		if (carry=='1'){
			sum= carry+sum;
		}
		
		return sum;
	}
	/**
    * Descripción:This method is responsible for receiving the number of digits of the first number and the number of digits of the second number and perform a subtraction type (first number-second number)</br>
    * @param numberOfDigits int
	* @param numberOfDigits2 int
    * @return subtraction String,This is the result of the subtraction.
    */
	public static String subtraction(int numberOfDigits,int numberOfDigits2){
		String subtraction="";
				
		char negativeCarry='0';
		
		//int result; is not used
		
		int position1=0;
		int position2=0;
		int numberCyclesCalculator=0;
		
		//int potency=0; is not used
		
		int unlimitedPosition1=numberOfDigits;
		int unlimitedPosition2=numberOfDigits2;
		
		if (numberOfDigits<numberOfDigits2){
			numberCyclesCalculator=numberOfDigits2;
			
		}
		if(numberOfDigits>=numberOfDigits2){
			numberCyclesCalculator=numberOfDigits;
			
		}
		for(int s=0;s<numberCyclesCalculator;s++){
			position1=unlimitedPosition1;
			position2=unlimitedPosition2;
			
			if (position1>0 && position2>0){
				if (BinaryCalculator1[position1-1]==0 && BinaryCalculator2[position2-1]==0){
					if(negativeCarry=='0'){
						subtraction="0"+subtraction;
						
					}else{
						if(negativeCarry=='1'){
						
							subtraction="1"+subtraction;
							negativeCarry='1';
						}
					}
					
				}
				if (BinaryCalculator1[position1-1]==1 && BinaryCalculator2[position2-1]==0){
					if(negativeCarry=='0'){
						subtraction="1"+subtraction;
						
					}else{
						
						if(negativeCarry=='1'){
							
							negativeCarry='0';
							subtraction="0"+subtraction;
						}
					}
				}
				if (BinaryCalculator1[position1-1]==0 && BinaryCalculator2[position2-1]==1){
					if(negativeCarry=='0'){
						subtraction="1"+subtraction;
						negativeCarry='1';
						
					}else{
						if(negativeCarry=='1'){
							
							subtraction="0"+subtraction;
							negativeCarry='1';
						}
					}
				}
				
				if (BinaryCalculator1[position1-1]==1 && BinaryCalculator2[position2-1]==1){
					if(negativeCarry=='0'){
						
						subtraction="0"+subtraction;
						
					}else{
						if(negativeCarry=='1'){
						
							subtraction="1"+subtraction;
							negativeCarry='1';
						}
					}
					
				}
				unlimitedPosition1--;
				unlimitedPosition2--;
			}
		
			if (position1>0 && position2==0){
				
				if (BinaryCalculator1[position1-1]==0){
					if(negativeCarry=='0'){
						subtraction="0"+subtraction;
						
					}else{
						negativeCarry='1';
						subtraction="1"+subtraction;
					}
						
					
				}
		
				if (BinaryCalculator1[position1-1]==1){
					if(negativeCarry=='0'){
						subtraction="1"+subtraction;
						
					}else{
						negativeCarry='0';
						subtraction="0"+subtraction;
					}
						
				}
				
				unlimitedPosition1--;
			}
	
			
			
			if (position2>0 && position1==0){
				if (BinaryCalculator2[position2-1]==0){
					if(negativeCarry=='0'){
						subtraction="0"+subtraction;
						
					}else{
						negativeCarry='1';
						subtraction="1"+subtraction;
						
					}
						
					
				}
				if (BinaryCalculator2[position2-1]==1){
					if(negativeCarry=='0'){
						subtraction="1"+subtraction;
						negativeCarry='1';
						
					}else{
						if(negativeCarry=='1'){
						negativeCarry='1';
						subtraction="0"+subtraction;
						}
					}
						
				}
				
				
				unlimitedPosition2--;
			}

		}
		if (negativeCarry=='1'){
			subtraction= negativeCarry+subtraction;
		}
		
		return subtraction;
	
		
	}
	
	/**
    * Descripción:This method performs the multiplication of the 2 binaries, uses an array of String in which it stores each multiplication, and then makes the sum</br>
    * @param numberOfDigits int
	* @param numberOfDigits2 int
    * @return multiplication String,This is the result of the multiplication
    */
	public static String multiplication(int numberOfDigits,int numberOfDigits2){
		String multiplication="";
		
		
		
		binaryMultiplication = new String[numberOfDigits2];
		String numberBinArray="";
		String zeros="";
		int position1=0;
		
		
		int Countdown1Digit1=numberOfDigits-1;
		
		
		int Countdown1Digit2=numberOfDigits2-1;
		
		//Esta parte es para hacer solo las multiplicaciones
		for(int x=0;x<numberOfDigits2;x++){
			
			numberBinArray="";
			Countdown1Digit1=numberOfDigits-1;
			for(int a=0;a<numberOfDigits;a++){
				
				if(BinaryCalculator2[Countdown1Digit2]==0){
					numberBinArray="0"+numberBinArray;
					
				}
				if(BinaryCalculator2[Countdown1Digit2]==1){
					if(BinaryCalculator1[Countdown1Digit1]==0){
						numberBinArray="0"+numberBinArray;
					}
					if(BinaryCalculator1[Countdown1Digit1]==1){
						numberBinArray="1"+numberBinArray;
					}
					
					
				}
				
				Countdown1Digit1--;
				
			}
			if(x>0){
				zeros="0"+zeros;
			}
			
			numberBinArray=numberBinArray+zeros;
			binaryMultiplication[x]=numberBinArray;
			Countdown1Digit2--;
		}
		//------------------------------------------------------------------para ver los arreglos
		
		/*
		for(int i=0;i<numberOfDigits2;i++){
			System.out.println(binaryMultiplication[i]);
		}
		*/
		//---------------------------------------------------------------------------------sumatoria de todo
		/*int vecesNumBin1=0;
		String digit1="";
		String digit2="";
		int positionDigit1=0;
		int positionDigit2=0;
		
		
		if(numberOfDigits2>1){//por que si es mayor a 1 el numero de dedigitos del valorq eu multiplica pues no se hace suma
		
			for(int i=0;i<numberOfDigits2;i++){
				vecesNumBin2=binaryMultiplication[i+1].length();
				positionDigit1=vecesNumBin1;
				for(int e=0;e<vecesNumBin2;e++){
					digit1="";
					digit2="";
					
					digit1=binaryMultiplication[i].substring(positionDigit1-1,positionDigit1);
					digit1=binaryMultiplication[i+1].substring(positionDigit1-1,positionDigit1);
					
					positionDigit1--;
				}
				
				
			}
		}*/
		
		//----------------------------------------------------------------------PRUEBITAWS QUE NO SIRVEN
		String accumulated="";
		String testNumber="";
		String testNumber1="";
		String testNumber2="";
		
		int vecesNumeroPrueba=0;
		int TimesNumberTest1=0;
		int TimesNumberTest2=0;
		
		int positionDigit=0;
		int positionDigit1=0;
		int positionDigit2=0;
		
		String digit="";
		String digit1="";
		String digit2="";
		
		int accountant1=0;
		int counterFirstSum=0;
		
		char carry='0';
		
		String accumulatorSum="";
		String accumulatorSumTotal="";
		
		for(int i =0;i<numberOfDigits2;i++){
			carry='0';
			//System.out.println("1 .EL ACUMULADO TOTAL QUE SE LLEVA ES :"+accumulatorSum);
			accountant1=0;
			
			//System.out.println("-------------------------------------------------------------------------------------");
			//testNumber=binaryMultiplication[i];
			if(counterFirstSum==0){
				testNumber1=binaryMultiplication[i];
				accumulatorSum=binaryMultiplication[i];
				counterFirstSum=1;
			}else{
				testNumber1=accumulatorSum;
			}
			if(i==numberOfDigits2-1){
				testNumber2="";
				multiplication=accumulatorSum;
				
			}else{
				testNumber2=binaryMultiplication[i+1];
			}
			
			
			//vecesNumeroPrueba=testNumber.length();
			TimesNumberTest1=testNumber1.length();
			TimesNumberTest2=testNumber2.length();
			
			//digit="";
			digit1="";
			digit2="";
			
			
			
			//System.out.println("el numero de Prueba es : "+testNumber+" Y el numero de digitos del numero de prueba es : "+vecesNumeroPrueba);
			//System.out.println("");
			//System.out.println("");
			
			//System.out.println("el numero de Prueba es : "+testNumber1+" Y el numero de digitos del numero de prueba es : "+TimesNumberTest1);
			//System.out.println("");
			//System.out.println("");
			
			if(testNumber2.equals("")){
				
			}else{
				//System.out.println("el numero de Prueba es : "+testNumber2+" Y el numero de digitos del numero de prueba es : "+TimesNumberTest2);
				//System.out.println("");
				//System.out.println("");
			}
			
			
			//positionDigit=vecesNumeroPrueba;
			positionDigit1=TimesNumberTest1;
			positionDigit2=TimesNumberTest2;
			//System.out.println("2 .EL ACUMULADO TOTAL QUE SE LLEVA ES :"+accumulatorSum);
			accumulatorSum="";
			
			for(int r=0;r<TimesNumberTest2;r++){
				
				if(positionDigit1==0){
					accountant1=1;
				}
				
				//digit="";
				digit1="";
				digit2="";
				
				//digit=testNumber.substring(positionDigit-1,positionDigit);
				if(accountant1==0){
					digit1=testNumber1.substring(positionDigit1-1,positionDigit1);
				}
				
				digit2=testNumber2.substring(positionDigit2-1,positionDigit2);
				
				//System.out.println("El digit numero "+(r+1)+" es "+digit);
				if(accountant1==0){
					//System.out.println("El digit numero "+(r+1)+" es "+digit1);
					
				}
				//System.out.println("El digit numero "+(r+1)+" es "+digit2);
				
				/*if(digit.equals("0")){
					System.out.println("------------------");
					System.out.println("El numero es un 0");
					System.out.println("------------------");
				}
				if(digit.equals("1")){
					System.out.println("------------------");
					System.out.println("El numero es un 1");
					System.out.println("------------------");
				}*/
				/*
				if(accountant1==0){
					if(digit1.equals("0")){
						System.out.println("------------------");
						System.out.println("El numero es un 0");
						System.out.println("------------------");
					}
					if(digit1.equals("1")){
						System.out.println("------------------");
						System.out.println("El numero es un 1");
						System.out.println("------------------");
					}
				}
				
				if(digit2.equals("0")){
					System.out.println("------------------");
					System.out.println("El numero es un 0");
					System.out.println("------------------");
				}
				if(digit2.equals("1")){
					System.out.println("------------------");
					System.out.println("El numero es un 1");
					System.out.println("------------------");
				}*/
				//-------------------------------------------SUMA
				if(accountant1==1){
					if(digit2.equals("0")){
						if(carry=='0'){
							accumulatorSum="0"+accumulatorSum;
							
						}else{
							if(carry=='1'){
								carry='0';
								accumulatorSum="1"+accumulatorSum;
							}
						}
						
					}
					if(digit2.equals("1")){
						if(carry=='0'){
							accumulatorSum="1"+accumulatorSum;
							
						}else{
							if(carry=='1'){
								carry='1';
								accumulatorSum="0"+accumulatorSum;
							}
						}
					}
				}else if(accountant1==0){
					if(digit1.equals("0") && digit2.equals("0")){
						if(carry=='0'){
							accumulatorSum="0"+accumulatorSum;
							
						}else{
							if(carry=='1'){
							
								accumulatorSum="1"+accumulatorSum;
								carry='0';
							}
						}
						
					}
					if((digit1.equals("0") && digit2.equals("1")) || (digit1.equals("1") && digit2.equals("0"))){
						if(carry=='0'){
							accumulatorSum="1"+accumulatorSum;
							
						}else{
							if(carry=='1'){
								carry='1';
								accumulatorSum="0"+accumulatorSum;
							}
						}
					}
					if(digit1.equals("1") && digit2.equals("1")){
						if(carry=='0'){
							carry='1';
							accumulatorSum="0"+accumulatorSum;
							
						}else{
							if(carry=='1'){
							
								accumulatorSum="1"+accumulatorSum;
								carry='1';
							}
						}
					}
					
					
				}
				
				//System.out.println("3 .EL ACUMULADO TOTAL QUE SE LLEVA ES :"+accumulatorSum);
				//-----------------------------------------------------------------------------------TERMINA SUMA
				
				
				
				//positionDigit--;
				positionDigit1--;
				positionDigit2--;
				
				
			}
			if (carry=='1'){
				accumulatorSum= carry+accumulatorSum;
			}
			//System.out.println("---------------------------------------------------------------------------------------------------------------------");
			//multiplication=accumulatorSum;
			//System.out.println("----------------------------salio------------------------------------"+accumulatorSum+"---------------------"+i);
		}
		//---------------------------------------------------------------------------------------------------
		
		
		
		
		return multiplication;
	}
		



	
	
	/**
    * Descripción:This method performs the division of the 2 binaries entered (I know that it was not allowed to make the change to decimal, do the operation and return it to binary, I do not expect this part to be evaluated)</br>
	* @param numberOfDigits int
	* @param numberOfDigits2 int
    * @return division String,This is the result of the division
    */
	public static String division(int numberOfDigits,int numberOfDigits2){
		String division="";
		String binary1="";
		String digitBi1="";
		String binary2="";
		String digitBi2="";
		int binaryInt1=0;
		int binaryInt2=0;
		int accountant1=0;
		int accountant2=0;
		accountant1=numberOfDigits-1;
		accountant2=numberOfDigits2-1;
		for(int a=0;a<numberOfDigits;a++){
			if(BinaryCalculator1[accountant1]==1){
				digitBi1="1";
			}
			if(BinaryCalculator1[accountant1]==0){
				digitBi1="0";
			}
			
			binary1=digitBi1+binary1;
			accountant1--;
		}
		for(int b=0;b<numberOfDigits2;b++){
			if(BinaryCalculator2[accountant2]==1){
				digitBi2="1";
			}
			if(BinaryCalculator2[accountant2]==0){
				digitBi2="0";
			}
			
			binary2=digitBi2+binary2;
			accountant2--;
		}
		binaryInt1=Integer.parseInt(binary1,2);
		binaryInt2=Integer.parseInt(binary2,2);
		int respuestaDivi=binaryInt1/binaryInt2;
		division=Integer.toString(respuestaDivi,2);

		return division;
	}
		/*
		String division="";
		String divisor="";
		String dividendo="";
		int accountant1=0;
		int accountant2=0;
		int contador3=0;
		accountant2=numberOfDigits-1;
		
		String acumuladoResta="";
		String acumuladoRestaSINCERO="";
		
		String digit1="";
		String digit2="";
		
		boolean uno=false;
		
		char carry='0';
		
		int posicionResta=0;
	
		for(int i=0;i<numberOfDigits2;i++){
				
			divisor=divisor+BinaryCalculator2[i];
			
		}
		for(int x=0;x<numberOfDigits;x++){
			dividendo=dividendo+BinaryCalculator1[x];
			if(accountant1==numberOfDigits2-1){
				//accountant2=x;
				posicionResta=divisor.length();
				acumuladoResta="";
				System.out.println("----------------------------------------------------");
				for(int e=0;e<numberOfDigits2;e++){
					digit1="";
					digit2="";
					
					if(posicionResta<numberOfDigits2){
						if(posicionResta==-1){
							digit1=dividendo.substring(posicionResta,posicionResta+1);
							digit2=divisor.substring(posicionResta,posicionResta+1);
						}else{
							digit1=dividendo.substring(posicionResta-1,posicionResta);
							digit2=divisor.substring(posicionResta-1,posicionResta);
						}
						
					}
					
					digit1=dividendo.substring(posicionResta-1,posicionResta);
					digit2=divisor.substring(posicionResta-1,posicionResta);
					
					//System.out.println("dividendo "+digit1);
					//--------------------------------------------------------------RESTA
					
					if(digit1.equals("0") && digit2.equals("0")){
						if(carry=='0'){
							
							acumuladoResta="0"+acumuladoResta;
							
						}else{
							if(carry=='1'){
							
								acumuladoResta="1"+acumuladoResta;
								carry='1';
							}
						}
						
					}
					if(digit1.equals("1") && digit2.equals("0")){
						if(carry=='0'){
							
							acumuladoResta="1"+acumuladoResta;
							
						}else{
							if(carry=='1'){
							
								acumuladoResta="0"+acumuladoResta;
								carry='0';
							}
						}
					}
					if(digit1.equals("0") && digit2.equals("1")){
						if(carry=='0'){
							carry='1';
							acumuladoResta="1"+acumuladoResta;
							
						}else{
							if(carry=='1'){
							
								acumuladoResta="0"+acumuladoResta;
								carry='1';
							}
						}
					}
					if(digit1.equals("1") && digit2.equals("1")){
						if(carry=='0'){
							
							acumuladoResta="0"+acumuladoResta;
							
						}else{
							if(carry=='1'){
							
								acumuladoResta="1"+acumuladoResta;
								carry='1';
							}
						}
					}
					
					
				
					//-----------------------------------------------------------------------------------------
					
					
					
					posicionResta--;
				}
				if(carry=='1'){
					acumuladoResta=carry+acumuladoResta;
				}
				dividendo="";
				System.out.println("----------------------------------------------------");
				
				accountant1=-1;
				
				
				for(int o=0;o<numberOfDigits2;o++){
					
					if(acumuladoResta.substring(o,o+1).equals("0")){
						
					}
					if(acumuladoResta.substring(o,o+1).equals("0") && uno==true){
						acumuladoRestaSINCERO="0"+acumuladoRestaSINCERO;
					}
					if(acumuladoResta.substring(o,o+1).equals("1")){
						
						acumuladoRestaSINCERO="1"+acumuladoRestaSINCERO;
						uno=true;
					}
					
				}
				
				
			}else{
				division="0"+division;
			}
			
			accountant1++;
			System.out.println(acumuladoRestaSINCERO+"-------------");
			
		}
		System.out.println(acumuladoRestaSINCERO+"-------------");
		System.out.println(dividendo);
		System.out.println(divisor);
		
		System.out.println("resultado "+division);
		return division;
	}*/
	/**
    * Descripción:This method is responsible for receiving a binary in a String response of the operation that the user selected (addition, subtraction, multiplication, division) and transforms it into decimal to return and print it.</br>
	* @param binaryNum String
	
    * @return calculatorConversor int,This is the result of the conversion of binary to decimal.
    */
	public static int calculatorConversor(String binaryNum){
	
		
		int numLengtheBin=binaryNum.length();
		
		int digit=0;
		
		int TotalBinaryNumber=0;
		int binarynumber=0;
		int potency;
		int position = numLengtheBin;

		for (int e = 0;e<numLengtheBin;e++){
			if(binaryNum.substring(position-1,position).equals("0")){
				digit=0;
			}
			if(binaryNum.substring(position-1,position).equals("1")){
				digit=1;
			}
			
			potency= (int) Math.pow(2,e);
			binarynumber = digit*potency;
			TotalBinaryNumber+=binarynumber;
			position--;
		}

		
		return TotalBinaryNumber;
		
	}

}

















/*String accumulated="";
		String testNumber="";
		String testNumber1="";
		String testNumber2="";
		
		int vecesNumeroPrueba=0;
		int TimesNumberTest1=0;
		int TimesNumberTest2=0;
		
		int positionDigit=0;
		int positionDigit1=0;
		int positionDigit2=0;
		
		for(int i =0;i<numberOfDigits2;i++){
			System.out.println("-------------------------------------------------------------------------------------");
			testNumber=binaryMultiplication[i];
			testNumber1=binaryMultiplication[i];
			testNumber2=binaryMultiplication[i+1];
			
			vecesNumeroPrueba=testNumber.length();
			TimesNumberTest1=testNumber1.length();
			TimesNumberTest2=testNumber2.length();
			
			String digit="";
			
			
			System.out.println("el numero de Prueba es : "+testNumber+" Y el numero de digitos del numero de prueba es : "+vecesNumeroPrueba);
			System.out.println("");
			System.out.println("");
			
			positionDigit=vecesNumeroPrueba;
			for(int r=0;r<vecesNumeroPrueba;r++){
				digit="";
				
				digit=testNumber.substring(positionDigit-1,positionDigit);
				System.out.println("El digit numero "+(r+1)+" es "+digit);
				
				
				if(digit.equals("0")){
					System.out.println("------------------");
					System.out.println("El numero es un 0");
					System.out.println("------------------");
				}
				if(digit.equals("1")){
					System.out.println("------------------");
					System.out.println("El numero es un 1");
					System.out.println("------------------");
				}
				
				positionDigit--;
			}
			System.out.println("-------------------------------------------------------------------------------------");
		}
		//---------------------------------------------------------------------------------------------------
		
		
		
		
		return multiplication;
	}*/