class LinearSearch
{
    int[] num = new int[]{1,2,3,4,5};
    int ele;
    void Search()
    {
        // to find element 4
        ele = 4;
        int i;
        for(i = 0;i<num.length;i++)
        {
            if(num[i] == ele)
            {
                System.out.println("Found element "+ele+" at "+(i+1)+"th position");
                break;
            }
        }
        if(i>=num.length)
        {
            System.out.println("Element not found");
        }
    }
}
public class LS
{
	public static void main(String[] args) 
	{
	    LinearSearch obj = new LinearSearch();
	    obj.Search();
	}
}
