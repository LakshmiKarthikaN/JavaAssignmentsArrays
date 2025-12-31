package algorithmlearning;

import java.util.*;

public class Kclosest {
    public static int findMaxK(int[] nums) {
        int max = 0;
        boolean maxneg = false;
        for(int i = 0;i<nums.length;i++){
            if(max < nums[i] && nums[i]%10!=0){
                max= nums[i];

            }
        }
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==(-max)){
                return max;
            }else{
                maxneg = false;
            }
        }if(!maxneg){
            max = -1;
        }
        return (max>0)?max:-1;
    }
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left = 0;
        int right = arr.length-1;
        List<Integer> list =new ArrayList<>();
        while(left<=right && list.size()!=k){
            System.out.println(Math.abs(arr[left]-x));
            System.out.println(Math.abs(arr[right]-x));
            if(Math.abs(arr[left]-x) <= Math.abs(arr[right]-x)){
                list.add(arr[left]);
            }else{
                list.add(arr[right]);
            }if(arr.length%2!=0) {
                if (list.size() != k && left == right) {
                    list.add(arr[left + 1]);
                }
            }
            else{
                if(right-left==1 && list.size()!=k){
                   list.add(arr[right]);
                }
            }
            right--;
            left++;
        }return list;
    }
    public static  int countGoodSubstrings(String s) {
        int l = 0;
        int r= 0;
        int count = 0;

         HashMap<Character,Integer> map = new HashMap<>();
         while(r<s.length()){
             map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
             System.out.println(map);
             if(map.size()==3){
                 count++;
             }
             if(r-l+1==3){
                 map.put(s.charAt(l),map.get(s.charAt(l))-1);
                 if(map.get(s.charAt(l))==0){
                     map.remove(s.charAt(l));
                 }
                         l++;
             }


             System.out.println(map);
            r++;
         }
        return count;
    }
    public static int longestSubarray(int[] nums) {
        int l = 0;
        int r = 0;
        int maxlen = 0;
        int zeros = 0;
        while(r<nums.length){
            if(nums[r]==0){
                zeros++;
            }
            if(zeros>1){
               if(nums[l]==0){
                   zeros--;
               }
                l++;
            }
            if(zeros<=1){
                maxlen = Math.max(maxlen,r-l);
            }
            r++;
        }return maxlen;
    }
    public static int longestAlternatingSubarray(int[] nums, int threshold) {
        int l = 0;
        int r = 0;
        int maxlen = 0;
        boolean evenodd = false;
        if(nums[0]%2!=0){
            l++;
        }
        while(r<nums.length){

            if(nums[r]<=threshold){
                if(nums[r]%2==0) {
                    r++;
                    if (r<=nums.length-1 && nums[r] % 2 != 0 ) {
                        maxlen = Math.max(maxlen, r - l + 1);
                        evenodd=true;
                        r--;
                    }
                }else{
                    if(evenodd){
                        if(nums[r]%2!=0){
                            r++;
                            if (nums[r] % 2 == 0) {
                                maxlen = Math.max(maxlen, r - l + 1);
                                r--;
                            }
                        }
                    }
                }
            }
            r++;

        }return maxlen;
    }
    public static int maximumLengthSubstring(String s) {  int n = s.length();
        int[] count = new int[26];
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < n; right++) {
            char ch = s.charAt(right);
            count[ch - 'a']++;

            while (count[ch - 'a'] > 2) {
                char leftChar = s.charAt(left);
                count[leftChar - 'a']--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
    public static int minimumCardPickup(int[] cards) {
        int l = 0;
        int r = 0;
        int minlen =Integer.MAX_VALUE;
        HashSet<Integer> set = new HashSet<>();
        while(r<cards.length){

            if(set.contains(cards[r])){
                minlen = Math.min(minlen,r-l+1);
                l++;
            }set.add(cards[r]);
            r++;
        }return minlen;
    }
    public static double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        float average = 0.0f;
        double minavg = Integer.MAX_VALUE;
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            average =(nums[left]+nums[right])/2.0f;
            minavg = Math.min(minavg,average);
            left++;
            right--;
        }

        return minavg;
    }
    public static String longestNiceSubstring(String s) {
        int l =0;
        int r = 0;
        String str = "";
        HashSet<Character> set = new HashSet<>();
        while(r<s.length()){
            if(set.contains(Character.toLowerCase(s.charAt(r))) || set.contains(Character.toUpperCase(s.charAt(r)))){
                set.remove(s.charAt(l));
                l++;
            }
            System.out.println(set);
            set.add(s.charAt(r));
            System.out.println(set);
            if(!set.contains(Character.toLowerCase(s.charAt(r))) || !set.contains(Character.toUpperCase(s.charAt(r)))){
                str+=s.charAt(r);
            }
            r++;

        }return str;
    }
    public static long maximumSubarraySum(int[] nums, int k) {
        int sum= 0;
        int maxsum = 0;
        List<Integer> list = new ArrayList();
        for(int i = 0;i<k;i++){
            sum += nums[i];
            if(list.contains(nums[i])){
                maxsum =0;
            }else{
                maxsum = sum;
            }
            list.add(nums[i]);
        }
        for(int i = k;i<nums.length;i++){
            list.remove(i-k);
            if(!list.contains(nums[i])){
                sum+=nums[i]-nums[i-k];
                maxsum = Math.max(maxsum,sum);
            }
            list.add(nums[i]);
        }
        return maxsum;
    }
    public static int countSubarrays(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num;

            if (map.containsKey(sum - k)) {
                System.out.println(map.get(sum-k));
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
            System.out.println(map);
        }

        return count;
    }
    public static int countEqualZeroOne(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // base case

        int balance = 0;
        int count = 0;

        for (int num : nums) {
            if (num == 1) {
                balance += 1;
            } else {
                balance -= 1;
            }

            if (map.containsKey(balance)) {
                System.out.println(map.get(balance));
                count += map.get(balance);
            }

            map.put(balance, map.getOrDefault(balance, 0) + 1);
            System.out.println(map);
        }

        return count;
    }
    public static int maxVowels(String s, int k) {
        int l = 0;
        int r=k;
        int maxvowels=0;
        int count = 0;
        for(int i =0;i<k;i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i)=='o' ||s.charAt(i)=='u'){
                count++;
            }
        }
        maxvowels = count;
        while(r<s.length()){

            if(s.charAt(l) == 'a' || s.charAt(l) == 'e' || s.charAt(l) == 'i' || s.charAt(l)=='o' ||s.charAt(l)=='u'){
                count--;
            }
            if(s.charAt(r) == 'a' || s.charAt(r) == 'e' || s.charAt(r) == 'i' || s.charAt(r)=='o' ||s.charAt(r)=='u'){
                count++;
            }
            maxvowels= Math.max(maxvowels,count);
            l++;
            r++;

        }
        return maxvowels;
    }
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum =0;
        int count =0;
        for(int i = 0;i<k;i++){
            sum+=arr[i];
        }

        if((sum/k)>=threshold){
            count=1;
        }
        for(int i = k;i<arr.length;i++){
            sum = sum+arr[i]-arr[i-k];
            System.out.println(sum);
            if((sum/k)>=threshold){
                count++;
            }

        }return  count;
    }
    public static int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        int sum1 =0;
        int maxsum1=0;
        int r = firstLen;
        for(int i = 0;i<firstLen;i++){
            sum1+=nums[i];
        }
        maxsum1 = sum1;
        for(int i = firstLen;i<nums.length;i++){
            sum1+=nums[i]-nums[i-firstLen];
            maxsum1 = Math.max(maxsum1,sum1);
        }
        int sum2 =0;
        int maxsum2=0;

        for(int i = 0;i<secondLen;i++){
            sum2+=nums[i];
        }
        maxsum2 = sum2;
        for(int i = secondLen;i<nums.length;i++){
            sum2+=nums[i]-nums[i-secondLen];
            maxsum2 = Math.max(maxsum2,sum2);
        }
        return maxsum1+maxsum2;
    }



    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        //int k = 4;
        int x=-1;
        //System.out.println(findClosestElements(nums,k,x));
        int[] arr={-16,1,23,41,-26,14,26,-50,22};
        System.out.println(findMaxK(arr));
        int[] ar={7,8,3,4,15,13,4,1};
        System.out.println(minimumAverage(ar));
        String s = "aababcabc";
        System.out.println(countGoodSubstrings(s));
        int[] num = {0,1,1,1,0,1,1,0,1};
        System.out.println(longestSubarray(num));
        int[] sub={1,2};
        int threshold = 5;
        System.out.println(longestAlternatingSubarray(sub,threshold));
        int[] cards={3,2,4,3};
        System.out.println(minimumCardPickup(cards));
        String str = "YazaAay";
        System.out.println(longestNiceSubstring(str));
        int[] maxar= {9,9,9,1,2,3};
        int k = 3;
        System.out.println(maximumSubarraySum(maxar,k));
        String str1 = "bcbbbcba";
        System.out.println(maximumLengthSubstring(str1));
        int[] nu ={3, 4, -2, 1, 2, -1, 2, 3, -3, 1};
        int c= 5;
        System.out.println(countSubarrays(nu,c));
        int[] n = {0,1,1,1,1,1,0,0,0};
        System.out.println(countEqualZeroOne(n));
        String vowels = "abciiidef";
        System.out.println(maxVowels(vowels,3));
        int[] subarr = {2,2,2,2,5,5,5,8};
        System.out.println(numOfSubarrays(subarr,3,4));
        int[] su = {0,6,5,2,2,5,1,9,4};
        int len1 = 1;
        int len2=2;
        System.out.println(maxSumTwoNoOverlap(su,len1,len2));
    }
}
