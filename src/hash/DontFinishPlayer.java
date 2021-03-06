package hash;

import java.util.HashMap;

public class DontFinishPlayer {

	public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        for(int i=0; i<completion.length; i++) {
        	if(map.containsKey(completion[i])) {
        		map.put(completion[i], (map.get(completion[i])) + 1);
        	} else {
        		map.put(completion[i], 1);
        	}
        }
        
        for(int i=0; i<participant.length; i++) {
        	if(map.containsKey(participant[i])) {
        		if(map.get(participant[i]) == 0) {
        			answer = participant[i];
        		} else {
        			map.put(participant[i], map.get(participant[i]) - 1);
        		}
        	} else {
        		answer = participant[i];
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
