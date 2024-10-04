public class NullReferenceExample {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.err.println("Null reference encountered: " + e.getMessage());
        }
    }
}
