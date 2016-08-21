public class Solution {
    public String reverseString(String s) {

        if (s == null || s.length() ==0){
            return "";
        }
        String c[] = s.split("");
        int start = 0;
        int end = s.length()-1;
        String tmp;
        while (start < end){
            tmp = c[start];
            c[start] = c[end];
            c[end] = tmp;
            start++;
            end--;
        }
        StringBuffer result = new StringBuffer();

        for (int i = 0; i< s.length(); i++){
            result.append(c[i]);
        }

    
        return result.toString();
    }


}
