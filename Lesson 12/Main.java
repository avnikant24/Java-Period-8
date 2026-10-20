class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
//Problem 1: Write a function collegeCredit that accepts a course code and if a course is college credit return true otherwise return false. If the sixth letter of the course code is "E" or "M" then is a college credit course.\\

boolean collegeCredit(String course){
    if (course.length() >= 6){
      String sixthLetter = course.substring(5,6);
    if (sixthLetter.equals("E") || sixthLetter.equals("M")){
      return true;
    }else{
      return false;
    }
}

//Problem 2:
//Write a function getCounselor that accepts a students official class and returns their guidance consulor based on the either the first or middle character of official class being:
//B-Berrouet
//C-Chu
//D-Dinn
//E-Eyzengart
//F-Flores
//G-Gibson
//L-Shim Lee
//M-Meltzer
//P-Paccione
//S-Fiore
//T-Tsai
//Z-Zayes

String getCounselor(String classCode) {
   
    if (classCode.length() < 1) {
        return "Unknown";
    }
 
    String firstChar = classCode.substring(0, 1);
    
    int midIndex = classCode.length() / 2;
    String midChar = classCode.substring(midIndex, midIndex + 1);
    
    if (firstChar.equals("B") || midChar.equals("B")) {
        return "Berrouet";
    } 
    else if (firstChar.equals("C") || midChar.equals("C")) {
        return "Chu";
    } 
    else if (firstChar.equals("D") || midChar.equals("D")) {
        return "Dinn";
    } 
    else if (firstChar.equals("E") || midChar.equals("E")) {
        return "Eyzengart";
    } 
    else if (firstChar.equals("F") || midChar.equals("F")) {
        return "Flores";
    } 
    else if (firstChar.equals("G") || midChar.equals("G")) {
        return "Gibson";
    } 
    else if (firstChar.equals("L") || midChar.equals("L")) {
        return "Shim Lee";
    } 
    else if (firstChar.equals("M") || midChar.equals("M")) {
        return "Meltzer";
    } 
    else if (firstChar.equals("P") || midChar.equals("P")) {
        return "Paccione";
    } 
    else if (firstChar.equals("S") || midChar.equals("S")) {
        return "Fiore";
    } 
    else if (firstChar.equals("T") || midChar.equals("T")) {
        return "Tsai";
    } 
    else if (firstChar.equals("Z") || midChar.equals("Z")) {
        return "Zayes";
    } 
    else {
        return "Unknown";
    }
}

//Problem 3: Write a function imageType that accepts a image file name and returns the image type based on the file extension.

//JPEG or JPG - Joint Photographic Experts Group
//PNG - Portable Network Graphics
//GIF - Graphics Interchange Format
//PDF - Portable Document Format

String imageType(String file){
  int dotPos = filename.indexOf(".");
  String extension = filename.substring(dotPos + 1);

  if(extension.equals("jpeg") || extension.equals("jpg")){
    return "Joint Photographic Experts Group";
  }else if(extension.equals("png")){
    return "Portable Network Graphics";
  }else if(extension.equals("gif")){
    return "Graphics Interchange Format";
  }else if(extension.equals("pdf")){
    return "Portable Document Format";
  }
}



    
  }

 
}