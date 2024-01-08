package pattern;
import java.util.Arrays;
public class Array 
{
	 public static void main(String[] args) {
		 int[] numbers = {54, 6, 12, 45, 25};
		 Arrays.sort(numbers); // sort the array in ascending order
		 int SecondhighestNum = numbers[numbers.length-2];//return the second last element of the sorted array
		 System.out.println(SecondhighestNum );
	 }
}
