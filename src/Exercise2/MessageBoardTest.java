package Exercise2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class MessageBoardTest {
	
	BoardReader r1 = new BoardReader();
	BoardReader r2 = new BoardReader();
	BoardReader r3 = new BoardReader();
	BoardReader r4 = new BoardReader();
	BoardReader r5 = new BoardReader();
	ArrayList<Observer> ml = new ArrayList<Observer>();
	MessageBoard mbt = null;

	@Test
	void testMain() {
		ml.add(r1);
		ml.add(r2);
		ml.add(r3);
		ml.add(r4);
		ml.add(r5);

		mbt = new MessageBoard("Have faith", ml);
		String expected = "Have faith";
		String actual1 = r1.getTheInformationRelayed();
		String actual2 = r2.getTheInformationRelayed();
		String actual3 = r3.getTheInformationRelayed();
		String actual4 = r4.getTheInformationRelayed();
		String actual5 = r5.getTheInformationRelayed();
		
		assertSame(expected, actual1);
		assertSame(expected, actual2);
		assertSame(expected, actual3);
		assertSame(expected, actual4);
		assertSame(expected, actual5);
		
		mbt = new MessageBoard("Spoke their being forward", ml); //Is the first moovement of change thinking, saying and acting on true ?
		expected = "Spoke their being forward";
		actual1 = r1.getTheInformationRelayed();
		actual2 = r2.getTheInformationRelayed();
		actual3 = r3.getTheInformationRelayed();
		actual4 = r4.getTheInformationRelayed();
		actual5 = r5.getTheInformationRelayed();
		
		assertSame(expected, actual1);
		assertSame(expected, actual2);
		assertSame(expected, actual3);
		assertSame(expected, actual4);
		assertSame(expected, actual5);
		
		
				
	}
	
	@Test
	void testMainSecond() {
		ml.add(r1);
		ml.add(r2);
		ml.add(r3);
		ml.add(r4);
		ml.add(r5);

		mbt = new MessageBoard("Have faith", ml);
		mbt.setTheMessage("I cannot, but God will");
		String expected = "I cannot, but God will";
		String actual1 = r1.getTheInformationRelayed();
		String actual2 = r2.getTheInformationRelayed();
		String actual3 = r3.getTheInformationRelayed();
		String actual4 = r4.getTheInformationRelayed();
		String actual5 = r5.getTheInformationRelayed();

		
		assertSame(expected, actual1);
		assertSame(expected, actual2);
		assertSame(expected, actual3);
		assertSame(expected, actual4);
		assertSame(expected, actual5);
				
	}

}
