package doraemon;

import java.util.ArrayList;

public class Doraemon {

    public static void main(String[] args) {

        //membuat objek Array list
        ArrayList kantongAjaib = new ArrayList();

        //Mengisi kantong ajaib dengan 5 benda
        kantongAjaib.add("Senter Pembesar");
        kantongAjaib.add(200);
        kantongAjaib.add("tikus");
        kantongAjaib.add(1231234.132);
        kantongAjaib.add(true);
        kantongAjaib.add("mantan");
        kantongAjaib.set(5, "calon");
        kantongAjaib.set(5, "sudah menjadi pasangan hidup");
        kantongAjaib.get(2);

        //menghapus tikus dari kantong ajaib
       kantongAjaib.remove("tikus");


        //menampilkan isi kantong ajaib
        System.out.println(kantongAjaib);
        System.out.println(kantongAjaib.get(2));

        //menampilkan banyak isi kantong ajaib
        System.out.println("kantong ajaib berisi " + kantongAjaib.size() + " item ");  

    }

}
