package collectionss;
import java.util.*;
class prgm1{  
   public static void main(String args[]){  
        
      ArrayList<String> gym=new ArrayList<String>();  
      gym.add("Dumbbell");
      gym.add("Situpbar");
      gym.add("Forearm Strengthner");
      gym.add("Weights");
      gym.add(0, "Barbell");
      gym.add(0, "Powerack");
      System.out.println(gym);
}
}