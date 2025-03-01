public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        // Применяем XOR ко всем элементам массива
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    // Пример использования
    public static void main(String[] args) {
        SingleNumber sn = new SingleNumber();
        
        int[] nums1 = {2, 2, 1};
        int[] nums2 = {4, 1, 2, 1, 2};
        
        System.out.println(sn.singleNumber(nums1)); // 1
        System.out.println(sn.singleNumber(nums2)); // 4
    }
}


import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        
        for (int num : nums) {
            if (seen.contains(num)) {
                seen.remove(num); // Удаляем число, если оно встречается второй раз
            } else {
                seen.add(num); // Добавляем число в множество, если оно встречается первый раз
            }
        }
        
        // В множестве останется только одно число
        return seen.iterator().next();
    }

    public static void main(String[] args) {
        SingleNumber sn = new SingleNumber();
        
        int[] nums1 = {2, 2, 1};
        int[] nums2 = {4, 1, 2, 1, 2};
        
        System.out.println(sn.singleNumber(nums1)); // 1
        System.out.println(sn.singleNumber(nums2)); // 4
    }
}
