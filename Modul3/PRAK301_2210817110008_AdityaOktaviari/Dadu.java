package PRAK301_2210817110008_AdityaOktaviari;

import java.util.LinkedList;

public class Dadu {
    public int input;
    public int maksimal = 6;
    public int minimal = 1;
    int hasil;

    public void Inputan(int input){this.input = input;}

    void mencariNilai(){
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(1);ll.add(2);ll.add(3);ll.add(4);ll.add(5);ll.add(6);
        for (int i = 0; i < input; i++){
            int increment = (int)Math.floor(Math.random()*(maksimal-minimal+1)+minimal);
            System.out.println("Dadu ke-" + (i + 1) + " bernilai "+ increment);
            hasil += increment;
        }
        System.out.println("Total nilai dadu keseluruhan " + hasil);
    }
}