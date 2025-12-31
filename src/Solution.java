import java.util.*;
class selfDivide{
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            int num=i;
            while(num!=0){

                int r=num%10;
                if(num%r==0){
                    list.add(i);
                }
                i/=10;
            }
        }return list;
    }
}
public class Solution {
    int left=47;
    int right=85;
    selfDivide obj=new selfDivide();
    //System.out.println(obj.selfDivide(left,right));
}
