//day1  


//두 수의 합
class Solution1 {
    public int solution(int num1, int num2) {
        int answer = -1;
        answer = (num1 +num2);
        return answer;
    }
}

//두 수의차
class Solution2 {
    public int solution(int num1, int num2) {
        int answer = 0;
        answer = (num1-num2);
        return answer;
    }
}
//두 수의곱
class Solution3 {
    public int solution(int num1, int num2) {
        int answer = 0;
        answer = (num1*num2);
        return answer;
    }
}
//몫 구하기
class Solution4 {
    public int solution(int num1, int num2) {
        int answer = 0;
        answer = (num1/num2);
        return answer;
    }
}
//두 수의 나눗셈
class Solution5 {
    public int solution(int num1, int num2) {
        int answer = 0;
        answer = (1000*num1/num2);
        return answer;
    }
}
//숫자비교하기
class Solution6 {
    public int solution(int num1, int num2) {
        int answer = 0;
        if(num1 ==num2){
            answer =1;
        }else{
            answer= -1;
        }
        return answer;
    
    }
}
//나머지구하기
class Solution7 {
    public int solution(int num1, int num2) {
        int answer = -1;
        answer = (num1%num2);
        return answer;
    }
}