import java.util.*;

class Solution {
    static int ans(int n) {
        int count = 0;
        while (n != 0) {
            count += n % 2;
            n /= 2;
        }
        return count;
    }

    public int[] sortByBits(int[] arr) {
            Integer[] boxedArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
            Arrays.sort(boxedArr, (a, b) -> {
            int bitA = ans(a);
            int bitB = ans(b);
            if (bitA != bitB)
                return bitA - bitB;
            return a - b;
        });
        for (int i = 0; i < arr.length; i++) {
            arr[i] = boxedArr[i];
        }
        return arr;
    }
}
