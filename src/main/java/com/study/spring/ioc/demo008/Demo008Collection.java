package main.java.com.study.spring.ioc.demo008;


import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo008Collection {

    private String[] array;
    private List<String> list;
    private Map<String, String> map;
    private Set<String> set;
    private List<Demo008BO> listBo;

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public List<Demo008BO> getListBo() {
        return listBo;
    }

    public void setListBo(List<Demo008BO> listBo) {
        this.listBo = listBo;
    }

    public void print() {
        System.out.println(array.toString());
        System.out.println(list);
        System.out.println(map);
        System.out.println(set);
        System.out.println(listBo);
    }
}
