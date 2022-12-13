package CollectionAss;

import java.util.ArrayList;
import java.util.List;

public class JSExa1 { 

    public static void main(String[] args) { 
        List<Item> list = new ArrayList<Item>(); 

        list.add(new Product(1,"laptop",65000f)); 
        list.add(new Product(2,"lcd tv",35000f)); 
        list.add(new Product(3,"mobile",35000f)); 
        list.add(new Product(4,"watch",2000f)); 
        list.add(new Product(5,"Apple Laptop",90000f)); 
        List<Float> pset =list.stream() 
                        .filter(p -> p.price > 30000).map(p->p.price).collect(Collectors.toSet());

        System.out.println(pset); 

    } 

}
