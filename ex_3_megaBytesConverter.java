public class ex_3_megaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes > 0) {
            System.out.println(kiloBytes + " KB = " + (kiloBytes / 1024) + " MB and " + (kiloBytes % 1024) + " KB");
        } else if (kiloBytes == 0) {
            System.out.println(kiloBytes + " KB = " + kiloBytes + " MB and " + kiloBytes + " KB");
        } else {
            System.out.println("Invalid Value");
        }
    }

}
