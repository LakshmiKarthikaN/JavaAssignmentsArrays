public class NumberString {
    public static void main(String[] args) {
        String number = "133235";
        char digit ='3';
//        String res="";
//        for(int i = 0;i<number.length();i++) {
//            if (number.charAt(i) == digit) {
//                StringBuilder nums = new StringBuilder(number);
//                nums.deleteCharAt(i);
//                System.out.println(nums);
//                if (nums.toString().compareTo(res) > 0) {
//                    res = nums.toString();
//                }System.out.println(res);
//            }
//        }
//        System.out.println(res);
//    }
        int toRemove = -1;
        for(int i = 0; i < number.length(); i++) {
            if(number.charAt(i) == digit) {
                toRemove = i;
                if(i+1 < number.length() && number.charAt(i+1) > digit) {
                    break;
                }
            }
        }
        System.out.println(number.substring(0, toRemove) + number.substring(toRemove+1, number.length()));
    }
}
