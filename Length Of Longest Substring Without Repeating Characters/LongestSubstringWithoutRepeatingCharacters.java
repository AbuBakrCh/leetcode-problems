import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.print(solution.lengthOfLongestSubstring(new Scanner(System.in).nextLine()));
	}

}



class Solution {
    
    int max = 0;
    
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            if(!map.containsKey(s.charAt(i))) {
               map.put(s.charAt(i), i);
               continue;
            }
            max = Math.max(max, map.size());
            i = map.get(s.charAt(i));
            map.clear();
        }
        
        max = Math.max(max, map.size());
        return max;
    }
}