package Exercise2;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MessageBoard implements Observable{

	
	private String theMessage;
	private ArrayList<Observer> listObserver = new ArrayList<>();
	private ArrayList<CommentsByObserver> listofObservationfromObserver = new ArrayList<>();


	public MessageBoard(String theMessage, ArrayList<Observer> theList) {
		super();
		this.theMessage = theMessage;
		listObserver = theList;
		if(!listObserver.isEmpty()) {
			
		for(Observer o : listObserver) {
			o.addInfo(theMessage, this);
		}
		}
	}
	
	


	public String getTheMessage() {
		return theMessage;
	}




	public void setTheMessage(String theMessage) {
		this.theMessage = theMessage;
		notifyAllObserver();
	}




	public ArrayList<Observer> getListObserver() {
		return listObserver;
	}




	public void setListObserver(ArrayList<Observer> listObserver) {
		this.listObserver = listObserver;
	}

	@Override
	public void addObserver(Observer obs) {
		listObserver.add(obs);
		
	}


	@Override
	public void removeObserver(Observer obs) {
		if(listObserver.contains(obs)) {
			listObserver.remove(obs);
		}else {
			System.out.println("This Observer doesn't follow this Observable.");
		}
		
	}

	@Override
	public void notifyAllObserver() {
		
		if(!listObserver.isEmpty()) {
			
			for(Observer o : listObserver) {
				o.addInfo(theMessage, this);
			}
		}else {
			System.out.println("Kindly reminder, no Observer have been set.");
		}

	}




	@Override
	public void sendMessageToObserved(String msg, Observer Obs) {
		
		if(Obs.getID() != null) {
	
			CommentsByObserver aComment = new CommentsByObserver(msg, Obs.getID(), new Date(System.currentTimeMillis()));
			listofObservationfromObserver.add(aComment);
		}else {
			CommentsByObserver aComment = new CommentsByObserver(msg, "Incognito", new Date(System.currentTimeMillis()));
			listofObservationfromObserver.add(aComment);
		}
	}



	public void printTheComments() {
		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
		
		
		System.out.println("\t\tFull List of Comments");
		for(CommentsByObserver c : listofObservationfromObserver) {
			
			System.out.println("- " + c.getId() + " posted : ' " + c.getMessage() + " '  on the " + formatter.format(c.getCommentDate()));
		}
		
	}


}
