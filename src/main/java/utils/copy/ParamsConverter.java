package utils.copy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ParamsConverter {
	
	public static Map<String, String> convertParamsMaptoMap(Map<String, String[]>paramsMap) {
		Map<String, String> map = new HashMap<>();
    	
			paramsMap.forEach((k, v) -> {		
			StringBuilder builder = new StringBuilder();
			
		Arrays.asList(v).forEach(value -> builder.append(value));
		// asList = 변수값을 리스트로 변환 
		
		map.put(k, builder.toString());

		});
			return map;
	}

}
