import java.util.Map;
import java.util.HashMap;
//import java.util.*;
public class KeyPad {
    public static String tryNokiaKeyPad(String str){
        Map<String,String> map=new HashMap<>();
       map.put("ABC","2");
       map.put("DEF","3");
       map.put("GHI","4");
       map.put("JKL","5");
        map.put("MNO","6");
        map.put("PQRS","7");
        map.put("TUV","8");
        map.put("WXYZ","9");
        map.put(" ","0");
        StringBuilder res=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            for(Map.Entry<String,String> entry:map.entrySet()){
                String key=entry.getKey();
                //System.out.println(key);
                String value=entry.getValue();
                //System.out.println(value);
                int index=key.indexOf(ch);
                //System.out.println(index);
                for(int j=0;j<=index;j++){
                    res.append(value);
                }
            }
        }return res.toString();
    }

    public static void main(String[] args) {
       String str="SOUR MANGO";
       System.out.println(KeyPad.tryNokiaKeyPad(str));

    }
}
