import java.util.*;

public class Solution {
    public int solution(int n) {
       if (n == 1)
			return 1;
		if (n == 2)
			return 1;
		
		return solution(n/2) + ((n%2==1)? 1: 0);
    }
}

// dp로 for문을 만들었으나, 그것보다 재귀가 빠른 결과를 보였다.
// 해당 숫자가 홀수이 경우 무조건 1칸을 이동해야 하므로 이항연산자를 사용하였다.
