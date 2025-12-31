class CheckAll {
    public boolean checkString(String s) {
        boolean checkB=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b'){
                checkB=true;
            }if(checkB==true && s.charAt(i)=='a'){
                return false;
            }
        }return true;
    }
}
public class Check {
    public static void main(String[] args) {
        String s="aaabbbb";
        CheckAll c=new CheckAll();
        System.out.println(c.checkString(s));
    }
}
