class Solution {
  public String solution(String s) {
  StringBuffer sb = new StringBuffer();
		boolean isFirst = true;

		for (char c : s.toCharArray()) {
			if (c == ' ') {
				isFirst = true;
				sb.append(c);
				continue;
			}
			
			if (isFirst && c != ' ') {
				isFirst = false;
				sb.append(Character.toUpperCase(c));
			} else {
				sb.append(Character.toLowerCase(c));
			}

		}
		return sb.toString();
  }
}

toUpperCase(), toLowerCase()는 각가 대문자 소문자를 만들어준다.
s.toCharArray()는 String 문자열을 char배열로 만든다.
**boolean으로 첫문자인지 아닌지를 확인한다.**
