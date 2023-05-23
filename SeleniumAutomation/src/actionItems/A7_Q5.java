package actionItems;

public class A7_Q5 {

	public static void main(String[] args) {
	int[]myArray = {10, 25, 12, 69, -6785, 5687654};
	System.out.println("The highest number of this array>>"+ highestnumber(myArray));
	}
	public static int highestnumber(int[] array) {
		int highestNum = 0;
		for (int num:array) {
			if (num > highestNum) {
				highestNum =num;
				
			}
		}
		return highestNum;
		
	}

}
