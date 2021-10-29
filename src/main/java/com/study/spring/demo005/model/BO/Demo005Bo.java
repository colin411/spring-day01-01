package main.java.com.study.spring.demo005.model.BO;

import main.java.com.study.spring.demo005.model.VO.Demo005VO;

public class Demo005Bo {

    private String boPara001;
    private String boPara002;
    private Demo005VO boPara003;

    public String getBoPara001() {
        return boPara001;
    }

    public void setBoPara001(String boPara001) {
        this.boPara001 = boPara001;
    }

    public String getBoPara002() {
        return boPara002;
    }

    public void setBoPara002(String boPara002) {
        this.boPara002 = boPara002;
    }

    public Demo005VO getBoPara003() {
        return boPara003;
    }

    public void setBoPara003(Demo005VO boPara003) {
        this.boPara003 = boPara003;
    }

    @Override
    public String toString() {
        return "Demo005Bo{" +
                "boPara001='" + boPara001 + '\'' +
                ", boPara002='" + boPara002 + '\'' +
                ", boPara003=" + boPara003.getVoPara001() +
                '}';
    }
}
