
package ui;

import java.util.Scanner;
import java.lang.Math;

public class ConverterAndNumberingSystems{
	
		
		static int [] binary;
		static int [] decimal;
		static String [] HexaDecimal;
		static int [] BinaryCalculator1;
		static int [] BinaryCalculator2;
		
		
		static Scanner sc = new Scanner (System.in);
	 /**
    * Descripción: This method is used to call the main menu and start </br>

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
					validateBinary(number);
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
					validateDecimal(number);
					if (validateDecimal(number)==false){
						System.out.println("Te has equivocado digitando los numeros, recuerda no puedes meter numeros que no sean del 0 al 9 asi es el sistema decimal.");
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
	
					
					validateHexadecimal(number);
					
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
		boolean leave = false;
		while (!leave){
			System.out.print("Enter the number of digits you are going to enter for the first number:");
			int numberOfDigits = sc.nextInt();
			BinaryCalculator1 = new int[numberOfDigits];
					
			for (int veces = 0;veces<numberOfDigits;veces++){
						
				System.out.println("Enter the digit");
				int number = sc.nextInt();
				validateBinary(number);
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
						System.out.println("------------------------------------------------------------------------------------------------------------------------");
					}
					if (answerMenu==2){
						
						System.out.println("------------------------------------------------------------------------------------------------------------------------");
						System.out.println("The result is :"+subtraction(numberOfDigits,numberOfDigits2));
						System.out.println("------------------------------------------------------------------------------------------------------------------------");
					}
					if (answerMenu==3){
						System.out.println("------------------------------------------------------------------------------------------------------------------------");
						System.out.println("The result is :"+multiplication(numberOfDigits,numberOfDigits2));
						System.out.println("Out of service!");
						System.out.println("Sorry, we are working on it");
						System.out.println("------------------------------------------------------------------------------------------------------------------------");
						
						
					}
					if (answerMenu==4){
						System.out.println("------------------------------------------------------------------------------------------------------------------------");
						System.out.println("The result is :"+division(numberOfDigits,numberOfDigits2));
						System.out.println("Out of service!");
						System.out.println("Sorry, we are working on it");
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
    * @return false boolean
	* @return true boolean
    */
	public static boolean validateBinary(int number){
		if (number/10!=0){
			return false;
			}
		if (number!=0 && number!=1){
			return false;
		}
		return true;
	}
	/**
    * Descripción: This method serves to validate the second binary number that is entered in the calculator.</br>
    * @param number2 int, be a binary number
    * @return false boolean
	* @return true boolean
    */
	public static boolean validateBinary2(int number2){
		if (number2/10!=0){
			return false;
			}
		if (number2!=0 && number2!=1){
			return false;
		}
		return true;
	}
	
	//-----------------------VALIDA DECI------------------------------------------------------------------------------------------------------------------------------------------------------
	/**
    * Descripción: This method serves to validate the decimal number that was entered for the number converter.</br>
    * @param number int, be a decimal number
    * @return false boolean
	* @return true boolean
    */
	public static boolean validateDecimal(int number){
		if (number/10!=0){
			return false;
			}
		return true;
	}
	//------------------------VALIDA HEXA-----------------------------------------------------------------------------------------------------------------------------------------------------
	/**
    * Descripción: This method serves to validate the hexadecimal number that was entered for the number converter.</br>
    * @param number int, be a hexadecimal number
    * @return false boolean
	* @return true boolean
    */
	public static boolean validateHexadecimal(String number){
		boolean right = false;
		
		
		String [] hexadecimalNumbersArray = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
		for(int j=0;j<16 && !right;j++){
			if(number.equals(hexadecimalNumbersArray[j])){
				right=true;
			}
			
		}
		
		return right;
		

	}
	//---------------------------------------------------------------------------------CONVERSORES---------------------------------------------------------------------------------
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//-------------------DE binary A HEXA Y DECI----------------------------------------------------------------------------------------------------------------------------------
	/**
    * Descripción: This method is used to convert the binary number that was entered to a decimal number and a hexadecimal number.</br>
    * @param numberOfDigits int, It is the number of digits of the number that I entered
    * @return <nombre_var> <tipo>, informacion sobre variable de retorno --> retorno
    */
	public static void binarynumber(int numberOfDigits){
		int accountant = 0;
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
		int accountant = 0;
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
    * @return sum String 
    */
	public static String sum(int numberOfDigits,int numberOfDigits2){
		
		char carry='0';
		
		int result;
		String sum=" ";
		int position1=0;
		int position2=0;
		int numberCyclesCalculator=0;
		
		int potency=0;
		
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
    * @return subtraction String 
    */
	public static String subtraction(int numberOfDigits,int numberOfDigits2){
		String subtraction="";
				
		char negativeCarry='0';
		
		int result;
		
		int position1=0;
		int position2=0;
		int numberCyclesCalculator=0;
		
		int potency=0;
		
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
    * Descripción: ¿qué hace mi método? (concisa, un par de líneas)</br>
    * <b> pre:</b> ¿cuáles son las condiciones sobre las variables globales? --> si hay una condición sobre var glob. </br>
    * <b> pos:</b> ¿Cuales fueron los cambios sobre las variables globales? --> si ocurrio un cambio cn var glob.
    * @param <nombre_par> <tipo>, condiciones sobre el parametro --> si tiene
    * @return <nombre_var> <tipo>, informacion sobre variable de retorno --> retorno
    */
	public static String multiplication(int numberOfDigits,int numberOfDigits2){
		
		String multiplication="";
		char carry='0';
		
		int result;
		String sum="";
		int position1=0;
		int position2=0;
		int pocision3=0;
		int pocision4=0;
		int numberCyclesCalculator=0;
		
		int potency=0;
		
		int unlimitedPosition1=numberOfDigits;
		int unlimitedPosition2=numberOfDigits2;
		int unlimitedPosition3=numberOfDigits;
		int unlimitedPosition4=numberOfDigits2;
		
		String productAccumulated="";
		String product="";
		int counterSumMultiplication=0;
		int counterReverse1=0;
		int counterReverse2=0;
		int potencyZERO =0;
		for(int m=0;m<numberOfDigits;m++){
			position1=unlimitedPosition1;
			position2=unlimitedPosition2;
			if (BinaryCalculator1[position1-1]==0 && BinaryCalculator2[position2-1]==0){
				product="0"+product;
			}
			if ((BinaryCalculator1[position1-1]==1 && BinaryCalculator2[position2-1]==0)||(BinaryCalculator1[position1-1]==0 && BinaryCalculator2[position2-1]==1)){
				product="0"+product;
			}
			if (BinaryCalculator1[position1-1]==1 && BinaryCalculator2[position2-1]==1){
				product="1"+product;
			}
			unlimitedPosition1--;
			//unlimitedPosition2--;
			if (counterSumMultiplication==0){
				productAccumulated=product;
			}
			if(numberOfDigits2>1){
				if(position1==0 && counterSumMultiplication>0){
					for(int s=0;s<numberCyclesCalculator;s++){
						potencyZERO = (int) Math.pow(10,counterSumMultiplication);
						productAccumulated=productAccumulated+potencyZERO ;
						if (productAccumulated.length()<product.length()){
							numberCyclesCalculator=product.length();
						
						}
						if(productAccumulated.length()>=product.length()){
							numberCyclesCalculator=productAccumulated.length();
						
						}
						pocision3=unlimitedPosition3;
						pocision4=unlimitedPosition4;
						counterReverse1=productAccumulated.length();
						counterReverse2=product.length();
						
						
						if (pocision3>0 && pocision4>0){
							if (productAccumulated.substring(counterReverse1-1,counterReverse1).equals("0") && product.substring(counterReverse2-1,counterReverse2).equals("0")){
								if(carry=='0'){
									sum="0"+sum;
									
								}else{
									if(carry=='1'){
									
										sum="1"+sum;
										carry='0';
									}
								}
								
							}
							if ((productAccumulated.substring(counterReverse1-1,counterReverse1).equals("1") && product.substring(counterReverse2-1,counterReverse2).equals("0"))||(productAccumulated.substring(counterReverse1-1,counterReverse1).equals("0") && product.substring(counterReverse2-1,counterReverse2).equals("1"))){
								if(carry=='0'){
									sum="1"+sum;
									
								}else{
									if(carry=='1'){
										carry='1';
										sum="0"+sum;
									}
								}
							}
							
							if (productAccumulated.substring(counterReverse1-1,counterReverse1).equals("1") && product.substring(counterReverse2-1,counterReverse2).equals("1")){
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
							unlimitedPosition3--;
							unlimitedPosition4--;
						}
						
						if (pocision3>0 && pocision4==0){
							
							if (productAccumulated.substring(counterReverse1-1,counterReverse1).equals("0")){
								if(carry=='0'){
									sum="0"+sum;
									
								}else{
									carry='0';
									sum="1"+sum;
								}
									
								
							}
							
							if (productAccumulated.substring(counterReverse1-1,counterReverse1).equals("1")){
								if(carry=='0'){
									sum="1"+sum;
									
								}else{
									carry='1';
									sum="0"+sum;
								}
									
							}
							
							unlimitedPosition3--;
						}
						
						
						
						if (pocision4>0 && pocision3==0){
							if (product.substring(counterReverse2-1,counterReverse2).equals("0")){
								if(carry=='0'){
									sum="0"+sum;
									
								}else{
									
									sum="1"+sum;
								}
									
								
							}
							if (product.substring(counterReverse2-1,counterReverse2).equals("1")){
								if(carry=='0'){
									sum="1"+sum;
									
								}else{
									carry='1';
									sum="0"+sum;
								}
									
							}
							
							
							unlimitedPosition4--;
						}
						counterReverse1--;
						counterReverse2--;
					}
					if (carry=='1'){
						sum= carry+sum;
					}
					productAccumulated=sum;
				}
			}
			counterSumMultiplication++;	
		}
		System.out.println(productAccumulated);


		return multiplication;
	}
	
	/**
    * Descripción: ¿qué hace mi método? (concisa, un par de líneas)</br>
    * <b> pre:</b> ¿cuáles son las condiciones sobre las variables globales? --> si hay una condición sobre var glob. </br>
    * <b> pos:</b> ¿Cuales fueron los cambios sobre las variables globales? --> si ocurrio un cambio cn var glob.
    * @param <nombre_par> <tipo>, condiciones sobre el parametro --> si tiene
    * @return <nombre_var> <tipo>, informacion sobre variable de retorno --> retorno
    */
	public static String division(int numberOfDigits,int numberOfDigits2){
		String division="";
		return division;
	}

}