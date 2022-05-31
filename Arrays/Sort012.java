public class Sort012 {
    public static void main(String[] args) {
        int[] a = {0,2,1,2,1,0,1};

        int l=0;
        int m=0;
        int r = a.length-1;
        
        while(m<=r){
            if(a[m] == 1){
                m++;
            }
            else if(a[m] == 2){
                int temp = a[r];
                a[r] = a[m];
                a[m] = temp;
                r--;
            }
            else{
                int temp = a[l];
                a[l] = a[m];
                a[m] = temp;
                l++;
                m++;
            }
        }

        for(int i : a){
            System.out.print(i + "   ");
        }
    }
}
