package com.training.Java8.Assingment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class City {

	int cityid;
	String cityname;
	
	Float pollutionIndex;
	int population;
	int area_of_city;
	State objState;
	
	
	public City(int cityid, String cityname, Float pollutionIndex, int population, int area_of_city, State objState) {
		super();
		this.cityid = cityid;
		this.cityname = cityname;
		this.pollutionIndex = pollutionIndex;
		this.population = population;
		this.area_of_city = area_of_city;
		this.objState = objState;
	}


	public int getCityid() {
		return cityid;
	}

	public void setCityid(int cityid) {
		this.cityid = cityid;
	}

   public String getCityname() {
		return cityname;
	}


	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public Float getPollutionIndex() {
		return pollutionIndex;
	}

	public void setPollutionIndex(Float pollutionIndex) {
		this.pollutionIndex = pollutionIndex;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public int getArea_of_city() {
		return area_of_city;
	}

	public void setArea_of_city(int area_of_city) {
		this.area_of_city = area_of_city;
	}

	public State getObjState() {
		return objState;
	}

	public void setObjState(State objState) {
		this.objState = objState;
	}


	public static void main(String[] args) {
		
		List<City> list = new ArrayList<>();
		
		State st = new State(36, "Mh");
		list.add(new City(1, "pune", 44.5f, 12300000, 30300, st));
		list.add(new City(2, "nagpur", 30.6f,4035900, 40200, st));
		list.add(new City(3, "nashik", 10.0f,4567700, 3200, st));
		
		State st1 = new State(38, "bihar");
		list.add(new City(4, "Aria", 30.6f,4035900, 40200, st1));
		list.add(new City(5,"aurangabad", 22.0f, 309889, 2039,st1));
//		list.add(new City(6,"Kishanganj", 40.0f, 5679889, 339,st1));
		
		
		State st2 = new State(50, "mp");
		list.add(new City(7, "bhopal", 50.6f,8086700, 50200, st2));
		list.add(new City(8,"indore", 10.0f, 39889, 2099,st2));
		list.add(new City(9,"burhanpur", 40.0f, 59889, 444,st2));
		

		
		System.out.println("---------------------- 1 ---------------------------");
		//1. WAP to find the city with less area and highest population

		
		City obj = list.stream().max((s1, s2) -> s1.population > s2.population ? 1 : -1).get();
        System.out.println("highest population city =" + obj.cityname + " "+ obj.population);

        
        City obj1 = list.stream().min((s1, s2) -> s1.area_of_city > s2.area_of_city ? 1 : -1).get();
        System.out.println("less  area  city  =  " + obj1.cityname+" "+ obj1.area_of_city);

        
        
        System.out.println("______________________2 ________________________");
        
        //2. WAP to find the city with high pollution_index and high city area. 

        City cobj = list.stream().max((s1, s2) -> s1.pollutionIndex > s2.pollutionIndex ? 1 : -1).get();
        System.out.println("high pollutionIndex city =" + cobj.cityname + " "+ cobj.population+" "+cobj.pollutionIndex);

        
        City cobj1 = list.stream().max((s1, s2) -> s1.area_of_city > s2.area_of_city ? 1 : -1).get();
        System.out.println("highest city area =  " + cobj1.cityname+" "+ cobj1.area_of_city);
        
        
        System.out.println("------------------3-----------------------------");
        //3. WAP to print the city detail on the basis of lowest pollution_index first and so on.
        
        List<City> clow =list.stream().sorted((s1, s2) -> s1.pollutionIndex > s2.pollutionIndex ? 1 : -1).collect(Collectors.toList());;
        
        System.out.println("city detail on the basis of lowest pollution_index first ");
       
        for (City c : clow)
        {
          System.out.println(c.pollutionIndex+"  "+c.cityid+" "+ c.cityname +"  "+ c.population+"  "+c.objState.statename);
        }
        
        System.out.println("*****************  4  ******************");
        
        //4 WAP to print city with lowest pollution index and lowest area of city.
        
        City cityobj = list.stream().min((s1, s2) -> s1.pollutionIndex > s2.pollutionIndex ? 1 : -1).get();
        System.out.println("city with lowest pollution Index =" + cityobj.cityname + " "+ cityobj.population+" "+cityobj.pollutionIndex);

        City city = list.stream().min((s1, s2) -> s1.area_of_city > s2.area_of_city ? 1 : -1).get();
        System.out.println("less  area  city  =  " + city.cityname+" "+ city.area_of_city);
        
        
       System.out.println("________________________  5 count _____________________________");
         //5. WAP to count how many cities in every state we are having. 

       String st6="";
       long cnt=0;
       System.out.println("count city in every state");
       for (City l2 : list)
       {
		 String statename = l2.objState.getStatename();
		 st6=statename;
		 long count = list.stream().filter(e->e.objState.statename.equals(statename)).count();
		 cnt=count;
		 System.out.println(statename+"   "+count);
	   }
     //  System.out.println("single state "+st6+"   "+cnt );
//       long count = list.stream().filter(e->e.objState.statename.equals("Mh")).count();
//       System.out.println("mh"+"   "+count);
	
       System.out.println("--------------------------6-----------------------------------");
       //6. WAP to print total area of each state. 
       
	   Double totalavg= list.stream().filter(s->"Mh" == s.objState.statename).collect(Collectors.averagingDouble(City::getArea_of_city));
	   Double totalavg1= list.stream().filter(s->"bihar" == s.objState.statename).collect(Collectors.averagingDouble(City::getArea_of_city));
	   Double totalavg2= list.stream().filter(s->"mp" == s.objState.statename).collect(Collectors.averagingDouble(City::getArea_of_city));

	   
	   System.out.println("Total area of Maharashtra state   :" +totalavg);
	   System.out.println("Total area of Bihar  state   :" +totalavg1);
	   System.out.println("Total area of M P state   :" +totalavg2);

	   

	}

}
