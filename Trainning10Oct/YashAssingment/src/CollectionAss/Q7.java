package CollectionAss;



import java.util.ArrayList; 

import java.util.List; 

import java.util.stream.Stream;  

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

public class Q7{ 

    public static void main(String[] args) { 

        List<Product> list=new ArrayList<Product>(); 

        list.add(new Item(1,"Samsung A5",17000f)); 

        list.add(new Item(3,"Iphone 6S",65000f)); 

        list.add(new Item(2,"Sony Xperia",25000f)); 

        list.add(new Item(4,"Nokia Lumia",15000f)); 

        list.add(new Item(5,"Redmi4 ",26000f)); 

        list.add(new Item(6,"Lenevo Vibe",19000f));            

        Stream<Item> filtered_data = list.stream().filter(p -> p.price > 20000);            

                filtered_data.forEach( 

                t -> System.out.println(t.name+": "+t.price) 

        ); 

    } 

} 
