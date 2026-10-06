class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){


// Challenge 1

void print(String S){
	System.out.println(S);
}

// Challenge 2
double FtoC(double fahrenheit){
	double result = (fahrenheit - 32.0) * 5.0 / 9.0;
	return result;
}

// Challenge 3
double sphereVolume(double radius){
	double result = 4/3. * Math.PI * radius * radius * radius;
	return result;
}

// Challenge 4
double coneVolume(double r1, double height){
	double result = Math.PI * r1 * r1 * (height)/3.;
	return result;
}

// Challenge 5
double distance(double x1, double y1, double x2, double y2){
	double result = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	return result;

}
  }
 
}