import com.aop.config.AppConfig;
import com.aop.dao.DaoImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by bxguo on 2019/10/28 22:42
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
        DaoImpl bean = context.getBean(DaoImpl.class);
        bean.query();
    }
}
