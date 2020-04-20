class Solution
{
    public int solution(int n, int a, int b)
    {
        int cnt = 0;

		while (true) {
			if (n == 2)
				return cnt + 1;

			if (Math.max(a,b)%2==1) {
				a = (a + 1) / 2;
				b = (b + 1) / 2;
				n = n / 2;
				cnt++;
				continue;
			}

			if (Math.abs(a - b) == 1)
				return cnt + 1;

			a = (a + 1) / 2;
			b = (b + 1) / 2;
			n = n / 2;
			cnt++;
		}
    }
}

// 서로 숫자가 1차이가 나야 종료가 된다.
// 누가 이기느냐가 중요하지 않다. 계속 줄어든다는 사실이 중요하다.
// 큰 수가 홀수이면 무조건 진행한다.
