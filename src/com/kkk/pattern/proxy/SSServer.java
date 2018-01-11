package com.kkk.pattern.proxy;

/**
 * 充当具体主题类
 * Created by z3jjlzt on 2018/1/11.
 */
public class SSServer extends VPN{

    private SSServer() {}

    private static class Instance{
        private static SSServer instance = new SSServer();
    }

    public static SSServer getInstance() {
        return Instance.instance;
    }

    @Override
    public String visitSite(String site) {

        return "你正在通过SS服务器访问网站 " + site;
    }
}
