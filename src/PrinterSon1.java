public class PrinterSon1 extends Printer{

    protected String ANSI = "\u001B[31m";

    public void print(String value) {
        System.out.println(ANSI + value + ANSI_RESET);
    }
}