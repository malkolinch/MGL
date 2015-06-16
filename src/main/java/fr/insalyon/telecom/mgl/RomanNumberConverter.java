package fr.insalyon.telecom.mgl;

public class RomanNumberConverter {

  int nombre_solo(String romanNumber){
	  int resultat=null;
	  switch(romanNumber){
		  case "I" :
			resultat= 1;
			break;
		  case "V" :
			resultat= 5;
			break;
		  case "X" :
			resultat= 10;
			break;
		  case "L":
			resultat= 50;
			break;
		  case "C":
			resultat= 100;
			break;
		  case "D" :
			resultat= 500;
			break;
		  case "M":
			resultat= 1000;
			break;
	}
	return resultat;
  }

  int convert(String romanNumber){
	  if(romanNumber.length()==1){
		  return nombre_solo(romanNumber);
	  }else{
		  for(int i=0; i<romanNumber.length()-1;i++){
			  int lettre_actuelle=nombre_solo(romanNumber[i]);
			  int lettre_droite=nombre_solo(romanNumber[i+1]);
			  if(lettre_droite>=lettre_actuelle){
				  if(lettre_actuelle==1){
					int resultat= lettre_droite - lettre_actuelle;
				  }else{
					int resultat= lettre_droite + lettre_actuelle;
				  }
			  }
		  }
	  }
	  return resultat;
  }
  
  String convert(int number) {
	switch(number){
		  case  1:
			return "I";
		  case  5:
			return "V";
		  case 10 :
			return "X";
		  case 50:
			return "L";
		  case 100:
			return "C";
		  case  500:
			return "D";
		  case 1000:
			return "M";
		  default :
			if(number <= 0) {
				throw new IllegalArgumentException("number cannot be negative");
			}
			return "0";
	}
  }
}
