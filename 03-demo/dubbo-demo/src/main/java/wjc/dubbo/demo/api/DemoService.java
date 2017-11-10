package wjc.dubbo.demo.api;

/**
 * Author: 王俊超
 * Date: 2017-11-10 07:50
 * Blog: http://blog.csdn.net/derrantcm
 * Github: https://github.com/wang-jun-chao
 * All Rights Reserved !!!
 */
public interface DemoService {

    public void sayHello();

    public String returnHello();

    public MsgInfo returnMsgInfo(MsgInfo info);

}
