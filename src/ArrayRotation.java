import java.util.Scanner;
public class ArrayRotation {
    static int[] Rotation(int[] array, int i, int j)
    {
        int temp=0;
        while(i<j)
        {
            temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            i++;
            j--;
        }

        return array;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=scanner.nextInt();
        int array[]=new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++)
        {
            array[i]= scanner.nextInt();
        }
        System.out.println("Enter value: ");
        int b=scanner.nextInt();

        if(b>n)
        {
            b=b%n;
        }
        int result[]=Rotation(array,0,n-1);
        result=Rotation(array,0,b-1);
        result=Rotation(array,b,n-1);
        for(int i=0;i<n;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
}