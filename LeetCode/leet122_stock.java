public  class leet122_stock 
{
    public static int maxProfit(int price[])
    {
        int profit=0;
        for(int i=1; i<price.length; i++)
        {
            if(price[i]>price[i-1])
            profit=profit+(price[i]-price[i-1]);
        }
        return profit;
    }
    public static void main(String[] args)
    {
        int stock[] = {1,5,3,8,12};
        int profit = maxProfit(stock);
        System.out.println("Max profit is "+profit);
    }
}
