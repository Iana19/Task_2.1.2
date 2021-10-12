import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        System.out.println(bean.getMessage());

        Cat bean2 = (Cat) applicationContext.getBean("cat");
        Cat cat1 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean2.getName());
        System.out.println(cat1.getName());

        System.out.println(bean.equals(bean));
        System.out.println(bean2.equals(cat1));
    }
}