package Chapter17;

class MultiPrinter extends SimplePrinter {

    public void printLine(String str) {

        super.printLine("start of multi...");
        super.printLine(str);
        super.printLine("end of multi");
    }

    public static void main(String[] args) {

        Printable prn1 = new SimplePrinter();
        Printable prn2 = new MultiPrinter();

        if(prn1 instanceof Printable)
            prn1.printLine("This is a simple printer.");
        System.out.println();

        if(prn2 instanceof Printable)
            prn2.printLine("This is a multiful printer.");
    }

}
