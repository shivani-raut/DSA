class BubSort
{
    int[] num = new int[]{16 ,78 ,34 ,90 ,67 ,34};
    void Sort()
    {
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
        for(int i = 0;i<num.length;i++)
        {
            System.out.println(num[i]);
        }
    }
}
public class BubbleSort
{
	public static void main(String[] args) {
		BubSort obj = new BubSort();
		obj.Sort();
	}
}
