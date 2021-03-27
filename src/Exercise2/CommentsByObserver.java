package Exercise2;

import java.util.Date;

public class CommentsByObserver {
	
	private String message;
	private String id;
	private Date commentDate;
	
	//No setter, so that no message, no date, no identity can be modified. 
	
	public CommentsByObserver(String message, String id, Date commentDate) {
		super();
		this.message = message;
		this.id = id;
		this.commentDate = commentDate;
	}



	public String getMessage() {
		return message;
	}



	public String getId() {
		return id;
	}



	public Date getCommentDate() {
		return commentDate;
	}
	
	
	
	

}
