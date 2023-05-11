import java.util.*;
class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String day = ""; //요일
        Calendar cal = Calendar.getInstance();
        cal.set (2016,a-1,b);  //해당 달의 날짜수 구하기
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        switch(dayOfWeek) {  //요일 설정
			case Calendar.SUNDAY : day = "SUN"; break;
			case Calendar.MONDAY : day ="MON"; break;
			case Calendar.TUESDAY : day = "TUE"; break;
			case Calendar.WEDNESDAY : day = "WED"; break;
			case Calendar.THURSDAY : day ="THU"; break;
			case Calendar.FRIDAY : day = "FRI"; break;
			case Calendar.SATURDAY : day = "SAT"; break;
	    }
        answer = day;
        return answer;
    }
}