public class arrayTest2 {
    public static void main(String[] args) {
        /*test script for 2-D array
        */
        int[][] ids = {{1,2,3},{4,5},{8,9,0}};

        for (int i=0;i<ids.length;i++){
            for (int j=0;j<ids[i].length;j++){
                System.out.print(ids[i][j]+"\t");
            }
        //separate each unit of array by \n
        System.out.println();
        }
    }
}
