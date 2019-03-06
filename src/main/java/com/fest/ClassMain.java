package com.fest;
import java.util.Scanner;
public class ClassMain {
    public static void main(String[] args){
        //String str;
        char type, event, ans;
        int roll_no;
        System.out.println("Enter organiser type(s/t), roll no(int) and event(a/d): ");
        Scanner sc = new Scanner(System.in);
        //TODO: Create a hashmap for students(Roll no, name). This can validate if the srudent of that
        // college only has registered. also while printing we can print the name. Similar can be done for teacher.
        Student s = new Student();
        Teacher t = new Teacher();
        //TODO: Can take input as a string and then split it so that user wont have to enter 3 times
        do {
            //TODO: Input to be validated using a function
            type = sc.next().charAt(0);
            roll_no = sc.nextInt();
            event = sc.next().charAt(0);
            eventType et = null;
            if(event == 'a')
                et = eventType.Acting;
            else if (event == 'd')
                et = eventType.Dance;

            if(type == 's') {
                s.register(roll_no, et);
            }
            else if(type == 't') {
                t.register(roll_no, et);
            }
            System.out.println("More registrations??(y/n)");
            ans = sc.next().charAt(0);
        }while(ans == 'y');
        t.printEvents();
    }
}
