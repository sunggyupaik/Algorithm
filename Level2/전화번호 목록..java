class Solution {
    public boolean solution(String[] phone_book) {
       for (int i = 0; i < phone_book.length; i++) {
			int len1 = phone_book[i].length();
			for (int j = 0; j < phone_book.length; j++) {
				int len2 = phone_book[j].length();
				if(len1==len2 && phone_book[i].equals(phone_book[j]) || len1 > len2)
					continue;

				if (phone_book[i].equals(phone_book[j].substring(0, len1))) {
					return false;
				}
			}
		}
		return true;
    }
}

//substring으로 문자열에서 내가 원하는 부분을 취합한다.
