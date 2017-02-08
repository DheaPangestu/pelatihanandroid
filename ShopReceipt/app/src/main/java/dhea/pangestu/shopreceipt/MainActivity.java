package dhea.pangestu.shopreceipt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA = "dhea.pangestu.shopreceipt.Main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cetak(View view) {
        Intent intent = new Intent(this, cetakActivity.class);

        startActivity(intent);

        EditText input1 = (EditText) findViewById(R.id.input1);
        EditText input2 = (EditText) findViewById(R.id.input2);
        EditText input3 = (EditText) findViewById(R.id.input3);
        EditText input4 = (EditText) findViewById(R.id.input4);
        EditText input5 = (EditText) findViewById(R.id.input5);
        EditText input6 = (EditText) findViewById(R.id.input6);


        double angka1, angka2, angka3, angka4, angka5, angka6;
        String hasil="";
        angka1 = Double.parseDouble(input1.getText().toString());
        angka2 = Double.parseDouble(input2.getText().toString());
        angka3 = Double.parseDouble(input3.getText().toString());
        angka4 = Double.parseDouble(input4.getText().toString());
        angka5 = Double.parseDouble(input5.getText().toString());
        angka6 = Double.parseDouble(input6.getText().toString());

        hasil="HP               : "+angka1+"  "+(angka1*2000000)+"\n";
        hasil+="Komputer        : "+angka2+"  "+(angka2*3000000)+"\n";
        hasil+="Mouse           : "+angka3+"  "+(angka3*4000000)+"\n";
        hasil+="Keyboard        : "+angka4+"  "+(angka4*5000000)+"\n";
        hasil+="CPU             : "+angka5+"  "+(angka5*6000000)+"\n";
        hasil+="Headset         : "+angka6+"  "+(angka6*7000000)+"\n";

        hasil+="Total Pembelian : "+((angka1*2000000)+(angka2*3000000)+(angka3*4000000)+(angka4*5000000)+(angka5*6000000)+(angka6*7000000));

        TextView result = (TextView) findViewById(R.id.result);
        result.setText(hasil);
        intent = new Intent(this, cetakActivity.class);
        intent.putExtra(EXTRA,result.getText().toString());
        startActivity(intent);
    }

}
