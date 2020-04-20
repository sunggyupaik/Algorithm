import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        HashMap<String, String> map = new HashMap<>();
		Queue<String> queue = new LinkedList<>();
		for (int i = 0; i < record.length; i++) {
			String[] result = record[i].split(" ");
			switch (result[0]) {
			case "Enter":
				map.put(result[1], result[2]);
				break;

			case "Change":
				map.put(result[1], result[2]);
				break;
			}
		}
		
		for (int i = 0; i < record.length; i++) {
			String[] result = record[i].split(" ");
			String move = "";
			switch (result[0]) {
			case "Enter":
				move = map.get(result[1]) + "님이 들어왔습니다.";
				queue.add(move);
				break;

			case "Leave":
				move = map.get(result[1]) + "님이 나갔습니다.";
				queue.add(move);
				break;
			}
		}
		String[] answer = new String[queue.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = queue.poll();
		}
		return answer;
    }
}

//Hash와 Map의 성질을 기억한다.
//Map은 (key,value)로 구성되어 있으며 key가 고유하므로, 마지막으로 할당된 value가 저장된다.
//Set은 객체만 저장이 가능하다. Set은 중복을 관리할 수 없다.
