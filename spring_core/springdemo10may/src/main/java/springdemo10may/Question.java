package springdemo10may;

import java.util.List;
import java.util.Iterator;
public class Question {
int qid;
String que;
List<String> answers;
public Question(int qid, String que, List<String> answers) {
	super();
	this.qid = qid;
	this.que = que;
	this.answers = answers;
}
public void showQueAnswer()
{
	 System.out.println("Qid :- "+qid);
	 System.out.println("Question :- "+que);
	 Iterator<String> itr = answers.iterator();
	 while(itr.hasNext())
	 {
		 System.out.println(itr.next());
	 }
}
}
