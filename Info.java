package org.practice;

public interface Info {
    static final String langauge = "java";
    public void display();
}
class simple implements Info{
    public static void main(String[] args) {
        simple obj = new simple();
        obj.display();

    }

    @Override
    public void display() {
        System.out.println(langauge + " is awesome ");
    }
}
