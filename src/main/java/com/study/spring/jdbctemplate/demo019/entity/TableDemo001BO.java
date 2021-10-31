package main.java.com.study.spring.jdbctemplate.demo019.entity;

/**
 * @author 周卓群
 * @title: DemoTable001BO
 * @projectName spring-day01-01
 * @description: TODO
 * @date 2021/10/3021:22
 */
public class TableDemo001BO {

    private Integer demo_row01;
    private String demo_row02;
    private String demo_row03;

    public void setDemo_row01(Integer demo_row01) {
        this.demo_row01 = demo_row01;
    }

    public Integer getDemo_row01() {
        return demo_row01;
    }


    public String getDemo_row02() {
        return demo_row02;
    }

    public void setDemo_row02(String demo_row02) {
        this.demo_row02 = demo_row02;
    }

    public String getDemo_row03() {
        return demo_row03;
    }

    public void setDemo_row03(String demo_row03) {
        this.demo_row03 = demo_row03;
    }

    @Override
    public String toString() {
        return "TableDemo001BO{" +
                "demo_row01=" + demo_row01 +
                ", demo_row02='" + demo_row02 + '\'' +
                ", demo_row03='" + demo_row03 + '\'' +
                '}';
    }
}
