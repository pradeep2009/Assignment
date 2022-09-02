package map.com;

import java.util.HashMap;

public class StudyMap {
	
	HashMap<Integer, Float> hp;
	
	StudyMap()
	{
		hp=new HashMap<Integer, Float>();
		System.out.println(hp);
	}
	public void prepare(HashMap<Integer, Float> hp)
	{
		hp.put(72, 60.45f);
		hp.put(73, 72.45f);
		hp.put(78, 69.45f);
		hp.put(70, 71.45f);
		hp.put(74, 68.45f);
		hp.put(75, 71.45f);
		System.out.println(hp);
		hp.remove(78);
		System.out.println(hp);
		hp.containsValue(70);
		System.out.println(hp);
		hp.remove(75, 71.45f);
		System.out.println(hp);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudyMap s=new StudyMap();
		System.out.println(s.hp.size());
		HashMap<Integer, Float> hs=s.hp;
		s.prepare(hs);

	}

}
