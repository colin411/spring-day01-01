package main.java.com.study.spring.demo008;

import java.util.List;

public class Demo008VO {

    private List<String> list;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void print() {
        System.out.println(this.list);
    }
}
