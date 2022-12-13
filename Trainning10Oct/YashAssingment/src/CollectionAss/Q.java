package CollectionAss;

//import java.util.*; 
//public class Q5{ 
//    public static void main(String[] s) {            
//        List<String> list=new ArrayList<String>(); 
//        list.add("anil"); 
//        list.add("sunil"); 
//        list.add("ajay"); 
//        list.add("vijay");            
//        list.add("sanjay");            
//        list.add("vinod");            
//        list.forEach( 
//            (n)->System.out.println(n) 
//        ); 
//    } 
//} 






import java.util.ArrayList;
 
import java.util.Collections; 
import java.util.List; 
class Item{ 
    int id; 
    String name; 
    float price; 
    public Item(int id, String name, float price) { 
        super(); 
        this.id = id; 
        this.name = name; 
        this.price = price; 
    } 
} 
public class Q{ 

    public static void main(String[] args) { 

        List<Item> list=new ArrayList<Item>();          
        list.add(new Item(1,"shirt",1000f)); 
        list.add(new Item(3,"tshirt",300f)); 
        list.add(new Item(2,"jeans",150f));            
        list.add(new Item(4,"jacket",1500f));           
        Collections.sort(list,(p1,p2)->{ 
        return p1.name.compareTo(p2.name); 
        }); 
        for(Item p:list){ 
            System.out.println(p.id+" "+p.name+" "+p.price); 
        }    
    } 
} 