import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Double> st = new Stack<>();
        double a1,a2,r;
        String input;
        Scanner scan = new Scanner(System.in);
        input = scan.nextLine();
        String[] cmd = input.split("\\s");
        String a;
        char c;
        int i;
        for (i=0; i<cmd.length; i++)
        {
            a=cmd[i];
            c=a.charAt(0);
            if (c>='0' && c<='9')
            {
                st.push(Double.parseDouble(a));
            }
            else
            {
                switch (c) {
                    case '+' -> {
                        a2 = st.pop();
                        a1 = st.pop();
                        r = a1 + a2;
                        st.push(r);
                    }
                    case '-' -> {
                        a2 = st.pop();
                        a1 = st.pop();
                        r = a1 - a2;
                        st.push(r);
                    }
                    case '*' -> {
                        a2 = st.pop();
                        a1 = st.pop();
                        r = a1 * a2;
                        st.push(r);
                    }
                    case '/' -> {
                        a2 = st.pop();
                        a1 = st.pop();
                        r = a1 / a2;
                        st.push(r);
                    }
                }
            }
        }
        int result = (int) Math.round(st.pop());
        System.out.println(result);
    }

}
