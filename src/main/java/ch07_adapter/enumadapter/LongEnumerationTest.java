package ch07_adapter.enumadapter;

import java.util.ArrayList;
import java.util.List;

public class LongEnumerationTest {
    public static void main(String[] args) {
        List<Long> nums = new ArrayList<>();
        nums.add(1L);
        nums.add(2L);
        nums.add(3L);
        LongsEnumeration enumeration = new LongsEnumeration(nums);

        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
