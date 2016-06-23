package ninja.sakib.javauitutorial;

import ninja.sakib.javauitutorial.a.MainActivity;

/**
 * Created by s4kib on 6/23/16.
 */

public class Main {
    public static void main(String args[]) {
        MainActivity mainActivity = new MainActivity();     // Initializing MainActivity
        mainActivity.init();                                //
        mainActivity.setVisible(true);                      // Calling frame to be visible
    }
}
