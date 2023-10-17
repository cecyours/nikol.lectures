import java.awt.FlowLayout;

import javax.swing.*;

public class CH19_P12_JScoll extends JFrame {

    public static void main(String[] args) {

        CH19_P12_JScoll j = new CH19_P12_JScoll();

        j.setSize(1920, 300);
        j.setVisible(true);
        j.setLayout(new FlowLayout());
        String[] courses = {
                "Mathematics",
                "Science",
                "History",
                "English",
                "Programming",
                "Art",
                "Music",
                "Physics",
                "Biology",
                "Chemistry"
        };
        JList lst = new JList<>(courses);

        lst.setLayoutOrientation(JList.VERTICAL);

        JScrollPane js = new JScrollPane(lst);

        js.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        js.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        j.add(js);

        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
