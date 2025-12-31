public class ReverseLetter {
    public static void main(String[] args) {
        String s="z<*zj";
        char[] ch=s.toCharArray();
        int right=ch.length-1;
        int left=0;
        while(left<right){
            if(!Character.isLetter(ch[left])){
                left++;
                continue;
            }
            if(!Character.isLetter(ch[right])){
                right--;
                continue;
            }else {
                char temp = ch[right];
                ch[right] = ch[left];
                ch[left] = temp;
                left++;
                right--;
                System.out.println(ch[right]);
                System.out.println(ch[left]);
                System.out.println(temp);
            }
        }
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]+" ");
        }
        String str=new String(ch);
        System.out.println(str);
    }
}
