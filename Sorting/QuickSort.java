import java.util.Arrays;
class QSort
{
    void Sort(int[] num,int start,int end)
    {
        if(start<end)
        {
            int pi = Partition(num,start,end);
            Sort(num,start,pi-1);
            Sort(num,pi+1,end);
        }
    }
    int Partition(int[] num,int start,int end)
    {
        int pivot = num[end];
        int i = start - 1;
        for(int j = start;j<=end - 1;j++)
        {
            if(num[j]<pivot)
            {
                i = i + 1;
                Swap(num,i,j);
            }
        }
        Swap(num,i+1,end);
        return (i + 1);
    }
    void Swap(int[] num,int i,int j)
    {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }
}
public class QuickSort
{
	public static void main(String[] args) {
		int[] num = new int[]{13,78,23,89,34,56};
		int n = num.length;
		QSort obj = new QSort();
		obj.Sort(num,0,n-1);
		System.out.println(Arrays.toString(num));
	}
}
