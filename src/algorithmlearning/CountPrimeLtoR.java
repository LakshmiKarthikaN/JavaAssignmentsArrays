package algorithmlearning;

public class CountPrimeLtoR {
    public static void main(String[] args) {
        int l = 11;
        int r = 41;
        int count = 0;
        boolean[] prime = new boolean[r+1];
        for(int i = 2;i*i<=r;i++){
            if(prime[i]==false){
                for(int j = i*i;j<=r;j+=i){
                    prime[j]=true;
                }
            }
        }
        for(int i = l;i<=r;i++){
            if(prime[i]==false) {
                System.out.println(i);
                count++;

            }
        }
        System.out.println(count);
    }
}
