import java.util.Scanner;

class TanahMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tanah[] tArray;

        System.out.println("Banyak Tanah : ");
        int n = sc.nextInt();
        sc.nextLine();
        tArray = new Tanah[n];

        for (int i = 0; i < tArray.length; i++) {
            tArray[i] = new Tanah(0, 0);
            System.out.println("Tanah ke - " + (i + 1));
            System.out.println("Panjang : ");
            tArray[i].panjang = sc.nextInt();
            sc.nextLine();
            System.out.println("Lebar : ");
            tArray[i].lebar = sc.nextInt();
            sc.nextLine();
            long tmpLuas = tArray[i].hitungLuas();
            System.out.println();
            System.out.println("Luas tanah " + tmpLuas + " m2");
            System.out.println();
        }
        for (int i = 0; i < tArray.length; i++) {
            n = i + 1;
            System.out.println("Luas Tanah " + n + " : " + tArray[i].hitungLuas());
        }
    }
}

class Tanah {
    int panjang = 0;
    int lebar = 0;

    Tanah(int p, int l) {
        panjang = p;
        lebar = l;
    }

    long hitungLuas() {
        return (long) panjang * lebar;
    }
}
