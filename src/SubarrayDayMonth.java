import java.util.List;
import java.util.ArrayList;
public class SubarrayDayMonth {
    public static void main(String[] args) {
        List<Integer> s=new ArrayList<>();
        s.add(1);
        s.add(2);
        s.add(1);
        s.add(3);
        s.add(2);
        System.out.println(s.size());
        int d=3;
        int m=2;
        int sum;
        int count=0;
        for(int i=0;i<s.size();i++){
            sum=0;
            for(int j=i;j<i+m;j++){
                sum+=s.get(j);
                if(sum==d){
                    count++;
                }
            }
        }System.out.println(count);
    }
}
