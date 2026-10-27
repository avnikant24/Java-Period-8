class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
//Challenge 1: Write a function spaces that accepts an integer N and returns a string with N spaces. In the init function display the space with the work "DONE" concatentated at the end.\\

String spaces(int N){
  String bld = "";

  for (int x = 0; x < N; x++){
    bld+= "";
  }
  return bld;
}

//Challenge 2:
//Write a function harmonic that accepts an integer N and return the sum of:
//1/1 + 1/2 + 1/3 + ...+ 1/N

double harmonic(int N){
double sum = 0;
for (int x = 1; x <= N; x++){
  sum += 1.0/x;
}

}

//Challenge 3:
//Approximate the function sine. Using the formula in Sine.PNG
//Write a function sin that accepts the number of terms to sum and the degree in radiant (pi/6) and return the sum.
  double sine(int N, double x){
    double sum=0;
    int sign=1;
    for(int i=1; i<2*N;i+=2){
      sum+= sign * Math.pow(x,i)/fact(i);
      sign*=-1;
    }
    return sum;
  }

//Challenge 4:
//Write function fib where the function accepts a integer N and displays the first N fibinocci numbers. The sequence of numbers are 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,...
//Example: N=6 , the function displays: 0, 1, 1, 2, 3, 5

fib1 = 0
fib2 = 1
int fib(int N){
  for (____)
    next.fib = fib1 + fib2;
    fib1 = fib2;
    fib2 = next.fib;
}

//Challenge 5:
//Create a function mTable that displays the multiplication table as shown in file MTable.png
//HINT: Create a function nRow that can generate and display the numbers in a row. Use that function within a loop to generate all the rows.
     void mTable(){
    String heading ="    |";
    String heading2="_____";
    for(int x=1; x<=12;x++){
      heading+=String.format("|%3d",x);
      heading2+=String.format("____");
    }
    print(heading+"|");
    print(heading2+"_");
    
    //Now create each row of the table
    for(int x=1; x<=12;x++)
      print(tableRow(x));
    
  }
    
  }


  
}