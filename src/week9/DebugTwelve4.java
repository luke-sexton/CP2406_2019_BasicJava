package week9;// An employee ID can't be more than 999
// Keep executing until user enters four valid employee IDs
// This program throws a FixDebugEmployeeIDException

import javax.swing.*;

public class DebugTwelve4 {
    public static void main(String[] args) {
        String inStr = "";
        StringBuilder outString = new StringBuilder();
        final int MAX = 999;
        Integer[] emp = new Integer[4];
        try {
            for (int x = 0; x < emp.length; ++x) {
                inStr = JOptionPane.showInputDialog(null, "Enter employee ID number");
                emp[x] = Integer.parseInt(inStr);
                if (emp[x] > MAX) {
                    --x;
                    throw (new DebugEmployeeIDException("Number too high " + emp[x]));
                }
            }
            for (Integer integer : emp) {
                outString.append(integer).append(" ");
            }
            JOptionPane.showMessageDialog(null, "Four valid IDS are: " + outString);
        } catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(null, inStr + "\nNon-numeric ID");
        } catch (DebugEmployeeIDException error) {
            JOptionPane.showMessageDialog(null, error);
        }
    }
}