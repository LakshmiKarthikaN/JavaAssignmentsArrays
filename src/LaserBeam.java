public class LaserBeam {
    public static void main(String[] args) {
        int count=1;
        int pre=0;
        int curr =0;
        int ret = 0;
        String[] bank = {"011001","000000","010100","001000"};
        for(int i=0;i<bank.length;i++){


            count=0;

            String str =bank[i];
            for(char c:str.toCharArray()){
                if(c=='1'){
                    count++;
                }
            }if((count)==0){
                continue;
            }
            System.out.println(count);
            if(pre>0) {
                curr += pre * count;
               // ret += curr;
                System.out.println(curr);
            }pre= count;
        }System.out.println(ret);
        System.out.println(curr);

    }
}
