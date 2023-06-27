package collectionss;
import java.util.*;
class prgm6 {   
   public static void main(String args[]){  
        
      ArrayList<String> gym=new ArrayList<String>();  
      gym.add("Dumbbell");
      gym.add("Weights");
      gym.add("Situpbar");
      gym.add("Forearm Strengthner");
      gym.add("Barbell");
      gym.add("Powerack");
      ArrayList<String> gym_equipment=new ArrayList<String>();  
      gym_equipment.add("Barbell");  
      gym_equipment.add("Powerack");
      gym.retainAll(gym_equipment);  
      System.out.println(gym_equipment);
}
}
