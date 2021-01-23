package service;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.TouristPlace;

public class ListOperations{
	static List<TouristPlace> list=new ArrayList<TouristPlace>();
	public List add(TouristPlace places) {
		list.add(places);
		return list;
		
	}
	public List listele() {
		return list;
	}
	public List remove() {
		int ind=list.size()-1;
		if(ind!=0) {
			list.remove(ind);
			return list;
		}
		return list;
	}
	public Object sortByDestination(List places) {
		Collections.sort(places,(TouristPlace o1,TouristPlace o2)->o1.getDestination().compareTo(o2.getDestination()));
		return places;
		
	}
	public Object sortByRank(List places) {
		Collections.sort(places,(TouristPlace o1,TouristPlace o2)->o1.getRank().compareTo(o2.getRank()));
		return places;
		
	}
	public Object reset(List places) {
		list.clear();
		return list;
		}
}