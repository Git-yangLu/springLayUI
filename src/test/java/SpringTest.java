
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;


/**
 * @Author: luyang
 * @description: 单元测试工具类
 * @Date: 14:01 2018/8/13
 * @Modified By:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/spring-servlet.xml"})
public class SpringTest {

    @Resource
    ApplicationContext applicationContext;
    @Before
    public void start(){
        System.out.println("测试开始---");
    }
    @After
    public void end(){
        System.out.println("测试over---");
    }
    @Test
    public void test1(){
        DataSource dataSource = applicationContext.getBean("dataSource",DataSource.class);
        try {
            Connection connection = dataSource.getConnection();
            System.out.println(connection.isClosed());
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
