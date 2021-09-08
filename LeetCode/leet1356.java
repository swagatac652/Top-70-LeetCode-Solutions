import java.util.*;
public class leet1356 
{
    public static int hammingWeight(int n)
    {
        int counter=0;
		while (n!=0){
			int temp = n & -n;
			n-=temp;
			counter++;
		}
		return(counter);
    }   
    public static int[] sortByBits(int[] arr)
    {
        ArrayList<Integer> lst = new ArrayList<>(arr.length);
		for(int i:arr){
			lst.add(i);
		}
		Collections.sort(lst,(a,b)-> hammingWeight(a)==hammingWeight(b) ?a-b :hammingWeight(a)-hammingWeight(b));
		for (int i = 0; i < arr.length; i++) {
			arr[i]=lst.get(i);
		}
		return arr;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of array elements");
        int n = scanner.nextInt();
        if(n>0 && n<100)
        {
            int arr[] = new int[n];
            System.out.println("Enter array elements");
            for(int i=0; i<n; i++)
            {
                arr[i] = scanner.nextInt();
            }
            //int temp[]=sortByBits(arr);
            System.out.println("Sorted array is");
            for(int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
        }
        else{
            System.out.println("Enter value between 1 and 100");
        }
        scanner.close();
    } 
}
