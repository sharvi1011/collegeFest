package com.fest;
public class Teacher implements Organiser {
    private static final EventManager em = new EventManager();
    public  void register(int roll_no, eventType event){
        em.add(roll_no, event);
    }
    void printEvents(){
        em.print();
    }
}
