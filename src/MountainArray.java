class  Mountain {
    public static boolean validMountainArray(int[] arr) {
        int decrease = -1; //true
        int index =0;
        if(arr.length < 3){
            return false;
    }
//        for(int i = 0; i < arr.length-1;i++){
//            if(arr[i]==arr[i+1]){
//                return false;
//            }
//            if(arr[i]<arr[i+1]){
//                decrease = -2; //false
//            }else{
//                if(decrease == -2) {
//                    decrease = -3; //true
//                    index = i;
//                }
//            }
//
//        }for(int i = index; i < arr.length;i++){
//            if(decrease == -3){
//                if(arr[index]>arr[index+1]){
//                    return true;
//                }
//            }
//        }
//        return false;
        int left = 0;
        int right = arr.length - 1;
        while( left + 1 < arr.length - 1 && arr[left] < arr[left+1]){
            left++;
        }while(right - 1 > 0 && arr[right] < arr[right-1]){
            right --;
        }
        return left == right;
    }



    }

public class MountainArray {
    public static void main(String[] args) {
        int[] arr ={0,1,2,3,4,5,6,7,8,9};
        System.out.println(Mountain.validMountainArray(arr));
    }
}
