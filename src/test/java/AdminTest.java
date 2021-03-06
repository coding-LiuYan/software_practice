import com.team.dao.AdminMapper;
import com.team.pojo.SWC;
import com.team.pojo.StudentWithCourse;
import com.team.service.AdminService;
import com.team.service.CourseService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Data 2022-01-02 13:28
 *
 * @author Liu_Yan
 */
public class AdminTest {
  ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
  AdminService bean = context.getBean("adminService", AdminService.class);

  // boolean thePasswordTrue(String user, String password);
  // List<StudentWithCourse> getGradeByCourseId(int course_id);
  // void updateGrade(SWC swc);
  @Test
  public void thePasswordTrue() {
    System.out.println(bean.thePasswordTrue("qlf", "123"));
  }

  @Test
  public void getGradeByCourseId() {
    for (StudentWithCourse print : bean.getGradeByCourseId(1)) {
      System.out.println(print);
    }
  }
  @Test
  public void updateGrade() {
    bean.updateGrade(new SWC(1000, 3, 100));
  }


}
