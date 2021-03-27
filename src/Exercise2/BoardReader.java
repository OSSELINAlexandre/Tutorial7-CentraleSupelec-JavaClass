package Exercise2;



public class BoardReader implements Observer{
	
	private String theInformationRelayed;
	private Observable theObservabled;
	private String id = null; 
	//I add an ID for the second part of the Q1 :  'Modify the Test program by letting different readers posting different messages at
	// 'different times
	//In order to do so, we have to be able to identify whom write what. 

	public BoardReader() {
		super();
		
	}
	//Add this constructor to facilitate the work. 
	public BoardReader(String ID) {
		super();
		id = ID;
	}

	@Override
	public void addInfo(String MSG, Observable Obs) {
		theInformationRelayed = MSG;
		theObservabled = Obs;
		
	}

	public String getTheInformationRelayed() {
		return theInformationRelayed;
	}
	
	public Observable getTheObservabled() {
		return theObservabled;
	}
	
	public void sendMessageToObserved(String msg) {
		if(theInformationRelayed != null) {
		theObservabled.sendMessageToObserved(msg,this);
		}else {
			System.out.println("No observable been added yet");
		}
	}



	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		
		return "Observer : " + theInformationRelayed;
	}
	
	@Override
	public String getID() {
		return id;	
	}
	
	
	
}
