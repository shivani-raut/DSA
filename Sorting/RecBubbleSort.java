class BubSortReC
{
   
    void Sort(int[] num,int n)
    {
        if(n==1)
        return;
        for(int i = 0;i<num.length;i++)
        {
            for(int j = 0;j<num.length - 1;j++)
            {
                if(num[j] > num[j+1])
                {
                    int temp = num[j+1];
                    num[j+1] = num[j];
                    num[j] = temp;
                }
            }
        }
        Sort(num,n-1);
    }
}
public class RecBubbleSort
{
	public static void main(String[] args) {
	    int[] num = new int[]{16 ,78 ,34 ,90 ,67 ,34};
	    int n = num.length;
		BubSortReC obj = new BubSortReC();
		obj.Sort(num,n);
		for(int i = 0;i<num.length;i++)
        {
            System.out.println(num[i]);
        }
	}
}
