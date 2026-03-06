public class Q12 {
    public static void main(String[] args){
        int[] arr1={1,2,3,4,5,6,7,8,9,10};
        int[] arr2={5,7,4,10,18,19,12,1,3};
        int arr1len=arr1.length;
        int arr2len=arr2.length;
        int[] arr3=new int[arr1len+arr2len];
        int k=0;
        for(int i=0;i<arr1len;i++){
            for(int j=0;j<arr2len;j++){
                if(arr1[i]==arr2[j]){
                    arr3[k]=arr1[i];
                    k++;
                }
            }
        }
        System.out.println("Common Array is: ");
        for(int i=0;i<k;i++){
            System.out.println(arr3[i]);
        }
    }
}
