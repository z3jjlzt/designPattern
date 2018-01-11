package com.kkk.pattern.proxy;

/**
 * 充当代理类
 * Created by z3jjlzt on 2018/1/11.
 */
public class SSClient extends VPN {
    private static final SSServer server = SSServer.getInstance();

    private boolean checkPAC(String site) {
        if (site.contains("google"))
            return true;
        return false;
    }

    private static class LocalBrowser {

        public static final LocalBrowser lb = new LocalBrowser();

        public String visitSite(String site) {

            return "你正在使用本地浏览器查看网站 " + site;
        }
    }

    @Override
    public String visitSite(String site) {
        if (checkPAC(site))
            return server.visitSite(site);
        return LocalBrowser.lb.visitSite(site);
    }
}
