package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

import model.TouristPlace;

public class SetOperations{
	static HashSet<TouristPlace> set=new HashSet<TouristPlace>();  
	public HashSet setele() {
		return set;
	}
	public HashSet add(TouristPlace places) {
		set.add(places);
		return set;
	}
	public HashSet remove(TouristPlace places) {
		set.remove(places);
		return set;
		
	}
	public Object sortByDestination(HashSet places) {
		ArrayList<TouristPlace> list1=new ArrayList<TouristPlace>(places);
		Collections.sort(list1,(o1,o2)->((TouristPlace) o1).getDestination().compareTo(((TouristPlace) o2).getDestination()));
		return new HashSet<TouristPlace>(list1);
		}
	public Object sortByRank(HashSet places) {
		ArrayList<TouristPlace> list1=new ArrayList<TouristPlace>(places);
		Collections.sort(list1,(TouristPlace o1,TouristPlace o2)->o1.getRank().compareTo(o2.getRank()));
		return new HashSet<TouristPlace>(list1);
		
	}
	public Object reset(HashSet places) {
		places.clear();
		return places;
		
	}
}
