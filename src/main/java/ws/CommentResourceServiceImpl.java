package main.java.ws;


import main.java.dao.CommentDAO;
import main.java.dao.CommentVO;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.jws.WebService;
import java.util.List;

/**
 * Class to obtain User objects.
 */
@WebService(endpointInterface="main.java.ws.CommentResourceService")
public class CommentResourceServiceImpl implements CommentResourceService{

  private static final ApplicationContext context = new ClassPathXmlApplicationContext(
          "applicationContext.xml");   // Application context to load Spring

  //userDAO got from the aplicationContext.xml is UserServiceImpl class object, which interacts with UserMapper, which get
  //the values from the database
  //DI via Spring
  private static final CommentDAO commentDAO = (CommentDAO) context
      .getBean("commentDAO");    // User bean to work with

@Override
public List<CommentVO> findAll() {
	return commentDAO.findAll();
}

@Override
public List<CommentVO> findCommentsForCourse(String courseID) {
	return commentDAO.findCommentsForCourse(courseID);
}

@Override
public List<CommentVO> findCommentsOfUser(String username) {
	return commentDAO.findCommentsOfUser(username);
}

@Override
public void insert(String courseID, String username, String comment) {
  commentDAO.insert(courseID, username, comment);
}

@Override
public void delete(int id) {
  commentDAO.delete(id);
}

@Override
public void update(int id, String comment) {
  commentDAO.update(id, comment);
}


}
