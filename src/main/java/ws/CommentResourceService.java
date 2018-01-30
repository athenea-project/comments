package main.java.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import main.java.dao.CommentVO;

import java.util.List;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface CommentResourceService {

    @WebMethod
    List<CommentVO> findAll();

    List<CommentVO> findCommentsForCourse(@WebParam(name = "courseID") String courseID);
    
    List<CommentVO> findCommentsOfUser(@WebParam(name = "username") String username);
    
    void insert(@WebParam(name = "courseID")String courseID,@WebParam(name = "username")String username,@WebParam(name = "comment")String comment);

    void delete(@WebParam(name = "id")int id);

    void update(@WebParam(name ="id")int id, @WebParam(name = "comment") String comment);
}
