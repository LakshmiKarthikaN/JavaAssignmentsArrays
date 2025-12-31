public class ZigZag {
    public static String toPrintzigzag(String s,int n){
      StringBuilder []rows = new StringBuilder[n];
      if(n==1 || s.length()<=n){
          return s;
      }
      for(int i =0;i<n;i++){
          rows[i]=new StringBuilder();
          System.out.println(rows[i]);
      }
      int in =0;
      int st =0;

      for(char c:s.toCharArray()){
          rows[in].append(c);
          if(in == 0){
              st =1;
          }
          else if(in == n-1){
              st = -1;
          }
          in+=st;
      }
      StringBuilder res = new StringBuilder();
      for(StringBuilder sb : rows){
          res.append(sb);
      }
      return res.toString();

    }

    public static void main(String[] args) {
           String s="PAYPALISHIRING";//ZATUSRDAETDEGUSI
           int n=4;
           System.out.println(ZigZag.toPrintzigzag(s,n));
    }
}
