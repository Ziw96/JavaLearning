public class arrayTest {
    public static void main(String[] args){
        //声明数组
        int[] ids;
        // initial value (static, given value)
        ids = new int[]{1001,1002,1003,1004,1005};
        // initial value (separately define array and give values)
        String[] names = new String[5];
        names[0] = "李";
        names[1] = "子";
        names[2] = "为";
        names[3] = "Ziwei";
        names[4] = "Ricky";

        System.out.println("The length of the names is "+names.length);
        for (int i=0; i< names.length;i++){
            System.out.println(names[i]);
        }

        
    }
}