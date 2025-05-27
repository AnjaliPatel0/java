import java.util.HashMap;
public class HashMAp {
    public static void main(String[] args) {
        HashMap<Integer ,String> map =new HashMap<>();
        map.put(1, "Anjali");
        map.put(2, "Patel");
        map.put(3,"Annn");
        map.forEach((key,value)->{
            if(value.equals("Annn")){
                System.out.println(key);
            }
       });
       



      //  HashMap<Integer ,Integer> map =new HashMap<>();
       // map.put(1, 1);
      //  map.put(2, 2);
      //  map.put(3,3);
     //   map.forEach((key,value)->{
         //   System.out.println(key + " "+ value);
      //  });
       // for(int key :map.values() ){
         //  if(key>2){
         //   System.out.println(key);
         // }
           
       // }
        
      /*   HashMap<String,Integer> map =new HashMap<>();
           map.put("hi", 1);
        map.put("hlo", 2);
         map.put("hee", 3);
        System.out.println(map.get("hi"));
        System.out.println(map.containsKey("hlo"));
        System.out.println(map.containsValue(2));
         map.remove(map);
         System.out.println(map);

         for(String key : map.keySet()){
              System.out.println(key);
         }
              */
        
    }
 }
    

