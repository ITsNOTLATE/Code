package WaterLogging;

public class Water {
    int wataerCapacity(int[] arr){
        int n=arr.length;
        int ans=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans=Math.max(ans,(j-i)*Math.min(arr[i],arr[j]));
            }
        }
        return ans;
    }

    int second(int[] arr){
        int s=0;
        int n= arr.length;
        int ans=0;
        int prev=0;
        while (s<n){
            ans=(n-s)*Math.min(arr[s],arr[n]);
            if(ans>prev){
                prev=ans;
            } else if (arr[s]>arr[n]) {
                n--;
            }else{
                s++;
            }
        }
        return prev;
    }

    int tripple(int[] arr){
        int i=0,j=0,k=0;
        int n=arr.length;
        int ans=0;
        while(i<n||j<n||k<n){
            int value1=Math.min(arr[i],Math.min(arr[j],arr[k]));
            int value2=Math.max(arr[i],Math.max(arr[j],arr[k]));
            if(value2-value1>ans){
                ans=value2-value1;
            }
            else if(arr[i]<arr[k]&&arr[i]<arr[j]){
                i++;
            } else if (arr[j]<arr[k]&&arr[j]<arr[i]) {
                j++;
            }else{
                k++;
            }
        }
        return ans;
    }
}
