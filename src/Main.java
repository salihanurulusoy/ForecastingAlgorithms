import java.util.Scanner;
public class Main {
    public static Node list = new Node();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        list.insert(300);
        list.insert(350);
        list.insert(330);
        list.insert(340);
        list.insert(390);
        list.insert(430);
        list.insert(480);
        list.insert(460);
        list.insert(490);
        list.insert(510);
        list.insert(550);
        list.insert(560);
        list.insert(550);
        list.insert(590);
        list.insert(600);
        list.insert(610);
        list.insert(630);
        list.insert(620);
        list.insert(680);
        list.insert(690);
        list.insert(710);
        list.insert(730);
        list.insert(740);
        list.insert(770);
        while (true) {
            System.out.println("*****************************" +
                    "\n1:forecast" +
                    "\n2:list all dataset" +
                    "\n3:delete dataset" +
                    "\n4:exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Method1.first();
                    Method2.forecast();
                    Method3.third();
                    Method4.fourth();
                    double[] dizi = {Method1.mistake(), Method2.mistake(), Method3.mistake(), Method4.mistake()};
                    double enkucuk = 0;

                    for (int i = 0; i < 3; i++) {
                        if (i == 0) {
                            enkucuk = dizi[i];
                        }
                        if (dizi[i] < enkucuk) {
                            enkucuk = dizi[i];
                        }
                    }
                    System.out.println("Forecasts:");
                    for (int i = 0; i < list.size(); i++) {
                        if (enkucuk == Method1.mistake()) {
                            System.out.println((i + 1) + ". month: " + Method1.first().getByPosition(i).getNum());
                        } else if (enkucuk == Method2.mistake()) {
                            System.out.println((i + 1) + ". month: " + Method2.forecast().getByPosition(i).getNum());
                        } else if (enkucuk == Method3.mistake()) {
                            System.out.println((i + 1) + ". month: " + Method3.third().getByPosition(i).getNum());
                        } else if (enkucuk == Method4.mistake()) {
                            System.out.println((i + 1) + ". month: " + Method4.fourth().getByPosition(i).getNum());
                        } else {
                            System.out.println("Not calculated");
                        }
                    }
                    break;
                case 2:
                    list.print();
                    break;
                case 3:
                    list.clear();
                    System.out.println("All data deleted");
                    break;
            }if (choice == 4) {
                break;
            }
        }
    }
}
