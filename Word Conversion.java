import java.util.*;
public class Tp {
  
  // Written by @DavidCab11
  
  public static final Scanner reader = new Scanner (System.in);
  public static void main(String[] args) { 
    
    System.out.print("Enter the word you wish to be changed: ");
    String s = reader.nextLine();
    
    System.out.println("Converted word is now: "+textConversion(s)); 
    
    
  }
  
  public static String textConversion(String s){
    String result = "";
    for(int i = 0 ;i< s.length();i++){
      char c = s.charAt(i);
      
      if (c == 'a' || c== 'A'){
        c = '5';
        
      }else if(c == 'e' || c == 'E'){
        c = '8';
        
      }else if(c == 'i' || c == 'I'){
        c = '9';
        
      }else if(c == 'o' || c == 'O'){
        c = '2';
        
      }else if(c == 'u' || c == 'U'){
        c = '1';
        
      }
      result = result + c;
      
      
    }
    
    return result;
    
  }
}

