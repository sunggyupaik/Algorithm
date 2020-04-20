class Solution {
    int cnt = 0;

	public void Swap(int[] num, int i, int j) {
		int temp = num[i];
		num[i] = num[j];
		num[j] = temp;
	}

	public void Per(int[][] baseball, int[] num, int depth, int n, int r) {
		if (depth == r) {
			int[] a = { num[0], num[1], num[2] };
			for (int i = 0; i < baseball.length; i++) {
				if (Check(baseball[i][0], baseball[i][1], baseball[i][2], a) == false) {
					return;
				}
			}
			cnt++;
			return;
		}

		for (int i = depth; i < num.length; i++) {
			Swap(num, depth, i);
			Per(baseball, num, depth + 1, n, r);
			Swap(num, depth, i);
		}
	}

	public boolean Check(int input, int s, int b, int[] my) {
		int x = input / 100;
		int y = (input % 100) / 10;
		int z = (input % 100) % 10;
		int[] arr = { x, y, z };
		int s_num = 0;
		int b_num = 0;
		for (int i = 0; i < 3; i++) {
			if (my[i] == arr[i])
				s_num++;
		}
		if (my[0] == arr[1] || my[0] == arr[2])
			b_num++;
		if (my[1] == arr[0] || my[1] == arr[2])
			b_num++;
		if (my[2] == arr[0] || my[2] == arr[1])
			b_num++;

		if (s_num == s && b_num == b)
			return true;
		return false;
	}

	public int solution(int[][] baseball) {
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Per(baseball, num, 0, 9, 3);
		return cnt;
    }
}

// brute fore, 완전탐색, 순열이다.
// 조건으로 전체 중에서 제외하는 것보다, 조건을 통해 찾는 것이 더 빠르다.
