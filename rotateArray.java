import java.util.Scanner;

public class rotateArray {
    static int n,stp,side;
    static int []arr1,arr3;

    public static void getData()  {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        n=sc.nextInt();
        arr1=new int[n];
        arr3 =new int[n];

        System.out.println("Enter the array");
        for (int i = 0; i <n ; i++) {
            arr1[i]= sc.nextInt(); // accepting arr1
        }


        System.out.println("Which side would you like to rotate\n" +
                "1 for Left\n" +
                "2 for Right");
        side = sc.nextInt();

        System.out.println("Enter the number of steps");
        stp=sc.nextInt();
    }
    public static void left(){
        for (int i = 0; i <n-stp ; i++) {
            arr3[i]=arr1[stp+i]; // putting (elements - steps ) items in arr3
        }
        for (int i = 0; i < stp; i++) {
            arr3[n-stp+i]=arr1[i];// putting stp items in arr3
        }
        System.out.println("The Resultant rotated array is ");
        for (int i = 0; i <n ; i++) {
            System.out.println(arr3[i]); // displaying resultant array i.e. arr3
        }
    }
    public static void right(){
        for (int i = 0; i < stp; i++) {
            arr3[i]=arr1[n-stp+i];// putting  steps (stp) items in arr3
        }
        for (int i = 0; i < n - stp; i++) {
            arr3[stp+i]=arr1[i]; //putting remaining (elements-stp) items from arr1 to arr3
        }
        System.out.println("The Resultant rotated array is ");
        for (int i = 0; i <n ; i++) {
            System.out.println(arr3[i]); // displaying resultant array i.e. arr3
        }
    }
    public static void main(String[] args) {
        getData();
        if (side==1) { // for rotating left
            left();
        } else if (side==2) {  // for rotating right
            right();
        } else {
            System.out.println("Wrong input");
        }
    }

}
