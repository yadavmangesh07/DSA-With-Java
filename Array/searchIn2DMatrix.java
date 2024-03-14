public class searchIn2DMatrix {
    public static boolean search(int arr[][],int key){
        int row=arr.length-1;
        int col=0;
        while(row>=0 && col<=arr.length-1){

        
        if(key==arr[row][col]){
            System.out.println("("+row+","+col+")");
            return true;
        }
        else if(key>arr[row][col]){
            col++;
        }
        else{
            row--;
        }
        }
        System.out.println("Element Not Found !");
        return false;

    }
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(search(arr, 10));
        
    }
    
}
