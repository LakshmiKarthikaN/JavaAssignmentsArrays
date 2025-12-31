public class Interpret {
    public static void main(String[] args) {
        String command="G()(al)";
        String s="";
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='G') {
                s+='G';
            } else if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
                s+='o';
            }else if(command.contains("(al)")){
                s+="al";
                break;
            }
        }System.out.println(s);

    }
}
