class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        char[] nums1 = s.toCharArray();
        char[] nums2 = t.toCharArray();

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        return Arrays.equals(nums1,nums2);

    }
}
