package main.java.com.study.spring.demo010;

public class DemoBeanOrders {

    private String param;

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        System.out.println("2.调用set方法设置属性值！");
        this.param = param;
    }

    /**
     * bean初始化方法
     */
    public void initMethod() {
        System.out.println("3.调用bean初始化方法！");
    }

    public DemoBeanOrders() {
        System.out.println("1.调用无参构造方法！");
    }

    /**
     * bean销毁方法
     */
    public void destoryMethod() {
        System.out.println("5.调用bean销毁方法");
    }

    @Override
    public String toString() {
        return "DemoBeanOrders{" +
                "param='" + param + '\'' +
                '}';
    }
}
