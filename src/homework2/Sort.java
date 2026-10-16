package homework2;

class Sort
{
    public static void main(String args[ ])
    {
        int a[ ]={1,3,5,6,0,2,7,9,8};
        int temp;
        int k;
        int len=a.length;
        for (int i=0;i<len-1; i++)
        {
            k=i;
            for(int j=i+1;j<len;j++)
            {
                if (a[k]>a[j]) k=j;
            }
            temp=a[i]; a[i]=a[k];a[k]=temp;
        }
        for(int i=0;i<len; i++)
            System.out.print(a[i]+" ");
    }
}