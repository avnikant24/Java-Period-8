
class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	void init(){
//C1: Write a function "gpa" that takes in the GPA value and returns the calcuation : if it's over 90, return gpa*1.1, otherwise return the raw gpa.\\

double gpa(double value){
	if(value > 90){
		return value * 1.1;
	}else{
		return value;
	}
}

//C2: Write a function "isGraduating" that accepts the grade level and number of credits earned that returns the boolean value TRUE if a student is a Senior and has 44 or more credits, otherwise return FALSE.\\

double isGraduating(int grade, int credits){
	if(grade == 12 && credits >= 44){
		return "TRUE";
	}else{
		return "FALSE";
	}
}
   
//Challenge 3: BMI - Write a function "BMI" that accepts a weight in pounds and height in inches. Calculate the BMI (google the formula) and 
//return the following:
//BMI 18.4 or less return Underweight
//BMI is 18.5 - 24.9 (inclusive) return Normal
//BMI is 25.0 - 39.9 (inclusive) return Overweight
//BMI is 40.0 or greater return  Obese\\

double BMI(double weight, double height){
double BMI = (weight/height * height) * 703.0;
	if (BMI >= 18.4){
		return "Underweight";
	}else if(BMI >= 18.5 && BMI <= 24.9){
		return "Normal";
	}else if(BMI >= 25.0 && BMI <= 39.9){
		return "Overweight";
	}else if(BMI >= 40.0){
		return "Obese";
	}
}


//Challenge 4: Write a function "shippingCost" that accepts a weigth 
//in units of pounds and returns:
      //- 0.00, if 10 pounds or less,
      //- 5.00, if more than 10 pounds but 15 pounds 
        //or less,
      //- 10.00, if more than 15 pounds but 25 pounds 
        //or less,
      //- 10.00 Plus 2 cents per pound over 25 pound, 
        //if over 25 pounds. \\
double shippingCost(double weight){
	if(weight <= 10.0){
		return 0.00;
	}else if(weight > 15 && weight <= 25){
		return 10.00;
	}else if(weight > 25){
		return 10.00 + 0.02 * weight;
	}
	}
  }

//Challenge 5: Write a function "blueOrViolet" that accepts a light frequency in THz units and returns true for either blue frequence (600-670 THz) or violet frquence (700-750 THz), otherwise return false//
double blueOrViolet(double light){
	if(light >= 600 && light <= 670 || light >= 700 && light <= 750){
		return "True";
	}else{
		return "False";
	}
}
 
  
}