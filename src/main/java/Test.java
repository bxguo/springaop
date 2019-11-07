import com.aop.config.AppConfig;
import com.aop.dao.CityDao;
import com.aop.service.CityService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by bxguo on 2019/10/28 22:42
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CityService bean =  context.getBean(CityService.class);
        System.out.println(bean.query());
    }
}
