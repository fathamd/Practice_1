package demoStingOperationPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class sortArrayList  
{  
public static void main(String args[])  
{  
//creating an object of ArrayList class  
ArrayList<Integer> list = new ArrayList<Integer>();  
list.add(1);  
list.add(3);  
list.add(4);  
list.add(6);  
list.add(2);  
list.add(5);  
list.add(7);  
 

Collections.sort(list);  
  
System.out.println("ArrayList After Sorting:");  
for (int i = 0; i < list.size(); i++) {
	if(i%2 ==0)
    System.out.println(list.get(i));
}  
}  
}  