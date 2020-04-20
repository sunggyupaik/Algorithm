import java.util.Arrays;

class Solution {



    public int solution(int[] nums) {
        int ans = 0;

        for(int i = 0; i < nums.length - 2; i ++){
            for(int j = i + 1; j < nums.length - 1; j ++){
                for(int k = j + 1; k < nums.length; k ++ ){
                    if(isPrime(nums[i] + nums[j] + nums[k])){
                        ans += 1;  
                    } 
                }
            }
        }
        return ans;
    }
    public Boolean isPrime(int num){
        int cnt = 0;
        for(int i = 1; i <= (int)Math.sqrt(num); i ++){
            if(num % i == 0) cnt += 1; 
        }
        return cnt == 1;
    }
}

//소수 만들기는 3가지 방법이 있고 2번째 효율이 좋은 방법을 사용한다.(코드양이 짧다.)
//제곱근보다 같거나 작은 숫자들에 의해 나눠서 나눈셈이 0인지 확인한다.
//3개를 선택하는 것이므로 조합을 써도 되고 for문을 3개 돌려도 된다.
