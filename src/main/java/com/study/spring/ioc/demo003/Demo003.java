package main.java.com.study.spring.ioc.demo003;


public class Demo003 {

    private String para01;
    private int para02;

    public Demo003(String para01, int para02) {
        this.para01 = para01;
        this.para02 = para02;
    }

    public String getPara01() {
        return para01;
    }

    public void setPara01(String para01) {
        this.para01 = para01;
    }

    public int getPara02() {
        return para02;
    }

    public void setPara02(int para02) {
        this.para02 = para02;
    }

    @Override
    public String toString() {
        return "para01 = " +  para01.toString() + " , " + "para02 = " + para02;
    }
}
