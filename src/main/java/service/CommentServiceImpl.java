package main.java.service;

import main.java.dao.CommentDAO;
import main.java.dao.CommentVO;
import main.java.mapper.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Implementation for User class to get Users from DB
 */
public class CommentServiceImpl implements CommentDAO {

	/**
	 * Automap user mapper
	 */
	@Autowired
	private CommentMapper commentMapper; // Autowired mapper from Spring

	@Override
	public void insert(String courseID, String username, String comment) {
		;
		commentMapper.insert(courseID, username, comment);
	}

	@Override
	public void delete(int id) {
		commentMapper.delete(id);

	}

	@Override
	public void update(int id, String comment) {
		commentMapper.update(id, comment);

	}

	@Override
	public List<CommentVO> findAll() {
		return commentMapper.getComments();
	}

	@Override
	public List<CommentVO> findCommentsForCourse(String courseID) {
		return commentMapper.findCommentsForCourse(courseID);
	}

	@Override
	public List<CommentVO> findCommentsOfUser(String username) {
		return commentMapper.findCommentsOfUser(username);
	}
}
