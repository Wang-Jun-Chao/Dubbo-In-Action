package wjc.dubbo.soa.service.api;

/**
 * Author: 王俊超
 * Date: 2017-11-11 08:06
 * Blog: http://blog.csdn.net/derrantcm
 * Github: https://github.com/wang-jun-chao
 * All Rights Reserved !!!
 */
public interface DemoService {
    void sayHello();

    String returnHello();

    MsgInfo returnMsgInfo(MsgInfo info);
}
