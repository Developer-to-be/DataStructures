public class SortNegPosElements {
    public static void main(String[] args) {
        int[] arr = {-1,-2,2,-3,5};

        int i=0;
        int j=0;

        while(j<arr.length){
            if(arr[j]<0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            j++;
        }

        for(int elem : arr){
            System.out.print(elem + "  ");
        }
    }
    
}
