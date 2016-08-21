public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        //1. Add each parameter inside nums1 into HashSet setA
        //2. if nums2 contains value of SetA, we put the contained value into SetB
        //3. Initiate one array and take the value of HashSetB, then return results
        HashSet<Integer> setA = new HashSet<Integer>();
        for(int s : nums1){
            setA.add(s);
        }

        HashSet<Integer> setB = new HashSet<Integer>();
        for(int k : nums2){
            if (setA.contains(k)){
                setB.add(k);
            }
        }
        int y = 0 ;
        int[] solution = new int[setB.size()];
        for (int z : setB){
            solution[y++] = z ;
        }
        return solution;
    }
}
