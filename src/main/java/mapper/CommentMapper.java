package main.java.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import main.java.dao.CommentVO;

import java.util.List;

/**
 * User mapper class for Spring and MyBatis
 */
public interface CommentMapper {

  @Select("SELECT COURSE_ID, USERNAME, COMMENT FROM COMMENTS")
  List<CommentVO> getComments();

  @Update("UPDATE COMMENTS SET COMMENT = #{comment} WHERE ID = #{id}")
  void update(@Param("id") int id, @Param("comment") String comment);

  @Delete("DELETE FROM COMMENTS WHERE ID = #{id}")
  void delete(@Param("id") int id);

  @Select("SELECT COURSE_ID, USERNAME, COMMENT FROM COMMENTS WHERE COURSE_ID = #{courseID}")
  List<CommentVO> findCommentsForCourse(@Param("courseID") String courseID);

  @Select("SELECT COURSE_ID, USERNAME, COMMENT FROM COMMENTS WHERE USERNAME = #{username}")
  List<CommentVO> findCommentsOfUser(@Param("username") String username);

  @Insert("INSERT INTO COMMENTS (COURSE_ID, USERNAME, COMMENT) VALUES (#{courseID}, #{username}, #{comment})")
  void insert(@Param("courseID") String courseID, @Param("username") String username, @Param("comment") String comment);
}
