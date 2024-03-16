//size of single tile=2x1
//the function totalNumberOfWays returns the total no. of ways the tiles can be arranged on the floor

public class tilingProblem {
    public static int totalNumberOfWays(int n){//2 x n is the size of the floor
        if(n==0  || n==1){
            return 1;
        }
        return totalNumberOfWays(n-1)+totalNumberOfWays(n-2);
        //here totalNumberOfWays(n-1)==>tiles arranged vertically
        //here totalNumberOfWays(n-2)==>tiles arranged horizontially
    }
    public static void main(String[] args) {
        System.out.println(totalNumberOfWays(3));
    }
    
    
}
