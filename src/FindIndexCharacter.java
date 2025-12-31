import java.util.ArrayList;
public class FindIndexCharacter {
    public static int findIndex(ArrayList list,char target){
        for(int i=0;i<list.size();i++){
            if(list.get(i).equals(target)){
                return i;
            }
        }return -1;
    }
    public static void main(String[] args) {
        ArrayList<Character> list=new ArrayList<>();
        list.add('A');
        list.add('C');
        list.add('%');
        list.add('3');
        list.add('*');
        list.add('B');
        list.add('&');
        list.add('S');
        list.add('L');
        list.add('O');
        char key1 = 'A';
        char key2 = '3';

        int idx1 = findIndex(list, key1);
        int idx2 = findIndex(list, key2);

        System.out.println("List: " + list);
        System.out.println("Index of '"+key1+"' is: " + idx1);
        System.out.println("Index of '" +key2+ "' is: " + idx2);

    }
}

