package com.kkk.pattern.chain;

/**
 * 官员接口，充当抽象请求处理者。
 * Created by z3jjlzt on 2018/1/11.
 */
public abstract class Official {
    protected Official successor;

    public void setSuccessor(Official successor) {
        this.successor = successor;
    }

    //处理请求
    public abstract void handleReq(int level);
}
