package cn.test.beans;

public class PersonFactory {
    public Person createPersonFactory(){
        Child child=new Child();
        child.setName("儿子");
        return child;
    }
}
