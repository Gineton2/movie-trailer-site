// This Matrix class a contructor that has already been completed for you.
// It takes a int[][] as a parameter and saves it in the instance variable, marix
// Your task is to complete the sumOfEvenNumbers method to calculate and return the sum of all
// the even numbers in the array.
//
//Note that this is talking about the values themselves which are even and not about even indexes

public class Matrix
{
    private int[][] matrix;

    /**
     * Constructor for objects of class Matrix
     * @param array a 2-d array
     */
    public Matrix(int[][] array)
    {
       matrix = array;
    }


    /**
     * Gets the sum of all the even numbers in the matrix
     * @return the sum of all the even numbers
     */
    public int sumOfEvenNumbers()
    {
         // TODO: Return the sum of all the numbers which are even
         int sumEven = 0;
         for (int i = 0; i < matrix.length; i++)
         {
             for (int j = 0; j < matrix[0].length; j++)
             {
                 int num = matrix[i][j];
                 if (num % 2 == 0)
                 {
                     sumEven += num;
                 }
             }
         }
         return sumEven;
    }

}
