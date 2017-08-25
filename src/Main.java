public class Main {

    public static void main(String[] args) {
        Backpack myBackpack = new Backpack("My backpack", 2, 4, 2);
        Backpack notMyBackpack = new Backpack("Not My Backpack",0,3,7);
        myBackpack.printInfo();
        notMyBackpack.printInfo();

        myBackpack.addItem("pen");
        myBackpack.printInfo();

        myBackpack.addItem("apple");
        myBackpack.printInfo();

        myBackpack.removeItem("folder");
        myBackpack.printInfo();

        myBackpack.removeItem("apple");
        myBackpack.printInfo();

        myBackpack.addItem("cellphone");
        myBackpack.addItem("wallet");
        myBackpack.addItem("laptop");
        myBackpack.printInfo();

    }
}
