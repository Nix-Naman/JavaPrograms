public class Program31 {
    public static void concatStr() {
        String str = "Naman";
        for (int i = 0; i < 1000; i++) {
            str=str + "Patel";
        }
    }

    public static void concatStrBuf() {
        StringBuffer str = new StringBuffer("Naman");
        for (int i = 0; i < 1000; i++) {
            str.append("Patel");
        }
    }

    public static void main(String[] args) {
        System.out.println("\nEN20CS301266");
        System.out.println("NAMAN KUMAR PATEL\n\n");
        long startTime = System.currentTimeMillis();
        concatStr();
        System.out.println("Time taken by String: " + (System.currentTimeMillis() - startTime) + " ms");
        startTime=System.currentTimeMillis();
        concatStrBuf();
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + " ms");
    }
}
