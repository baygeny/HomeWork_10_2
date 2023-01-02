public class Main {
    public static void main(String[] args){
        Printer farther = new Printer();
        farther.print("Farther is printed blue");
        PrinterSon1 son1 = new PrinterSon1();
        son1.print("Child1 is printed red");
        PrinterSon2 son2 = new PrinterSon2();
        son2.print("Child2 is printed green");

    }

}