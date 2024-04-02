public class Problem1{
  public static void main(String[] args){
    int arr[] = {-1,2,3,3,-5,5,2,-1};
    int k = 4;
    int max = Integer.MIN_VALUE;
    // find the 4 continous no in the array that has the maximum sum
    int pointer1 = 0;
    int pointer2 = k-1;
    while(pointer2 < arr.length){
      int sum = 0;
      for(int i=pointer1;i<=pointer2;i++){
        sum+=arr[i];
      }
      max = Math.max(max, sum);
      pointer1++;
      pointer2++;
    }
    System.out.println(max);
  }
}