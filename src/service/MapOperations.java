package service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import model.TouristPlace;

public class MapOperations{
	static HashMap<String,TouristPlace> map=new HashMap<String,TouristPlace>();
	HashMap<String,TouristPlace> map1=new HashMap<String,TouristPlace>();
	public Map add(TouristPlace places) {
		map.put(places.getName(),places);
		return map;
	
	}
	public Map sortRandomly(TouristPlace places) {
		List<TouristPlace> keys =Arrays.asList(places);
		Collections.shuffle(keys);
		for (Object o : keys) {
		    // Access keys/values in a random order
		    map1.put((String) o, map.get(o));
		}
		return map1;
		
	}
	public Map sortInEntryOrder(HashMap places) {
		Map<String,TouristPlace> orderedMap=new TreeMap<String,TouristPlace>(places);
		return orderedMap;
	}
	public Map sortAlphabetically(HashMap places) {
		Map<String,TouristPlace> sortedNewMap = map.entrySet().stream().sorted((o1,o2)->
        (o1.getValue().getName()).compareTo(o2.getValue().getName()) )
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                (o1, o2) -> o1, LinkedHashMap::new));
		return sortedNewMap;
		
	}
	public Object reset(HashMap places) {
		places.clear();
		return places;
		
	}
	public HashMap remove() {
		Iterator hmIterator = map.entrySet().iterator(); 
		String key="";
        while (hmIterator.hasNext()) { 
            Map.Entry mapElement = (Map.Entry)hmIterator.next(); 
            key = (String) mapElement.getKey();  
        } 
			map.remove(key);
		return map;
	}
}