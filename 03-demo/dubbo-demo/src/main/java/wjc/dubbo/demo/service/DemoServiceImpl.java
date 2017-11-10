package wjc.dubbo.demo.service;

import wjc.dubbo.demo.api.DemoService;
import wjc.dubbo.demo.api.MsgInfo;

/**
 * Author: 王俊超
 * Date: 2017-11-10 07:51
 * Blog: http://blog.csdn.net/derrantcm
 * Github: https://github.com/wang-jun-chao
 * All Rights Reserved !!!
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public void sayHello() {
        System.out.println("hello world!");
    }

    @Override
    public String returnHello() {
        return "hello world!";
    }

    @Override
    public MsgInfo returnMsgInfo(MsgInfo info) {
        System.out.println("DemoServiceImpl.returnMsgInfo is called.");
        info.getMsgs().add("test message 001");
        return info;
    }
}
