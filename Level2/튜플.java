import java.util.*;

class Solution {
   ArrayList<Integer>[] List;

	public void Check(String s, int start, int end) {
		String a = s.substring(start + 1, end - 1);
		StringTokenizer st = new StringTokenizer(a, ",");
		int num = st.countTokens();
		List[num - 1] = new ArrayList<>();
		while (st.hasMoreTokens()) {
			List[num - 1].add(Integer.parseInt(st.nextToken()));
		}
	}

	public int[] solution(String s) {
		int num = s.split("},").length;
		List = new ArrayList[num];
		int[] a = new int[num];
		s = s.substring(1, s.length() - 1);
		int start = 0;
		int end = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '{') {
				start = i;
			}

			if (s.charAt(i) == '}') {
				end = i;
				Check(s, start, end + 1);
			}
		}
		ArrayList<Integer> array = new ArrayList<>();
		array.add(List[0].get(0));
		for(int i=1;i<num;i++) {
			for(int j=0;j<List[i].size();j++) {
				if(array.contains(List[i].get(j))) {
					continue;
				} else {
					array.add(List[i].get(j));
				}
			}
		}
		int[] res = new int[num];
		for(int i=0;i<num;i++) {
			res[i] = array.get(i);
		}
		
		return res;
    }
}

//ArrayList<Integer> 는 ArrayList<Integer>[] a = new ArrayList[4]; 처럼 배열로 만들 수 있다.
//이 때 각 행마다 a[i] = new ArrayList<>();로 초기화 해주어야 한다. 
