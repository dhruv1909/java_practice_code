package org.practice;

import java.util.Iterator;

public class ArrayList<S> {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Rajendra");//Adding object in arraylist
        list.add("Mahendra");
        list.add("Raja");
        list.add("Technolamror");
        //Automation Proficient


        //Traversing list through Iterator
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    private Iterator iterator() {
        return null;
    }

    private void add(S rajendra) {

    }
}