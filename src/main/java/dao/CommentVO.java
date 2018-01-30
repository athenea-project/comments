package main.java.dao;

/**
 * Comment model class
 */

public class CommentVO {
	
	static int id = 0;

	String courseID;

	String username;
		
	String comment;
	
	public CommentVO(String courseID, String username, String comment) {
		// id++;
		this.courseID = courseID;
		this.username = username;
		this.comment = comment;
	}
	
	public String getComment() {
		return comment;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getCourseID() {
		return courseID;
	}

	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public static int getId() {
		return id;
	}

	

}

