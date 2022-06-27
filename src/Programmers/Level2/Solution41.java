package Programmers.Level2;

public class Solution41 {
    public String solution(String number, int k) {                  //큰 수 만들기
        StringBuilder answer = new StringBuilder("");
        int len = number.length() - k;
        int start = 0;

        while(start < number.length() && answer.length() != len) {
            int leftNum = k + answer.length() + 1;
            int max = 0;
            for (int j = start; j < leftNum; j++) {
                if (max < number.charAt(j) - '0') {
                    max = number.charAt(j) - '0';
                    start = j + 1;
                }
            }
            answer.append(Integer.toString(max));
        }
        return answer.toString();
    }
}