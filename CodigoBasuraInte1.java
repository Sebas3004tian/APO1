		/*
		String multiplication="";
		
		String acumuladoMultiplicacionSuma="";
		int auxiliarMultiplicacionSumaINT=0;
		int multiplicacionSumaINT=0;
		int acumuladoMultiplicacionSumaINT=0;
		int numeroAcumuladoMultiplicacionSuma=0;
		
		String acumuladoMultiplicacion="";
		int auxiliarMultiplicacionINT=0;
		int multiplicacionINT=0;
		int acumuladoMultiplicacionINT=0;
		int numeroAcumuladoMultiplicacion=0;
		
		int counterReverse1=0;
		int counterReverse2=0;
		int counterReverse1segundo=0;
		int counterReverse2segundo=0;
		
		String resultadoAcumuladoSuma="";
		String ceros="";
		
		int position1=numberOfDigits;
		int position2=numberOfDigits2;
		
		int potency1=0;
		int potency2=0;
		
		
		if(numberOfDigits2>1){
			for(int m=0;m<numberOfDigits2;m++){
				if(m>0){//Significa que ya dio una vuelta
					ceros+="0";
					acumuladoMultiplicacion=ceros+acumuladoMultiplicacion;
				}
				if(BinaryCalculator2[position2-1]==1){
					position1=numberOfDigits;
					for(int m2=0;m2<numberOfDigits;m2++){
						acumuladoMultiplicacion=BinaryCalculator1[position1-1]+acumuladoMultiplicacion;
						position1--;
					}
				}
				if(BinaryCalculator2[position2-1]==0){
					for(int m2=0;m2<numberOfDigits;m2++){
						acumuladoMultiplicacion="0"+acumuladoMultiplicacion;
					}
					
				}
				if(m==0){
					acumuladoMultiplicacionSuma=acumuladoMultiplicacion;
					acumuladoMultiplicacion="";
				}
				
				//System.out.println(acumuladoMultiplicacionSuma);
				//System.out.println(acumuladoMultiplicacion);
				
				
				
				//System.out.println(numeroAcumuladoMultiplicacionSuma);
				//System.out.println(numeroAcumuladoMultiplicacion);
				
				
				//System.out.println(numeroAcumuladoMultiplicacion)
				multiplication=acumuladoMultiplicacionSuma;//Para Pruebas-----------------------------------------------------------
				System.out.println(acumuladoMultiplicacion+" reguladooooooooooooooooooor");
				numeroAcumuladoMultiplicacionSuma=acumuladoMultiplicacionSuma.length();
				counterReverse1=numeroAcumuladoMultiplicacionSuma;
				numeroAcumuladoMultiplicacion=acumuladoMultiplicacion.length();
				counterReverse2=numeroAcumuladoMultiplicacion;
				System.out.println(acumuladoMultiplicacionSuma+" se supone es MAS DE 0");
				System.out.println(acumuladoMultiplicacion+" se supone es MAS DE 0");
				for(int a1=0;a1<numeroAcumuladoMultiplicacionSuma;a1++){
					System.out.println(a1+"se supone el for");
					if(counterReverse1==0){
						counterReverse1segundo=0;
					}else{
						counterReverse1segundo=counterReverse1-1;
					}
					if(acumuladoMultiplicacionSuma.substring(counterReverse1segundo,counterReverse1).equals("0")){
						auxiliarMultiplicacionSumaINT=0;
					}
					if(acumuladoMultiplicacionSuma.substring(counterReverse1segundo,counterReverse1).equals("1")){
						auxiliarMultiplicacionSumaINT=1;
					}
					potency1= (int) Math.pow(10,a1);
					multiplicacionSumaINT = ((auxiliarMultiplicacionSumaINT)*(potency1));
					acumuladoMultiplicacionSumaINT+=multiplicacionSumaINT;
					counterReverse1--;
					System.out.println(acumuladoMultiplicacionSumaINT);
				}
				for(int a2=0;a2<numeroAcumuladoMultiplicacion;a2++){
					System.out.println(a2+"se supone el for");
					if(counterReverse2==0){
						counterReverse2segundo=0;
					}else{
						counterReverse2segundo=counterReverse2-1;
					}
					if(acumuladoMultiplicacion.substring(counterReverse2segundo,counterReverse2).equals("0")){
						auxiliarMultiplicacionINT=0;
					}
					if(acumuladoMultiplicacion.substring(counterReverse2segundo,counterReverse2).equals("1")){
						auxiliarMultiplicacionINT=1;
					}
					potency2= (int) Math.pow(10,a2);
					multiplicacionINT = ((auxiliarMultiplicacionINT)*(potency2));
					acumuladoMultiplicacionINT+=multiplicacionINT;
					counterReverse2--;
					System.out.println(acumuladoMultiplicacionINT);
				}
			}
		}*/
			/*
			numeroAcumuladoMultiplicacionSuma=acumuladoMultiplicacionSuma.length();
			counterReverse1=numeroAcumuladoMultiplicacionSuma;
			numeroAcumuladoMultiplicacion=acumuladoMultiplicacion.length();
			counterReverse2=numeroAcumuladoMultiplicacion;
			System.out.println(acumuladoMultiplicacionSuma+" se supone es MAS DE 0");
			System.out.println(acumuladoMultiplicacion+" se supone es MAS DE 0");
			for(int a1=0;a1<numeroAcumuladoMultiplicacionSuma;a1++){
				System.out.println(a1+"se supone el for");
				if(counterReverse1==0){
					counterReverse1segundo=0;
				}else{
					counterReverse1segundo=counterReverse1-1;
				}
				if(acumuladoMultiplicacionSuma.substring(counterReverse1segundo,counterReverse1).equals("0")){
					auxiliarMultiplicacionSumaINT=0;
				}
				if(acumuladoMultiplicacionSuma.substring(counterReverse1segundo,counterReverse1).equals("1")){
					auxiliarMultiplicacionSumaINT=1;
				}
				potency1= (int) Math.pow(10,a1);
				multiplicacionSumaINT = ((auxiliarMultiplicacionSumaINT)*(potency1));
				acumuladoMultiplicacionSumaINT+=multiplicacionSumaINT;
				counterReverse1--;
				System.out.println(acumuladoMultiplicacionSumaINT);
			}
			for(int a2=0;a2<numeroAcumuladoMultiplicacion;a2++){
				System.out.println(a2+"se supone el for");
				if(counterReverse2==0){
					counterReverse2segundo=0;
				}else{
					counterReverse2segundo=counterReverse2-1;
				}
				if(acumuladoMultiplicacion.substring(counterReverse2segundo,counterReverse2).equals("0")){
					auxiliarMultiplicacionINT=0;
				}
				if(acumuladoMultiplicacion.substring(counterReverse2segundo,counterReverse2).equals("1")){
					auxiliarMultiplicacionINT=1;
				}
				potency2= (int) Math.pow(10,a2);
				multiplicacionINT = ((auxiliarMultiplicacionINT)*(potency2));
				acumuladoMultiplicacionINT+=multiplicacionINT;
				counterReverse2--;
				System.out.println(acumuladoMultiplicacionINT);
			}
			System.out.println("...................................");
			System.out.println(acumuladoMultiplicacionSumaINT);
			System.out.println(acumuladoMultiplicacionINT);
			System.out.println("...................................");
			
		}else if(numberOfDigits2==1){
			if(BinaryCalculator2[position2-1]==1){
				for(int m=0;m<numberOfDigits;m++){
					acumuladoMultiplicacion=BinaryCalculator1[position1-1]+acumuladoMultiplicacion;
					position1--;
					
				}
				multiplication=acumuladoMultiplicacion;
			}
			if(BinaryCalculator2[position2-1]==0){
				for(int m=0;m<numberOfDigits;m++){
					multiplication="0";
					
				}
			}
			
		}*/
		
		
		
		
				/*String acumuladoMultiplicacion="";
		int numeroAcumuladoMultiplicacion=0;
		
		String acumuladoMultiplicacionSuma="";
		int numeroAcumuladoMultiplicacionSuma=0;
		
		String resultadoAcumuladoSuma="";
		String ceros="";
		int counterReverse1=0;
		int counterReverse2=0;
		int counterReverse1segundo=0;
		int counterReverse2segundo=0;
		int position1=numberOfDigits;
		int position2=numberOfDigits2;
		int espacioVacio=0;//pasar a ingles
		char carry='0';
		if(numberOfDigits2>1){
			for(int m=0;m<numberOfDigits2;m++){
				if(m>0){//Significa que ya dio una vuelta
					ceros+="0";
					acumuladoMultiplicacion=ceros+acumuladoMultiplicacion;
				}
				if(BinaryCalculator2[position2-1]==1){
					position1=numberOfDigits;
					for(int m2=0;m2<numberOfDigits;m2++){
						acumuladoMultiplicacion=BinaryCalculator1[position1-1]+acumuladoMultiplicacion;
						position1--;
					}
				}
				/*if(BinaryCalculator2[position2-1]==0){
					for(int m2=0;m2<numberOfDigits;m2++){
						acumuladoMultiplicacion="0"+acumuladoMultiplicacion;
					}
					
				}*/
				/*if(m==0){
					acumuladoMultiplicacionSuma=acumuladoMultiplicacion;
					acumuladoMultiplicacion="";
				}
				if(m>0){
					numeroAcumuladoMultiplicacionSuma=acumuladoMultiplicacionSuma.length();
					counterReverse1=numeroAcumuladoMultiplicacionSuma;
					//System.out.println(numeroAcumuladoMultiplicacionSuma);
					numeroAcumuladoMultiplicacion=acumuladoMultiplicacion.length();
					counterReverse2=numeroAcumuladoMultiplicacion;
					//System.out.println(numeroAcumuladoMultiplicacion);
					
					for(int s=0;s<numeroAcumuladoMultiplicacion;s++){
						if(counterReverse1>1){
							counterReverse1segundo=counterReverse1-1;
						}else if(counterReverse1==1){
							counterReverse1segundo=0;
						}
						if(counterReverse2>1){
							counterReverse2segundo=counterReverse2-1;
						}else if(counterReverse2==1){
							counterReverse2segundo=0;
						}
						

						
						
						if(acumuladoMultiplicacionSuma.substring(counterReverse1segundo,counterReverse1).equals("0") && acumuladoMultiplicacion.substring(counterReverse2segundo,counterReverse2).equals("0")){
							if(carry=='0'){
								resultadoAcumuladoSuma="0"+resultadoAcumuladoSuma;
								
							}else{
								if(carry=='1'){
								
									resultadoAcumuladoSuma="1"+resultadoAcumuladoSuma;
									carry='0';
								}
							}
						}
						if((acumuladoMultiplicacionSuma.substring(counterReverse1segundo,counterReverse1).equals("1") && acumuladoMultiplicacion.substring(counterReverse2segundo,counterReverse2).equals("0"))||(acumuladoMultiplicacionSuma.substring(counterReverse1segundo,counterReverse1).equals("0") && acumuladoMultiplicacion.substring(counterReverse2segundo,counterReverse2).equals("1"))){
							if(carry=='0'){
								resultadoAcumuladoSuma="1"+resultadoAcumuladoSuma;
								
							}else{
								if(carry=='1'){
								
									resultadoAcumuladoSuma="0"+resultadoAcumuladoSuma;
									carry='1';
								}
							}
						}
						if(acumuladoMultiplicacionSuma.substring(counterReverse1segundo,counterReverse1).equals("1") && acumuladoMultiplicacion.substring(counterReverse2segundo,counterReverse2).equals("1")){
							if(carry=='0'){
								resultadoAcumuladoSuma="0"+resultadoAcumuladoSuma;
								carry='1';
								
							}else{
								if(carry=='1'){
								
									resultadoAcumuladoSuma="1"+resultadoAcumuladoSuma;
									carry='1';
								}
							}
						}
						if(counterReverse1segundo==0 && counterReverse2segundo==0){
							System.out.println("ACABOOOOO");
						}
						if(counterReverse1segundo==0 && counterReverse2segundo>0){
							if (acumuladoMultiplicacion.substring(counterReverse2segundo,counterReverse2).equals("0")){
								System.out.println("Entra aquiiiiiii1");
								if(carry=='0'){
									resultadoAcumuladoSuma="0"+resultadoAcumuladoSuma;
									System.out.println("Entra aquiiiiiii1----------------1");
								}else{
									
									resultadoAcumuladoSuma="1"+resultadoAcumuladoSuma;
									System.out.println("Entra aquiiiiiii1----------------2");
								}
									
								
							}
							if (acumuladoMultiplicacion.substring(counterReverse2segundo,counterReverse2).equals("1")){
								System.out.println("Entra aquiiiiiii12222222222");
								if(carry=='0'){
									resultadoAcumuladoSuma="1"+resultadoAcumuladoSuma;
									System.out.println("Entra aquiiiiiii12222222222-----------------------------1");
								}else{
									carry='1';
									resultadoAcumuladoSuma="0"+resultadoAcumuladoSuma;
									System.out.println("Entra aquiiiiiii12222222222-----------------------------2");
								}
									
							}
						}
						
						counterReverse1--;
						counterReverse2--;
						System.out.println("----------------------------------------------------");
						System.out.println("numero acumulado   "+acumuladoMultiplicacionSuma);
						System.out.println("numero a sumar   "+acumuladoMultiplicacion);
						System.out.println("Solucion   "+resultadoAcumuladoSuma);
						System.out.println("----------------------------------------------------");
						
					}
					if (carry=='1'){
						resultadoAcumuladoSuma= carry+resultadoAcumuladoSuma;
					}
					acumuladoMultiplicacionSuma=resultadoAcumuladoSuma;
					System.out.println(acumuladoMultiplicacionSuma);
				}
				multiplication=acumuladoMultiplicacionSuma;//Para Pruebas
				
			}
			
		}else{
			if(BinaryCalculator2[position2-1]==1){
				for(int m=0;m<numberOfDigits;m++){
					acumuladoMultiplicacion=BinaryCalculator1[position1-1]+acumuladoMultiplicacion;
					position1--;
					
				}
			}
			if(BinaryCalculator2[position2-1]==0){
				for(int m=0;m<numberOfDigits;m++){
					multiplication="0";
					
				}
			}
		}
		for(int m=0;m<numberOfDigits2;m++){
			if(m>0){//Significa que ya dio una vuelta
				ceros+="0";
				acumuladoMultiplicacion=ceros+acumuladoMultiplicacion;
			}
			if(BinaryCalculator2[position2-1]==1){
				position1=numberOfDigits;
				for(int m2=0;m2<numberOfDigits;m2++){
					acumuladoMultiplicacion=BinaryCalculator1[position1-1]+acumuladoMultiplicacion;
					position1--;
				}
			}
			if(BinaryCalculator2[position2-1]==0){
				for(int m2=0;m2<numberOfDigits;m2++){
					acumuladoMultiplicacion="0"+acumuladoMultiplicacion;
				}
				
			}
			if(m==0){
				acumuladoMultiplicacionSuma=acumuladoMultiplicacion;
				acumuladoMultiplicacion="";
			}
			if(m>0){
				numeroAcumuladoMultiplicacionSuma=acumuladoMultiplicacionSuma.length();
				counterReverse1=numeroAcumuladoMultiplicacionSuma;
				//System.out.println(numeroAcumuladoMultiplicacionSuma);
				numeroAcumuladoMultiplicacion=acumuladoMultiplicacion.length();
				counterReverse2=numeroAcumuladoMultiplicacion;
				//System.out.println(numeroAcumuladoMultiplicacion);
				
				for(int s=0;s<numeroAcumuladoMultiplicacion;s++){
					if(counterReverse1>1){
						counterReverse1segundo=counterReverse1-1;
					}else if(counterReverse1==1){
						counterReverse1segundo=0;
					}
					if(counterReverse2>1){
						counterReverse2segundo=counterReverse2-1;
					}else if(counterReverse2==1){
						counterReverse2segundo=0;
					}
					

					
					
					if(acumuladoMultiplicacionSuma.substring(counterReverse1segundo,counterReverse1).equals("0") && acumuladoMultiplicacion.substring(counterReverse2segundo,counterReverse2).equals("0")){
						if(carry=='0'){
							resultadoAcumuladoSuma="0"+resultadoAcumuladoSuma;
							
						}else{
							if(carry=='1'){
							
								resultadoAcumuladoSuma="1"+resultadoAcumuladoSuma;
								carry='0';
							}
						}
					}
					if((acumuladoMultiplicacionSuma.substring(counterReverse1segundo,counterReverse1).equals("1") && acumuladoMultiplicacion.substring(counterReverse2segundo,counterReverse2).equals("0"))||(acumuladoMultiplicacionSuma.substring(counterReverse1segundo,counterReverse1).equals("0") && acumuladoMultiplicacion.substring(counterReverse2segundo,counterReverse2).equals("1"))){
						if(carry=='0'){
							resultadoAcumuladoSuma="1"+resultadoAcumuladoSuma;
							
						}else{
							if(carry=='1'){
							
								resultadoAcumuladoSuma="0"+resultadoAcumuladoSuma;
								carry='1';
							}
						}
					}
					if(acumuladoMultiplicacionSuma.substring(counterReverse1segundo,counterReverse1).equals("1") && acumuladoMultiplicacion.substring(counterReverse2segundo,counterReverse2).equals("1")){
						if(carry=='0'){
							resultadoAcumuladoSuma="0"+resultadoAcumuladoSuma;
							carry='1';
							
						}else{
							if(carry=='1'){
							
								resultadoAcumuladoSuma="1"+resultadoAcumuladoSuma;
								carry='1';
							}
						}
					}
					if(counterReverse1segundo==0 && counterReverse2segundo==0){
						System.out.println("ACABOOOOO");
					}
					if(counterReverse1segundo==0 && counterReverse2segundo>0){
						if (acumuladoMultiplicacion.substring(counterReverse2segundo,counterReverse2).equals("0")){
							System.out.println("Entra aquiiiiiii1");
							if(carry=='0'){
								resultadoAcumuladoSuma="0"+resultadoAcumuladoSuma;
								System.out.println("Entra aquiiiiiii1----------------1");
							}else{
								
								resultadoAcumuladoSuma="1"+resultadoAcumuladoSuma;
								System.out.println("Entra aquiiiiiii1----------------2");
							}
								
							
						}
						if (acumuladoMultiplicacion.substring(counterReverse2segundo,counterReverse2).equals("1")){
							System.out.println("Entra aquiiiiiii12222222222");
							if(carry=='0'){
								resultadoAcumuladoSuma="1"+resultadoAcumuladoSuma;
								System.out.println("Entra aquiiiiiii12222222222-----------------------------1");
							}else{
								carry='1';
								resultadoAcumuladoSuma="0"+resultadoAcumuladoSuma;
								System.out.println("Entra aquiiiiiii12222222222-----------------------------2");
							}
								
						}
					}
					
					counterReverse1--;
					counterReverse2--;
					System.out.println("----------------------------------------------------");
					System.out.println("numero acumulado   "+acumuladoMultiplicacionSuma);
					System.out.println("numero a sumar   "+acumuladoMultiplicacion);
					System.out.println("Solucion   "+resultadoAcumuladoSuma);
					System.out.println("----------------------------------------------------");
					
				}
				if (carry=='1'){
					resultadoAcumuladoSuma= carry+resultadoAcumuladoSuma;
				}
				acumuladoMultiplicacionSuma=resultadoAcumuladoSuma;
				System.out.println(acumuladoMultiplicacionSuma);
			}
			multiplication=acumuladoMultiplicacionSuma;//Para Pruebas
			
		}*/
		/*
		if(numberOfDigits2>1){
			for(int m=0;m<numberOfDigits2;m++){
				if(m>0){//Significa que ya dio una vuelta
					acumuladoMultiplicacionSuma="0"+acumuladoMultiplicacionSuma;
				}
				if(BinaryCalculator2[position2-1]==1){
					for(int m2=0;m2<numberOfDigits;m2++){
						acumuladoMultiplicacionSuma=BinaryCalculator1[position1-1]+acumuladoMultiplicacionSuma;
					}
				}
				if(BinaryCalculator2[position2-1]==0){
					for(int m2=0;m2<numberOfDigits;m2++){
						acumuladoMultiplicacionSuma="0"+acumuladoMultiplicacionSuma;
					}
					
				}
				
				multiplication=acumuladoMultiplicacionSuma;//Para Pruebas
				
			}
		}else{
			if(BinaryCalculator2[position2-1]==1){
				for(int m=0;m<numberOfDigits;m++){
					multiplication=BinaryCalculator1[position1-1]+multiplication;
					position1--;
					
				}
			}
			if(BinaryCalculator2[position2-1]==0){
				for(int m=0;m<numberOfDigits;m++){
					multiplication="0";
					
				}
			}
		}*/
		
		/*String multiplication="";
		char carry='0';
		
		//int result; is not used
		String sum="";
		int position1=0;
		int position2=0;
		int pocision3=0;
		int pocision4=0;
		int numberCyclesCalculator=0;
		
		//int potency=0; is not used
		
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


		return multiplication;*/
		
		
		
		
		
/*String multiplicacion="";
		String binario1="";
		String digitoBi1="";
		String binario2="";
		String digitoBi2="";
		int binarioInt1=0;
		int binarioInt2=0;
		int contador1=0;
		int contador2=0;
		contador1=numberOfDigits-1;
		contador2=numberOfDigits2-1;
		for(int a=0;a<numberOfDigits;a++){
			if(BinaryCalculator1[contador1]==1){
				digitoBi1="1";
			}
			if(BinaryCalculator1[contador1]==0){
				digitoBi1="0";
			}
			
			binario1=digitoBi1+binario1;
			contador1--;
		}
		for(int b=0;b<numberOfDigits2;b++){
			if(BinaryCalculator2[contador2]==1){
				digitoBi2="1";
			}
			if(BinaryCalculator2[contador2]==0){
				digitoBi2="0";
			}
			
			binario2=digitoBi2+binario2;
			contador2--;
		}
		binarioInt1=Integer.parseInt(binario1,2);
		binarioInt2=Integer.parseInt(binario2,2);
		int respuestaMulti=binarioInt1*binarioInt2;
		multiplicacion=Integer.toString(respuestaMulti,2);
		System.out.println(binarioInt1);
		System.out.println(binarioInt2);
		System.out.println("---------------------");
		System.out.println(respuestaMulti);
		System.out.println("---------------------");
		System.out.println(binario1);
		System.out.println(binario2);
		System.out.println(multiplicacion);
		return multiplicacion;
	}*/
	
	
	
	
		public static String multiplication(int numberOfDigits,int numberOfDigits2){
		String multiplication="";
		
		
		
		multiplicacionBinarios = new String[numberOfDigits2];
		String numeroBinArreglo="";
		String ceros="";
		int position1=0;
		
		
		int cuentaRegre1Digi1=numberOfDigits-1;
		
		
		int cuentaRegre1Digi2=numberOfDigits2-1;
		
		//Esta parte es para hacer solo las multiplicaciones
		for(int x=0;x<numberOfDigits2;x++){
			
			numeroBinArreglo="";
			cuentaRegre1Digi1=numberOfDigits-1;
			for(int a=0;a<numberOfDigits;a++){
				
				if(BinaryCalculator2[cuentaRegre1Digi2]==0){
					numeroBinArreglo="0"+numeroBinArreglo;
					
				}
				if(BinaryCalculator2[cuentaRegre1Digi2]==1){
					if(BinaryCalculator1[cuentaRegre1Digi1]==0){
						numeroBinArreglo="0"+numeroBinArreglo;
					}
					if(BinaryCalculator1[cuentaRegre1Digi1]==1){
						numeroBinArreglo="1"+numeroBinArreglo;
					}
					
					
				}
				
				cuentaRegre1Digi1--;
				
			}
			if(x>0){
				ceros="0"+ceros;
			}
			
			numeroBinArreglo=numeroBinArreglo+ceros;
			multiplicacionBinarios[x]=numeroBinArreglo;
			cuentaRegre1Digi2--;
		}
		//------------------------------------------------------------------para ver los arreglos
		
		
		for(int i=0;i<numberOfDigits2;i++){
			System.out.println(multiplicacionBinarios[i]);
		}
		//---------------------------------------------------------------------------------sumatoria de todo
		/*int vecesNumBin1=0;
		String digito1="";
		String digito2="";
		int posicionDigito1=0;
		int posicionDigito2=0;
		
		
		if(numberOfDigits2>1){//por que si es mayor a 1 el numero de dedigitos del valorq eu multiplica pues no se hace suma
		
			for(int i=0;i<numberOfDigits2;i++){
				vecesNumBin2=multiplicacionBinarios[i+1].length();
				posicionDigito1=vecesNumBin1;
				for(int e=0;e<vecesNumBin2;e++){
					digito1="";
					digito2="";
					
					digito1=multiplicacionBinarios[i].substring(posicionDigito1-1,posicionDigito1);
					digito1=multiplicacionBinarios[i+1].substring(posicionDigito1-1,posicionDigito1);
					
					posicionDigito1--;
				}
				
				
			}
		}*/
		
		//----------------------------------------------------------------------PRUEBITAWS QUE NO SIRVEN
		String acumulado="";
		String numeroPrueba="";
		String numeroPrueba1="";
		String numeroPrueba2="";
		
		int vecesNumeroPrueba=0;
		int vecesNumeroPrueba1=0;
		int vecesNumeroPrueba2=0;
		
		int posicionDigito=0;
		int posicionDigito1=0;
		int posicionDigito2=0;
		
		String digito="";
		String digito1="";
		String digito2="";
		
		int contador1=0;
		int contadorPrimeraSuma=0;
		
		char carry='0';
		
		String acumuladorSuma="";
		String acumuladorSumaTOTAL="";
		
		for(int i =0;i<numberOfDigits2;i++){
			System.out.println("1 .EL ACUMULADO TOTAL QUE SE LLEVA ES :"+acumuladorSuma);
			contador1=0;
			
			System.out.println("-------------------------------------------------------------------------------------");
			//numeroPrueba=multiplicacionBinarios[i];
			if(contadorPrimeraSuma==0){
				numeroPrueba1=multiplicacionBinarios[i];
				acumuladorSuma=multiplicacionBinarios[i];
				contadorPrimeraSuma=1;
			}else{
				numeroPrueba1=acumuladorSuma;
			}
			if(i==numberOfDigits2-1){
				numeroPrueba2="";
			}else{
				numeroPrueba2=multiplicacionBinarios[i+1];
			}
			
			
			//vecesNumeroPrueba=numeroPrueba.length();
			vecesNumeroPrueba1=numeroPrueba1.length();
			vecesNumeroPrueba2=numeroPrueba2.length();
			
			//digito="";
			digito1="";
			digito2="";
			
			
			
			//System.out.println("el numero de Prueba es : "+numeroPrueba+" Y el numero de digitos del numero de prueba es : "+vecesNumeroPrueba);
			//System.out.println("");
			//System.out.println("");
			
			System.out.println("el numero de Prueba es : "+numeroPrueba1+" Y el numero de digitos del numero de prueba es : "+vecesNumeroPrueba1);
			System.out.println("");
			System.out.println("");
			
			if(numeroPrueba2.equals("")){
				
			}else{
				System.out.println("el numero de Prueba es : "+numeroPrueba2+" Y el numero de digitos del numero de prueba es : "+vecesNumeroPrueba2);
				System.out.println("");
				System.out.println("");
			}
			
			
			//posicionDigito=vecesNumeroPrueba;
			posicionDigito1=vecesNumeroPrueba1;
			posicionDigito2=vecesNumeroPrueba2;
			System.out.println("2 .EL ACUMULADO TOTAL QUE SE LLEVA ES :"+acumuladorSuma);
			acumuladorSuma="";
			
			for(int r=0;r<vecesNumeroPrueba2;r++){
				
				if(posicionDigito1==0){
					contador1=1;
				}
				
				//digito="";
				digito1="";
				digito2="";
				
				//digito=numeroPrueba.substring(posicionDigito-1,posicionDigito);
				if(contador1==0){
					digito1=numeroPrueba1.substring(posicionDigito1-1,posicionDigito1);
				}
				
				digito2=numeroPrueba2.substring(posicionDigito2-1,posicionDigito2);
				
				//System.out.println("El digito numero "+(r+1)+" es "+digito);
				if(contador1==0){
					System.out.println("El digito numero "+(r+1)+" es "+digito1);
					
				}
				System.out.println("El digito numero "+(r+1)+" es "+digito2);
				
				/*if(digito.equals("0")){
					System.out.println("------------------");
					System.out.println("El numero es un 0");
					System.out.println("------------------");
				}
				if(digito.equals("1")){
					System.out.println("------------------");
					System.out.println("El numero es un 1");
					System.out.println("------------------");
				}*/
				if(contador1==0){
					if(digito1.equals("0")){
						System.out.println("------------------");
						System.out.println("El numero es un 0");
						System.out.println("------------------");
					}
					if(digito1.equals("1")){
						System.out.println("------------------");
						System.out.println("El numero es un 1");
						System.out.println("------------------");
					}
				}
				
				if(digito2.equals("0")){
					System.out.println("------------------");
					System.out.println("El numero es un 0");
					System.out.println("------------------");
				}
				if(digito2.equals("1")){
					System.out.println("------------------");
					System.out.println("El numero es un 1");
					System.out.println("------------------");
				}
				//-------------------------------------------SUMA
				if(contador1==1){
					if(digito2.equals("0")){
						if(carry=='0'){
							acumuladorSuma="0"+acumuladorSuma;
							
						}else{
							if(carry=='1'){
								carry='0';
								acumuladorSuma="1"+acumuladorSuma;
							}
						}
						
					}
					if(digito2.equals("1")){
						if(carry=='0'){
							acumuladorSuma="1"+acumuladorSuma;
							
						}else{
							if(carry=='1'){
								carry='1';
								acumuladorSuma="0"+acumuladorSuma;
							}
						}
					}
				}else if(contador1==0){
					if(digito1.equals("0") && digito2.equals("0")){
						if(carry=='0'){
							acumuladorSuma="0"+acumuladorSuma;
							
						}else{
							if(carry=='1'){
							
								acumuladorSuma="1"+acumuladorSuma;
								carry='0';
							}
						}
						
					}
					if((digito1.equals("0") && digito2.equals("1")) || (digito1.equals("1") && digito2.equals("0"))){
						if(carry=='0'){
							acumuladorSuma="1"+acumuladorSuma;
							
						}else{
							if(carry=='1'){
								carry='1';
								acumuladorSuma="0"+acumuladorSuma;
							}
						}
					}
					if(digito1.equals("1") && digito2.equals("1")){
						if(carry=='0'){
							carry='1';
							acumuladorSuma="0"+acumuladorSuma;
							
						}else{
							if(carry=='1'){
							
								acumuladorSuma="1"+acumuladorSuma;
								carry='1';
							}
						}
					}
					
					
				}
				
				System.out.println("3 .EL ACUMULADO TOTAL QUE SE LLEVA ES :"+acumuladorSuma);
				//-----------------------------------------------------------------------------------TERMINA SUMA
				
				
				
				//posicionDigito--;
				posicionDigito1--;
				posicionDigito2--;
				
				
			}
			if (carry=='1'){
				acumuladorSuma= carry+acumuladorSuma;
			}
			System.out.println("-------------------------------------------------------------------------------------");
			System.out.println("----------------------------salio------------------------------------"+acumuladorSuma+"---------------------"+i);
		}
		//---------------------------------------------------------------------------------------------------
		
		
		
		
		return multiplication;
	}