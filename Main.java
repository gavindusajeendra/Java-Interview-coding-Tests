//Find duplicate characters in a given string.
//I convert the string into a character array and store the count of each character in a HashMap.
//Then I iterate through the map and print characters whose count is greater than one.

import java.util.HashMap;
import java.util.Map;
public class Main{
   public static void main(String[] args){
       String str = "programming";
       Map<Character, Integer> map = new HashMap<>();
       
       for(char ch: str.toCharArray()){
          map.put(ch, map.getOrDefault(ch, 0) + 1);
       }

       for(Map.Entry<Character, Integer> entry : map.entrySet()){
          if(entry.getValue() > 1){
              System.out.println(entry.getKey());
          }
       }
   }
}


//Simple Logic – No Collections
/* public class Test{
      public static void main(String[] args){
           String str = "programming";
           for(int i =0; i<str.length(); i++){
               for(int j= i+1; j<str.length(); j++){
                     if(str.charAt(i)== str.charAt(j)){

                         System.out.println(str.charAt(i));
                         break;
                     }
               }
           }
     }
}
 */