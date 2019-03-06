package com.fest;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
class EventManager {
    private final Map<Integer, eventType> events = new TreeMap<>();
    void add(int roll_no, eventType event){
        events.put(roll_no, event);
    }
   /* public static void sortbykey() {
        // TreeMap to store values of HashMap
        TreeMap<String, Integer> sorted = new TreeMap<>();

        // Copy all data from hashMap into TreeMap
        sorted.putAll(map);
    }*/

        public void print() {

        if (events.isEmpty()) {
            System.out.println("No participants!!");
        }
        else {
            System.out.println("The total number of participants are: " + events.size());
            System.out.println("Roll No.\t\t Event");
            for(Map.Entry<Integer, eventType> entry : events.entrySet()){
                System.out.println(""+entry.getKey() + "\t\t\t " + entry.getValue());
            }
        }

    }
}
