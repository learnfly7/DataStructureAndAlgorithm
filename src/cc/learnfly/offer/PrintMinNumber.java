package cc.learnfly.offer;

import java.util.Arrays;
import java.util.Comparator;

public class PrintMinNumber {

	public String PrintMinNumber(int [] numbers) {
		int n = numbers.length;
		if(n == 0){
			return "";
		}
		String[] strs = new String[n];
		for(int i = 0; i < n; i++){
			strs[i] = String.valueOf(numbers[i]);
		}
		Arrays.sort(strs, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return (o1 + o2).compareTo(o2 + o1);
			}
		});
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < n; i++){
			builder.append(strs[i]);
		}
		return builder.toString();
    }
}
