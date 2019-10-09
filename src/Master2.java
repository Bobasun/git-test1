public class Master2 {
    public static void main(String[] args) {
        System.out.println("3");
        System.out.println("4");
        int i = myFunction(1, "Hey");
        System.out.println(i);
    }

    private static int myFunction(int i, String hey) {
        System.out.println(hey);
        System.out.println("ss");
        return  i;
    }
}
