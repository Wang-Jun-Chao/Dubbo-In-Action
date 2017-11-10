package wjc.dubbo.demo.starter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import wjc.dubbo.demo.api.DemoService;
import wjc.dubbo.demo.api.MsgInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: 王俊超
 * Date: 2017-11-10 07:52
 * Blog: http://blog.csdn.net/derrantcm
 * Github: https://github.com/wang-jun-chao
 * All Rights Reserved !!!
 */
public class ConsumerStarter {
    public static void main(String[] args) throws InterruptedException {
        ConsumerStarter consumer = new ConsumerStarter();
        consumer.start();
    }

    private void start() {
        String configLocation = "dubbo-consumer.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);

        DemoService demoService = (DemoService) context.getBean("demoService");
        String[] names = context.getBeanDefinitionNames();
        System.out.print("Beans:");
        for (String string : names) {
            System.out.print(string);
            System.out.print(",");
        }

        System.out.println("----------------------------------");

        MsgInfo info = new MsgInfo();
        info.setId(1);
        info.setName("wjc");
        List<String> msgs = new ArrayList<String>();
        msgs.add("hello");
        msgs.add("dubbo");
        info.setMsgs(msgs);

        System.out.println(demoService.returnMsgInfo(info).getMsgs());
    }
}
