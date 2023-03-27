// swing

import javax.swing.*;
import java.awt.*;

class Main{

    static class Swing extends JFrame{

        // make a window container

        JFrame frame = new JFrame();

        // declare labels for form
        JLabel name = new JLabel("Name");
        JLabel surname = new JLabel("Surname");
        JLabel age = new JLabel("age");

        // make inputbox for labels textarea

        JTextArea inputName = new JTextArea("your name");
        JTextArea inputSurname = new JTextArea("your surname");
        JTextArea inputAge = new JTextArea("age");

        // submit button
        JButton button = new JButton("submit");


        public Swing()
        {
            // setting container
            frame.setVisible(true);
            frame.setSize(600,600);
            frame.setLayout(new FlowLayout(10,20,30));
            // adding components
            frame.add(name);
            frame.add(inputName);
            frame.add(surname);
            frame.add(inputSurname);
            frame.add(age);
            frame.add(inputAge);
            frame.add(button);
        }



        public static void main(String[] args){

            new Swing();


        }


    }

}