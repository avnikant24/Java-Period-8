class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
  //ch1\\

String creditCardType(String num){
  if (num.substring(0,1).equals("4")){
    return "American Express";
  }else if(num.substring(0,2).equals("34") || num.substring(0,2).equals("37")){
    return "Visa";
  }else if(num.substring(0,2).equals("51") || num.substring(0,2).equals("55")){
    return "Mastercard"
  }else if(num.substring(0,2).equals("6011") || num.substring(0,2).equals("65")){
    return "Discovery";
}

//ch2Write a function pigLatin which accepts a word and return a new word made up by switch the fist letter to the end of the word and adding a "ay" after. Example: "pig"==> "igpay" Challenge 2:\\

String pigLatin(String word){
  return word.substring(1) + word.substring(0,1) + "ay";
}

//ch3\\

String nycLocate(String zip){
  String pre = zip.substring(0,3);

  if(pre.equals("100") || pre.equals("101") || pre.equals("102"))
    return "Manhattan";
  else if(pre.equals("103"))
    return "Staten Island";
  else if (pre.equals("104"))
    return "Bronx";
  else if (pre.equals("112"))
    return "Brooklyn";
  else if (pre.equals("113") || pre.equals("111") || pre.equals("114"))
    return "Queens";
  else 
    return "Unknown";
}

//ch4\\
  }

  
  
}