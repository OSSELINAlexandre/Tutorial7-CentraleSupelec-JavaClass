package Exercise2;

import java.util.ArrayList;

public class Main { 
	
	
public static void main(String[] args) {	
	
	BoardReader r1 = new BoardReader();
	BoardReader r2 = new BoardReader();
	BoardReader r3 = new BoardReader();
	BoardReader r4 = new BoardReader("Yeshua");
	BoardReader r5 = new BoardReader();
	
	ArrayList<Observer> Alist = new ArrayList<Observer>();
	Alist.add(r1);
	Alist.add(r2);
	Alist.add(r3);
	Alist.add(r4);
	Alist.add(r5);
	
	MessageBoard msgBoard = new MessageBoard("He loves us, Ohhh how he loves us !", Alist);
	
	r1.sendMessageToObserved("What a fanastic God you have here !");
	r2.sendMessageToObserved("What a fanastic God you have here !");
	r3.sendMessageToObserved("What a fanastic Jesus you have here !");
	r4.sendMessageToObserved("What a fanastic God you have here !");
	r5.sendMessageToObserved("What a fanastic God you have here !");

	msgBoard.printTheComments();
	
	r4.sendMessageToObserved("I Love it! I'm loving my life ! ");
	r5.sendMessageToObserved("Miracles on the way !");
	r4.sendMessageToObserved("Amen");

	msgBoard.printTheComments();

	
}
}
