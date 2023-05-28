package week1.day1;

public class FibonacciSeries { 
	

    public static void main(String[] args) {

        int n = 8, firstNum = 0, secNum = 1, sum;


        System.out.print(firstNum + " " + secNum);

        for (int i = 2; i < n; i++) {
            sum = firstNum + secNum;
            System.out.print(" " + sum);
            firstNum = secNum;
            secNum = sum;
        }

    }

}
