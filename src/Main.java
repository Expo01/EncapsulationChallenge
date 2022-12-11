public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(101, true);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = " +printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(5);
        System.out.printf("current job pages: %d, printer total: %d %n", pagesPrinted, printer.getPagesPrinted());

        pagesPrinted = printer.printPages(10);
        System.out.printf("current job pages: %d, printer total: %d %n", pagesPrinted, printer.getPagesPrinted());
    }
}