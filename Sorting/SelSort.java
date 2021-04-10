class SelectionSort
{
    int[] num = new int[]{33,89,11,45,90,23,45,9};
    void Sort()
    {
        for(int i = 0;i<num.length;i++)
        {
            int minindex = i; 
            for(int j = i;j<num.length;j++)
            {
                if(num[j]<num[minindex])
                minindex = j;
            }
            int temp = num[i];
            num[i] = num[minindex];
            num[minindex] = temp;
        }
        for(int i = 0;i<num.length;i++)
        {
            System.out.println(num[i]);
        }
    }
}
public class SelSort
{
	public static void main(String[] args) 
	{
	    SelectionSort obj = new SelectionSort();
	    obj.Sort();
	}
}
