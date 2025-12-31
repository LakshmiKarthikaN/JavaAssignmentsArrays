public class AddBinary {
    public static void main(String[] args) {
        String a="1010";
        String b="1011";
        StringBuilder ans=new StringBuilder();
        int carry=0;
        int i=a.length()-1;
        int j=b.length()-1;
        while(i>=0 || j>=0 || carry==1){
          if(i>=0){
                carry += a.charAt(i--)-'0';
            }if(j>=0){
                carry+=b.charAt(j--)-'0';

            }  ans.append(carry%2);
            carry /= 2;
        }ans.reverse();
        System.out.println(ans);
    }
}
