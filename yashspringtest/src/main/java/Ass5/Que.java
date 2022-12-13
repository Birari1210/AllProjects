package Ass5;

import java.util.Iterator;
import java.util.List;

public class Que {
	int qNo;
	String question;
	List<String> answers;

	public Que(int qNo, String question, List<String> answers) {
		super();
		this.qNo = qNo;
		this.question = question;
		this.answers = answers;
	}
	
	public void showAnswer()
	{
		 System.out.println("Qid :- "+qNo);
		 System.out.println("Question :- "+question);
		 Iterator<String> itr = answers.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
	}

}
