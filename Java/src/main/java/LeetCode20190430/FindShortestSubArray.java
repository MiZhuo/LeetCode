package src.main.java.LeetCode20190430;

import java.util.HashMap;
import java.util.Map;

public class FindShortestSubArray {
    public int findShortestSubArray(int[] nums) {
        if (nums == null)
            return -1;
        Map<Map<Integer,Integer>,Map<Integer, Integer>> map = new HashMap<>();
        boolean iflag = true;
        for (int i = 0; i < nums.length; i++) {
            for (Map.Entry<Map<Integer,Integer>,Map<Integer, Integer>> entry : map.entrySet()) {
                for(Map.Entry<Integer,Integer> entry1 : entry.getKey().entrySet()) {
                    if (entry1.getKey() == nums[i]) {
                        int loop = entry1.getValue();
                        Map<Integer,Integer> m = new HashMap<>();
                        for(Map.Entry<Integer,Integer> entry2 : entry.getValue().entrySet()) {
                            m.clear();
                            m.put(entry2.getKey(),i);
                        }
                        Map<Integer,Integer> mm = new HashMap<>();
                        mm.put(nums[i],loop + 1);
                        Map<Integer,Integer> mmm = new HashMap<>();
                        mmm.put(nums[i],loop);
                        map.remove(mmm);
                        map.put(mm,m);
                        iflag = false;
                    }
                }
            }
            if (iflag) {
                Map<Integer,Integer> m1 = new HashMap<>();
                Map<Integer,Integer> m2 = new HashMap<>();
                m1.put(nums[i],1);
                m2.put(i, 0);
                map.put(m1,m2);
            }
            iflag = true;
        }
        return -1;
    }
}
