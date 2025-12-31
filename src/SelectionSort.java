public class SelectionSort {
    public static void main(String[] args) {
        int[] a={13,46,24,52,20,9};
        int min=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[j]<min){
                    min=a[j];
                    int temp=min;
                    min=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
