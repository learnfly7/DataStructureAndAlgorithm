package cc.learnfly.offer;

import java.util.HashMap;

public class FirstNotRepeatingChar {
	public int FirstNotRepeatingChar(String str) {
		HashMap<Character, Integer> map = new HashMap<>();
		if(null == str || str.length() == 0){
			return -1;
		}
		for(int i = 0; i < str.length(); i++){
			Character ch = str.charAt(i);
			if(map.containsKey(ch)){
				int value = map.get(ch);
				map.put(ch, value+1);
			}else{
				map.put(ch, 1);
			}
		}
		for(int i = 0; i < str.length(); i++){
			if(map.get(str.charAt(i)) == 1){
				return i;
			}
		}
        return 0;
    }
}
