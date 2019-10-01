package app;

import java.util.Stack;
/**
 * StackDemo1
 */
public class StackDemo1 {

    public static void main(String[] args) {
        Stack<String> CSC260st = new Stack<String>();

        CSC260st.push("NYC");
        CSC260st.push("OLD WESTBURY");
        CSC260st.push("VANCOUVER");
        CSC260st.push("NANJING");
        CSC260st.push("CENTRAL ISLIP");
        CSC260st.push("ABU DHABI");
        CSC260st.push("JONESBORO");

        System.out.println("Removed object is: " + CSC260st.pop());

        System.out.println("Elements after remove: " + CSC260st);


    }
}