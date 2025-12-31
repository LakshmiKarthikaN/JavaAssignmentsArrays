public class FactoringDecimal {
        public static void main(String[] args) {
            System.out.println("Try programiz.pro");
            int numerator =1;
            int denominator = 2;
            int index =0;
            double div = ((double)numerator/(double)denominator);
            System.out.println(div);
            String str = Double.toString(div);
            System.out.println(str);
            char[] divarr = str.toCharArray();
            StringBuilder arr = new StringBuilder();
            for(int i = 0;i < divarr.length;i++){
                arr.append(divarr[i]);
                if(divarr[i] == '.')
                {
                    index =i;
                    break;
                }
            }
            System.out.println(arr);
            System.out.println(index);
            for(int i=index+1;i<divarr.length-1;i++){
                if(divarr[i]==divarr[i+1]){
                    arr.append('(');
                    arr.append(divarr[i]);
                    arr.append(')');
                    break;
                }
                else{
                    arr.append(divarr[i]);
                }
            }
            System.out.println(arr);

        }
    }

