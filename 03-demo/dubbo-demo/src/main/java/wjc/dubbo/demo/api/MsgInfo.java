package wjc.dubbo.demo.api;

import java.io.Serializable;
import java.util.List;

/**
 * Author: 王俊超
 * Date: 2017-11-10 07:50
 * Blog: http://blog.csdn.net/derrantcm
 * Github: https://github.com/wang-jun-chao
 * All Rights Reserved !!!
 */
public class MsgInfo implements Serializable {

    private static final long serialVersionUID = 0;

    private int id;
    private String name;
    private List<String> msgs;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMsgs() {
        return msgs;
    }

    public void setMsgs(List<String> msgs) {
        this.msgs = msgs;
    }
}
