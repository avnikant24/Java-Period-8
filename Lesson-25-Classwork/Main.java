class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    // Challenge1: Read in the file Original.txt and store it in a variable
    msg = Input.readFile("Original.txt");
    encodedMsg = encode(msg);
    Input.writeFile("Encode.txt",encodedMsg);

    
  }

   // Challenge2: 
  //  Write the function encode that takes in a string
  //  and create a new string that using a caesar cipher 
  // by shifting all ascii values by 3.  Don't worry about
  // wrapping arount the alphabet.

String encode(String txt){
    String bld="";
    int ascii;
    char ch='\0';
    for(int x=0; x<=txt.length()-1;x++){
      ch=txt.charAt(x);
      ascii=(int)ch;
      
      if(ascii == 90){
        ascii = 65;
      }
      else if( ascii == 122){
        ascii = 97;
      }
      else{
        ascii+=1;
      }
      bld+= (char)ascii;
    }
     
    return bld;
  }

  // Challenge3: 
  //  Write the function decode that takes in a string
  //  and reverses what the function in chanllenge 2
  //  so that you get the original message.

    String decode(String txt){
    String bld="";
    int ascii;
    char ch='\0';
    for(int x=0; x<=txt.length()-1;x++){
      ch=txt.charAt(x);
      ascii=(int)ch;
      
      if(ascii == 65){
        ascii = 90;
      }
      else if( ascii == 97){
        ascii = 122;
      }
      else{
        ascii-=1;
      }
      bld+= (char)ascii;
    }
    return bld;
  }

  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}