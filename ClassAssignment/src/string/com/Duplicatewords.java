package string.com;

public class Duplicatewords {

	public static void main(String[] args) {
		String input_from_question="india is my country and india a country";
		int count;
		input_from_question.toLowerCase();
		String word[]=input_from_question.split(" ");
		for(int i=0;i<word.length;i++)
		{
			 count=1;
			 for(int j=i+1;j<word.length;j++)
			 {
				 if(word[i].equals(word[j]))
				 {
				 count++;
				 word[j]="0";
				 }
			 }
			 if(count>1 && word[i]!="0")
			 {
				 StringBuffer sb = new StringBuffer();
			         sb.append(word[i]);
			      input_from_question = sb.toString();
			      System.out.println(input_from_question);
				 
			 }	
		}
	 
		
	}

}
