class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){

//ch1//
double allowance(int days, int dayone, int total, int target){
    int days = 1;
    int dayone = 1;
    int total = 1;
    int target = 500;

while (total < target){
  days++;
  dayone *= 2
  total += dayone;
}
  return days;
}
}

//ch2//

int addTwoNumbers(int num1, int num2){
	int num1 = randInt(1, 10);
  int num2 = randInt(1,10);
  int sum = num1 + num2;
	print(“What is the sum of these two numbers?”);
	int sum = Input.readInt();
	while(!(num == sum)){
		print(“Incorrect, try again”);
  }

//ch3//

int GCF(int number1, int number2){
  int number1 = randInt(1, 10);
  int number2 = randInt(1,10);
   while (number2 != 0) {
            int temp = number2;
            number2 = number1 % number2;
            number1 = temp;
        }
        return number1;
    }
}


  }



  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}