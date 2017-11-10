package wjc.dubbo.demo.starter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: 王俊超
 * Date: 2017-11-10 07:54
 * Blog: http://blog.csdn.net/derrantcm
 * Github: https://github.com/wang-jun-chao
 * All Rights Reserved !!!
 */
public class ProviderStarter {
    public static void main(String[] args) throws InterruptedException {
        ProviderStarter provider = new ProviderStarter();
        provider.start();

        com.alibaba.dubbo.container.Main.main(args);//通过dubbo的container加载
    }

    private void start() {
        String configLocation = "dubbo-provider.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
        String[] names = context.getBeanDefinitionNames();
        System.out.println("Beans:>>>>>>>>>>>>>>");
        for (String string : names) {
            System.out.println(string);
        }
    }
}
