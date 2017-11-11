package wjc.dubbo.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import wjc.dubbo.soa.service.api.DemoService;
import wjc.dubbo.soa.service.api.MsgInfo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: 王俊超
 * Date: 2017-11-11 08:15
 * Blog: http://blog.csdn.net/derrantcm
 * Github: https://github.com/wang-jun-chao
 * All Rights Reserved !!!
 */
@Controller
@RequestMapping("/")
public class AppCtrl {

    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/index")
    public void index(HttpServletRequest request, HttpServletResponse response) {
        try {

            System.out.println("customer: >>>>>>>>>>>>>>>>>>>");

            MsgInfo info = new MsgInfo();
            info.setId(1);
            info.setName("ruisheh");
            List<String> msgs = new ArrayList<String>();
            msgs.add("I");
            msgs.add("am");
            msgs.add("test");
            info.setMsgs(msgs);

            List<String> rstMsg = demoService.returnMsgInfo(info).getMsgs();
            System.out.println("List<String> rstMsg = " + rstMsg);

            response.getWriter().write("client customer...");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
