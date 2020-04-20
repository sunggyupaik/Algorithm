class Solution {
    int n = 0;

	public boolean isSame(String[] words, int index, String word) { // 현재바로 이전의 순서가 index
		for (int i = 0; i <= index; i++) {
			if (words[i].equals(word))
				return true;
		}

		if (!words[index].split("")[words[index].length() - 1].equals(word.split("")[0]))
			return true;

		return false;
	}

	public int[] solution(int n, String[] words) {
		int[] answer = new int[2];
		// 3번 = 2,5,8
		for (int i = 1; i < words.length; i++) {
			if (isSame(words, i - 1, words[i])) {
				answer[0] = i % n + 1;
				answer[1] = i / n + 1;
                break;
			}
		}
		if (answer[0] == 0) {
			answer[0] = 0;
			answer[1] = 0;
		}
		return answer;
    }
}

//문자열의 마지막과 다음 문자열의 처음을 확인하는 코드가 지저분한다.
//단어를 말할 때마다 이전단어와 비교하는 흐름을 따라 코딩
