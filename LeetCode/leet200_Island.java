import java.util.*;
public class leet200_Island
{
    public static int numIslands(char[][] grid)
    {
        int count =0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    count++;
                    callBFS(grid,i,j);
                }
            }
        }
        return count;
    }
    public static void callBFS(char[][] grid, int i, int j)
    {
        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]=='0')
        return;

        grid[i][j]='0';
        callBFS(grid,i+1,j);//up
        callBFS(grid,i-1,j);//down
        callBFS(grid,i,j-1);//left
        callBFS(grid,i,j+1);//right
    }
    public static void main(String[] args)
    {
        Scanner br = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int m = br.nextInt();
        int n = br.nextInt();
        char c;
        if(m>=1 && n<=300)
        {
            char grid[][] = new char[m][n];
            System.out.println("Enter array elements"); 
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    c=br.next().charAt(0);
                    if(c=='0' || c=='1')
                    grid[i][j]=c;
                    else
                    System.out.println("Enter only 0 or 1");
                }
            }

            int count = numIslands(grid);

            System.out.println("Number of islands: " + count);
        }
        else
        {
            System.out.println("Enter values more than 1 and less than 300");
        }
        br.close();
    }
}