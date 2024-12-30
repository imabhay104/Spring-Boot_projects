package world.ferrina.springboot.leanr_jpa_and_hibernate.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJDBCRepository {
	
		private static String insert =
				"""
				insert into course values(?,?,?);
				""";
		@Autowired
	private JdbcTemplate springJDBCtemplate;
	public void insert(Course course) {
		springJDBCtemplate.update(insert,course.getId(),course.getName(),course.getAuthor());
	}
	
	public void delete(long id) {
		springJDBCtemplate.update("delete from course where id=?",id);
	}
	
	public Course getById(long id) {
		return springJDBCtemplate.queryForObject("select * from course where id=?",new BeanPropertyRowMapper<>(Course.class),id);
	}
	
	public List<Course> getData() {
	    return springJDBCtemplate.query(
	        "SELECT * FROM course",
	        new BeanPropertyRowMapper<>(Course.class)
	    );
	}

	
}
