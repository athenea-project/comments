package main.java.dao;

import java.util.List;


public interface CommentDAO {
	public void insert(String courseID, String username, String comment);
	public void delete(int id);
	public void update(int id, String comment);
	public List<CommentVO> findAll();
	public List<CommentVO> findCommentsForCourse(String courseID);
	public List<CommentVO> findCommentsOfUser(String username);
}
