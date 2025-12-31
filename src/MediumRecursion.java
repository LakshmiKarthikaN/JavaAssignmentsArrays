public class MediumRecursion {
    static String reverse(String s){
        if(s.isEmpty()){
            return s;
        }//System.out.println(s);
        return reverse(s.substring(1))+s.charAt(0);
       // System.out.println(s);
    }
    static String palindrome(String str){
        //String str="";
        if (str.isEmpty()) {
            return str;
        }
        return reverse(str.substring(1))+str.charAt(0);
    }static int sumOfDigits(int n){
        if(n==0){
            return 0;
        }return n%10+sumOfDigits(n/10);
    }
    static int powerOfN(int x,int n){
        if(x==0){
            return 0;
        }return x*powerOfN(x,n-1);
    }

    public static void main(String[] args) {
            System.out.println(MediumRecursion.reverse("hello"));
        String str = "hiii";
            if(palindrome(str).equals(str)){
                System.out.println("palindrome");
            }else{
                System.out.println("Not Palindrome");
            }
            System.out.println(MediumRecursion.sumOfDigits(123));
            System.out.println(MediumRecursion.powerOfN(2,3));
    }
}
