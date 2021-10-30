package main.java.com.study.spring.ioc.demo011;

public class Demo011VO {

    private Demo011BO bo;

    public Demo011BO getBo() {
        return bo;
    }

    public void setBo(Demo011BO bo) {
        this.bo = bo;
    }

    @Override
    public String toString() {
        return "Demo011VO{" +
                "bo=" + bo +
                '}';
    }

    public void print() {
        System.out.println(this.bo.toString());
    }


}
