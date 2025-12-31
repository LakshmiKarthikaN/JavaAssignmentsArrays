public class SeatCount {
    public static void main(String[] args) {
        int[] seats={3,1,5};
        int[] students={2,7,4};
        int seatCount[] = new int[101];
        int studentCount[] = new int[101];
        for(int i:seats){
            seatCount[i]++;
        }
        for(int i:students){
            studentCount[i]++;
        }

        int i=0,j=0;
        int mov=0;
        while(i<101 && j<101){
            if(seatCount[i] !=0 && studentCount[j] !=0){
                mov+= Math.abs(j-i);
                seatCount[i]--;
                studentCount[j]--;
            }
            if(studentCount[j] == 0){
                j++;
            }
            if(seatCount[i] == 0){
                i++;
            }
        }
        System.out.println(mov);
    }
}
