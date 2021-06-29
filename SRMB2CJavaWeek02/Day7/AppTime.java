
//<APPLET CODE = "AppletTime" WIDTH = "500" HEIGHT = "400"></APPLET>
import java.awt.*;

import java.util.GregorianCalendar;

import javax.swing.*;

class AppTime extends JApplet {

    // Instance Variables

    GregorianCalendar calendar = new GregorianCalendar();

    int arrange = 7;

    int column = 7;

    String[] week = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    String[] month = { "January", "Februrary", "March", "April", "May", "June", "July", "August",

            "September", "October", "November", "December"};

    JLabel[][] grid = new JLabel[arrange][column];

    JPanel jpnlCalendar = new JPanel(new GridLayout(7, 7));

    int today = calendar.get(GregorianCalendar.DAY_OF_MONTH);

    int daysInMonth = calendar.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);

    int daysInWeek = calendar.get(GregorianCalendar.DAY_OF_WEEK);



    public void init() {

        // setting grid

        for (int i = 0; i < grid.length; i++) {

            for (int j = 0; j < grid[0].length; j++) {

                grid[i][j] = new JLabel();

            }



        }

        // grid layout

        Container contenu = getContentPane();

        for (int i = 0; i < arrange; i++) {

            for (int j = 0; j < column; j++) {

                jpnlCalendar.add(grid[i][j]);

            }

        }



        // adding JPanels + positions

        contenu.add(jpnlCalendar);



        // draw week days

        for (int i = 0; i < week.length; i++) {

            grid[0][i].setText(week[i]);

        }

        // draw name of month

        //for (int m = 0; m < month.length; m++) {

        //grid[0][m].setText(month[m]);

        // }



        //conditions for the calendar

        calendar.set(GregorianCalendar.DAY_OF_MONTH, 1);

        int daysInWeek = calendar.get(GregorianCalendar.DAY_OF_WEEK)- 1;

        System.out.print(daysInWeek);

        if (daysInWeek == 0)

            daysInWeek = 7;

        calendar.set(GregorianCalendar.DAY_OF_MONTH, today);



        int days = 1;



        for (int k = daysInWeek; k < column; k++) {

            grid[1][k].setText(days + "");

            if (days == today)

                grid[1][k].setText(days + "*");

            days++;

        }

        // draw calendar

        for (int i = 2; i <= column; i++) {

            for (int j = 0; j < arrange; j++) {

                if (days <= daysInMonth) {

                    grid[i][j].setText(days + "");

                    if (days == today)

                        grid[i][j].setText(days + "*");

                    days++;

                }

            }

        }



    }

}
