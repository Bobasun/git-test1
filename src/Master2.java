public class Master2 {
    public static void main(String[] args) {
        System.out.println("3");
        System.out.println("4");
        int i = myFunction(1, "Hey");
        System.out.println(i);
        System.out.println("b1");
        System.out.println("b1_2");
    }

    private static int myFunction(int i, String hey) {
        System.out.println(hey);
        System.out.println("ss");
        System.out.println(i);
        return  i;
    }
}
