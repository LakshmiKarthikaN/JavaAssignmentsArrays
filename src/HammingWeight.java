public class HammingWeight {
    public static void main(String[] args) {
        int n=120;
        int[] binary=new int[35];
        int count=0;
        int index=0;
        while(n>0){
            binary[index++]=n%2;
            n/=2;
        }
        for(int i=0;i<binary.length;i++){
            if(binary[i]==1){
                count++;
            }
        }System.out.println(count);
    }
}

