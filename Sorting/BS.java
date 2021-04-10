class BinarySearch
{
    int[] num = new int[]{7,4,3,9,14};
    int ele;
    int Search()
    {
        // to find element 4
        ele = 7;
        int i,start = 0,end = num.length - 1,mid;
        while(start<=end)
        {
            mid = (start + end)/2;
            if(num[mid] == ele)
            {
                return mid;
            }
            else if(ele > num[mid])
            {
                start = mid + 1;
            }
            else if(ele < num[mid])
            {
                end = mid - 1;
            }
        }
        return -1;
    }
}
public class BS
{
	public static void main(String[] args) 
	{
	    BinarySearch obj = new BinarySearch();
	    int d = obj.Search();
	    if(d == -1)
	    {
	        System.out.println("Not found");
	    }
	    else
	    {
	        System.out.println("Element found at "+(d+1)+" position");
	    }
	}
}
