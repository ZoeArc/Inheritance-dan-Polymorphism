public class Main {
    public static void main(String[] args) {
        Bentuk mySquare = new BujurSangkar(10.0, "Jingga");
        Bentuk myCircle = new Lingkaran(20.0, "Putih");
        Lingkaran myCylinder = new Silinder(10.0, 12.0, "Ungu");

        mySquare.printInfo();
        myCircle.printInfo();
        myCylinder.printInfo();
    }
}
