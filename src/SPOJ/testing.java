package SPOJ;



public class testing {

    public static int isYes(int[] tab, int is) {
        int size = tab.length;
        int top = 0;
        while (top <size) {
            if (tab[top]==is) return 1;
            top++;
        }
        return -1;
    }
    public static void main(String[] args) throws NullPointerException{
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println(isYes(my_array,182));
    }
}

