class InsSort
{
   
    void Sort(int[] num,int n)
    {
        for(int i = 0;i<num.length;i++)
        {
            int key = num[i];
            int j = i - 1;
            
            while(j>=0 && num[j]>key)
            {
                num[j+1] = num[j];
                j = j - 1;
            }
            num[j+1]= key;
        }
        
    }
}
public class InsertionSort
{
	public static void main(String[] args) {
	    int[] num = new int[]{16 ,78 ,34 ,90 ,67 ,34};
	    int n = num.length;
		InsSort obj = new InsSort();
		obj.Sort(num,n);
		for(int i = 0;i<num.length;i++)
        {
           System.out.println(num[i]);
        }
	}
}
