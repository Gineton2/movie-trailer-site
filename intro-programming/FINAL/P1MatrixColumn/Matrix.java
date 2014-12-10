// This Matrix class a contructor that has already been completed for you.
// It takes a int[][] as a parameter and saves it in the instance variable, marix
// Your task is to complete the numberOfColumns method to return the number of columns in the
// matrix


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
     * Gets the number of columns
     * @return the number of columns
     */
    public int numberOfColumns()
    {
        // TODO: get the number of cloums
        return matrix[0].length;
    }
}
