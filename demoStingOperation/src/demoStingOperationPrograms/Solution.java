package demoStingOperationPrograms;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

    /*
     * Complete the 'getMinimumDifference' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY a
     *  2. STRING_ARRAY b
     */

	   public static List<Integer> getMinimumDifference(List<String> a, List<String> b) {
	        ArrayList<Integer> outputList= new ArrayList<Integer>(); 
	    for(int i =0; i< a.size();i++){
	        if(a.get(i).length() != b.get(i).length()){
	            outputList.add(-1);
	        }
	        else {
	            int count =0;
	            boolean status = false;
	            char ch1[] = a.get(i).toLowerCase().toCharArray();
	            char ch2[] = b.get(i).toLowerCase().toCharArray();
	            //Arrays.sort(ch1);  
	            //Arrays.sort(ch2);  
	            System.out.print(ch1); System.out.println();
	            System.out.print(ch2);
	            System.out.println();
	            status = Arrays.equals(ch1, ch2);
	            if(status){
	                outputList.add(0);
	            } else {
	             count =0;
	              for(int j = 0 ;j<ch1.length; j++){
	                if(ch1[j] != ch2[j]){
	                    count++;
	                }
	            }  
	            outputList.add(count);
	            } 
	        }
	    }
	    return outputList;

	    }

	}

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//        int aCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> a = new ArrayList<>();

//        for (int i = 0; i < aCount; i++) {
////            String aItem = bufferedReader.readLine();
//            a.add(aItem);
//        }
//
//        int bCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<String> b = new ArrayList<>();
//
//        for (int i = 0; i < bCount; i++) {
//            String bItem = bufferedReader.readLine();
//            b.add(bItem);
//        }
//
//        List<Integer> result = Result.getMinimumDifference(a, b);
//
//        for (int i = 0; i < result.size(); i++) {
//            bufferedWriter.write(String.valueOf(result.get(i)));
//
//            if (i != result.size() - 1) {
//                bufferedWriter.write("\n");
//            }
//        }
//
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
        List<String> animal1 = new ArrayList<>();

        // Adding new elements to the ArrayList
        animal1.add("Lion");
        animal1.add("Tiger");
        animal1.add("Cat");
        animal1.add("Dog");
        List<String> animal2 = new ArrayList<>();

        // Adding new elements to the ArrayList
        animal2.add("Lion1");
        animal2.add("Tigef");
        animal2.add("uyt");
        animal2.add("mnba");
        List<Integer> result = Result.getMinimumDifference(animal1, animal2);	    
        for(int i =0; i< result.size();i++){
	       System.out.println(result.get(i));
	        }
        
    }
}
