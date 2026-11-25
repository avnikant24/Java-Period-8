class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
  //P1 - In the init function, create an array of friends.\\
   void init() {
       String[] friends = { "Alice", "Bob", "Charlie" };
        return String[];
   }
   
//Problem 2:
//Write a function convert that accepts an array of temperatures in celsius and converts each temperature to farhenheit and returns a new array with the convert temperatures.
//Use the CelsiusToFarhenheit function given to you.
  

  double celsiusToFarhenheit(double c){
        return c*9/5+32;
  }
  double[] convert(double[] temperatures) {
    double[] result = new double[temperatures.length];

    for (int i = 0; i < temperatures.length; i++) {
        result[i] = celsiusToFahrenheit(temperatures[i]);
    }

    return result;
}
}