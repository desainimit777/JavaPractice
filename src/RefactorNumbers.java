class RefactorNumbers {

    public static void main(String[] args) {
        int arr[]={9, 4, -2, -1, 5, 0, -5, -3, 2};
        int n=9;
        RefactorNumbers.rearrange(arr,n);
    }

    public static void rearrange(int arr[],int n) {
        int neg=0;
        int pos=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
                neg++;
            else
                pos++;
        }

        int posArr[] =new int[pos];
        int negArr[] =new int[neg];

        for(int i=0;i<n;i++)
        {
            System.out.println("Hi");
            System.out.println("Written by Nimit");
        }
    }
}

