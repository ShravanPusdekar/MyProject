import java.util.*;
;

public class intersectingArray {
    static Scanner sc=new Scanner(System.in);
    static int[]arr1,arr2;
    static int n,m;
    static HashSet<Integer> set = new HashSet<>();
    static ArrayList<Integer> result=new ArrayList<>();
    public static void getData(){
        System.out.println("Enter the number of elements of first array");
         n= sc.nextInt();
        arr1=new int[n]; // assigning the length of arr1
        System.out.println("Enter first array");
        for (int i = 0; i < n; i++) {
            arr1[i]= sc.nextInt(); // accepting first array
        }
         System.out.println("Enter the number of elements of second array");
         m= sc.nextInt();
        arr2=new int[m]; // assigning the length of arr2
        System.out.println("Enter second array");
        for (int i = 0; i < m; i++) {
            arr2[i]= sc.nextInt();   // accepting second array
        }
    }

    public static void checkIntersection(){

        for (int i = 0; i < n; i++) {
            set.add(arr1[i]);
        }
        for(int i:arr2){
          if(set.contains(i)){
              result.add(i);
              set.remove(i);
          }
        }

    }

    public static void printData(){
        System.out.println("The Intersection of two array is:"+result);
    }

    public static void main(String[] args) {
        getData();
        checkIntersection();
        printData();
    }
}
