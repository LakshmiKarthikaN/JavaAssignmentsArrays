import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class LargeNumber {
    public static String toLargeNumber(int[] arr) {
        String[] str = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            str[i] = Integer.toString(arr[i]);
        }  StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length - 1; i++) {
            for (int j = 0; j < str.length - i - 1; j++) {
                String a = str[j];
                String b = str[j + 1];
                String ab = a + b;
                String ba = b + a;
                boolean isgreater = true;
                for (int k = 0; k < ab.length(); k++) {
                    char ca = ab.charAt(k);
                    char cb = ba.charAt(k);
                    if (ca > cb) {
                        isgreater = true;
                        break;
                    } else if (ca < cb) {
                        isgreater = false;
                        break;
                    }
                }
                if (!isgreater) {
                    str[j] = b;
                    str[j + 1] = a;
                }
                if (str[0].equals("0")) {
                    return "0";
                }
            }

        }  for (String s : str) {
            res.append(s);

        }return res.toString();
    }

        public static void main (String[]args){
            int[] a = {9, 72, 701, 5, 2, 7};//the output is 977270152
            System.out.println(LargeNumber.toLargeNumber(a));
        }
    }

//    List<Integer> list=new ArrayList<>();
//        for(int n: a){
//        while(n!=0){
//            int r = n % 10;
//            //System.out.println(r);
//            list.add(r);
//            n /= 10;
//        }
//        //System.out.println(list);
//    }// System.out.println(list);
//    StringBuilder str=new StringBuilder();
//    int max=0;
//          for(int digit:list){
//        //max=0;
//        if(digit==9){
//            str.append(9);
//        }else{
//            max = Math.max(max,digit);
//            str.append(max);
//        }
//    }return str.toString();
//}