package kata2;

import java.util.Map;

public class Kata2 {


    public static void main(String[] args) {
       int[] data = {1, 2, 4, 6, 7, 8 ,1 ,5, 9, 2, 1, 7 ,2, 6, 5};
       Histogram histo = new Histogram(data);
       Map<Integer, Integer> histogr = histo.GetHistogram();
        
        for (Map.Entry<Integer, Integer> entry : histogr.entrySet()) {
            System.out.println(entry.getKey() + " ==> " + entry.getValue());
        }
    }
    
}