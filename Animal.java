import java.util.Comparator;
import java.util.*;

public class Animal {
    public String name;
    public int legs;

    public Animal(){}

    public Animal(String name, int legs){
	this.name = name;
	this.legs = legs;
    }

    public String getName(){
	return name;
    }

    public void setName(String name){
	this.name = name;
    }

    public void setLegs(int legs){
	this.legs = legs;
    }
    
    public int getLegs(){
	return legs;
    }

    
}
