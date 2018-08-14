import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: luyang
 * @description: 单元测试工具类
 * @Date: 14:01 2018/8/13
 * @Modified By:
 */

public class SpringTest {
    /**
     * 测试工具类
     * @param args
     */
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/spring-mvc.xml");
    }

}
