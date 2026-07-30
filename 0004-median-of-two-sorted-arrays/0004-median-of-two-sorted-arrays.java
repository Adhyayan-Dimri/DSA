import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int k=0;
        double Median=0;
        int a[]=new int[n1+n2];
        for(int i=0;i<n1;i++){
            a[k]=nums1[i];
            k++;
        }
        for(int i=0;i<n2;i++){
            a[k]=nums2[i];
            k++;
        }
        Arrays.sort(a);
        int l=a.length;
        if(l%2==0){
             Median=(a[(l/2)-1]+a[l/2])/2.0;
        }
        else{
             Median=a[l/2];
        }
        return Median;

    }
}