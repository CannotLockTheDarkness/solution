public class task2_switch {
    public static void ab_switch(String[] args){
        int a = 10;
        int b = 7;
        System.out.println("a = " + a + " b = " + b);
        a = a^b^(b=a);
        System.out.println("a = " + a + " b = " + b);
    }
}
