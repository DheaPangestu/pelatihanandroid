package dhea.pangestu.javaclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public String showString;
    public TextView showText;
    public Barang[]arrBarang = new Barang[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showText = (TextView) findViewById(R.id.show_text);


        showString = "Manipulasi Class Java Android : ";
        addSeparator();
        showText.setText(showString);

        initBarang();
        //showString += arrBarang[2].toString();
        //addSeparator();
        //showString += arrBarang[9].toString();

        Transaksi trans1 = new Transaksi();
        trans1.addbarang(arrBarang[7]);
        trans1.addbarang(arrBarang[5]);
        trans1.addbarang(arrBarang[6]);
        showString +=trans1.printTransaksi();
        showString +="rata - rata harga barang yang di beli : "+trans1.averageTransaksi();
        showString +=trans1.maxBarang();
        showText.setText(showString);


    }
    public void addSeparator(){
        showString += "\n------------------------------------------\n";
    }
    public void initBarang(){
        arrBarang[0] = new Barang("Laptop", 1, 7000000);
        arrBarang[1]= new Barang("Printer", 1, 600000);
        arrBarang[2]= new Barang("PC", 1, 7000000);
        arrBarang[3]= new Barang("Buku", 2, 500000);
        arrBarang[4]= new Barang("Kursi", 2, 700000);
        arrBarang[5]= new Barang("Lemari", 2, 250000);
        arrBarang[6]= new Barang("Meja", 2, 100000);
        arrBarang[7]= new Barang("Handphone", 1, 9000000);
        arrBarang[8]= new Barang("Monitor", 1, 3000000);
        arrBarang[9]= new Barang("Kacamata", 2, 150000);

    }
}
