package com.fest;
public class Student implements Organiser {
    public  void register(int roll_no, eventType event){
        Teacher t = new Teacher();
        t.register(roll_no,event);
    }
}
