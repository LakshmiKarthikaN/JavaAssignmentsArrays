package algorithmlearning;

public class DrawBook {
    public static int pageCount(int n, int p) {
        if(p%2!=0){
            p = p-1;
        }else{
            p=p;
        }
        // Write your code here
        int count=0;int count1=0;
        for(int i = 0;i<=n;i+=2){
            if(p==i){
                count+=i;
            }
        }
        for(int i =n;i>=1;i-=2){
            count1++;
        }
        return Math.min(count,count1);
    }

    public static void main(String[] args) {
        int n=5;
        int p=4;
        System.out.println(pageCount(n,p));
        int[] keyboards={3,1};
        int[] drives = {5,2,8};
        int b = 10;
        int maxlen =-1;
        for(int i = 0;i<keyboards.length;i++){
            for(int j = 0;j<drives.length;j++){
                if(keyboards[i]+drives[j]<b){
                    System.out.println(keyboards[i]+drives[j]);
                    maxlen = Math.max(maxlen,keyboards[i]+drives[j]);
                }

            }
        }
        System.out.println( maxlen);
    }
}
