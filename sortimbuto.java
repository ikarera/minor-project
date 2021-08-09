import java.util.Arrays;
import java.util.Collections;
public class SortArraysimbuto
{
    public static void main(String[] args)
    {
        String [] strarray = {"Imyembe", "Pome", "Incyeri", "Ipapayi", "Inanasi", "Umuneke", "Irongi"};
// sorts array[] in descending order
        Arrays.sort(strarray, Collections.reverseOrder());
        System.out.println("Array elements in descending order: " +Arrays.toString(strarray));
    }
}
