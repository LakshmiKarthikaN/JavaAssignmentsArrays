public class ZeroCount {
    public static void main(String[] args) {
        int n=50;
//        long fact=1;
////        int zerocount=0;
//        for(int i=n;i>=1;i--){
//            fact=fact*i;
//    }System.out.println(fact);
//        if(fact%10==0){
//            while(fact!=0){
//                int r=fact%10;
//                if(r==0){
//                    zerocount++;
//                }else{
//                    if(r!=0){
//                        break;
//                    }
//                }fact/=10;
//            }
//        }
//        System.out.println(zerocount);
        long fact=1;
        int zerocount=0;
        zerocount=n/5;
        for(int i=n;i>=1;i-=5){
            //fact=fact*i;
//            if(i%10==0){
//                zerocount+=2;
//            }
            int fivesquare=i*i;
            if(fivesquare%5==0 && fivesquare<=n){
                zerocount+=2;
            }
        }
        System.out.println(zerocount);
        //System.out.println(fact);
    }
}
