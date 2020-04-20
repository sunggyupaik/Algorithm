import java.util.*;

class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();
		for (char c : s.toCharArray()) {
			if (!stack.isEmpty() && stack.peek() == c)
				stack.pop();
			else
				stack.add(c);
		}
		return stack.isEmpty() ? 1 : 0;
    }
}

//계속 마지막 input을 확인하므로 stack을 사용한다.
//stack 사용에 대한 아이디어가 
