class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
         // Your code here
         int n1=m-l+1;
         int n2=r-m;
          int arrl[] = new int [n1];
         int arrr[] = new int [n2];
         
         int i , j ;
         
         for( i =0 ; i<n1 ; i++)
         arrl[i] = arr[l+i];
         
         for( j =0 ; j <n2 ; j++)
         arrr[j] = arr[m+1+j];
         
         i =0 ; 
         j =0 ;
         int k = l;
         
         while(i<n1 && j<n2)
         {
             if(arrl[i]<=arrr[j])
             {
                 arr[k] = arrl[i];
                 i++;
                
             }
             else
             {
                 arr[k] =arrr[j];
                 j++;
                 
             }
             k++;
         }
         
         while(i<n1)
         {
             arr[k] = arrl[i];
             i++;
             k++;
         }
         
         while(j<n2)
         {
             arr[k] = arrr[j];
             j++;
             k++;
         }
         
    }
    void mergeSort(int arr[], int l, int r)
    {
        //code here
        if(l<r){
         
     int m =l+(r-l)/2;
     mergeSort(arr,l,m);
     mergeSort(arr,m+1,r);
     merge(arr,l,m,r);
            
        }
     
    }
}
