package map.com;

import java.util.*;



public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String input_from_question=sc.nextLine();
		HashMap<String, Integer> hp=new HashMap<String, Integer>();
		String word[]=input_from_question.split(" ");
		input_from_question="";
		for(String words:word)
		{
			Integer integer=hp.get(words);
			if(integer==null)
			{
				hp.put(words, 1);
			}
			else
			{
				hp.put(words, integer+1);
			}
		}
		Set set=hp.entrySet();
        Iterator itr=set.iterator();  
        while(itr.hasNext())
        {  
            Map.Entry entry=(Map.Entry)itr.next(); 
            input_from_question+=(String) entry.getKey()+"\n"; 
            input_from_question+= (Integer) entry.getValue()+"\n"; 
        }	
       
		System.out.println(input_from_question);
		
	}

}
