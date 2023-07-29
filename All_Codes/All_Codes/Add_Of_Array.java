//addition of array

public class Add_Of_Array {
    public static void main(String[] args) {
        int [][] mat1 = {{1,2,3},
                        {9,8,7}};
        int [][] mat2 = {{4,2,6},
                        {2,3,4}}; 
        int [][] result = {{0,0,0},
                        {0,0,0}};                
        for(int i=0;i<mat1.length;i++)
        {
            for(int j=0;j<mat1[i].length;j++){
                System.out.format("Setting value of i=%d and j=%d\n" ,i,j);
                result[i][j] = mat1[i][j] + mat2[i][j];//we can also multiply * 

            
        }
    }
        for(int i=0;i<mat1.length;i++)
        {
            for(int j=0;j<mat1[i].length;j++){
                System.out.print(result[i][j]+ " ");
                
                result[i][j] =mat1[i][j] + mat2[i][j];//we can also multiply * 

            }
            System.out.println("");
    
        }
    }
}
        
    
