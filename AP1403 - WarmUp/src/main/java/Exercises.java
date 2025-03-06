public class Exercises {

    /*
        complete this function to check if the input number is prime or not
     */

    public boolean isPrime(long n) {
        boolean isprime = true;
        if(n ==1){return false;}

        for (long i = 2; i*i <= n; i++) {
            if (n % i == 0) {
                isprime = false;
                break;
            }
        }
        if (isprime) {
            return true;
        }
        else
        {
            return false;
        }
    }


    /*
        implement an algorithm to find out the index of input number in a fibonacci sequence starting from 0, 1
        e.g. 0, 1, 1, 2, 3, 5, ...
        indices start from 0, e.g. 3 is the index 4 of this sequence
        if the input is not a fibonacci number with description above, return -1
     */

    public long fibonacciIndex(long n) {
        int a = 0, b = 1;
        boolean flag = false;
        long index = 1;
        while (b <= n) {
            int temp = b;
            b = a + b;
            index++;
            if (n == b) {
                return index;
            }
            a = temp;
        }
        return -1;
    }

    /*
        you should create a triangle with "*" and return a two-dimensional array of characters based on that
        the triangle's area is empty, which means some characters should be " "

        example 1, input = 3:
        *
        **
        ***

        example 2, input = 5:
        *
        **
        * *
        *  *
        *****

        the output has to be a two-dimensional array of characters, so don't just print the triangle!
     */
    public char[][] generateTriangle(int n) {
        if(n == 0){
            return new char[0][0];
        }
        char[][] triangle = new char[n][n];
        triangle[0][0] = '*';
        for (int i = 1; i <= n - 2; i++) {
            //print stars
            triangle[i][0] = '*';
            for (int j = 1; j <= i - 1; j++) {
                //print spaces
                triangle[i][j] = ' ';
            }
            triangle[i][i] = '*';
        }
        for (int j = 0; j < n; j++) {
            triangle[n-1][j] = '*';
        }
        return triangle;
    }

    public static void main(String[] args) {

    }
}
