import java.util.Scanner;
public class newp {
    public static void main(String[] args) {
        // TODO code application logic here
       // int[] arr={1,2,3,4,5};
        int num,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of values you want in array");
        num=sc.nextInt();
        int a[]=new int[num];
         System.out.println("Enter all the elements");
         for(int i=0; i<num; i++){
             a[i]=sc.nextInt();
             sum=sum+a[i];
             
         }
               System.out.println("sum:"+sum);  
    }


}
