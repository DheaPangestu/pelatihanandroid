package dhea.pangestu.tipscalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View view) {
        EditText input1 = (EditText) findViewById(R.id.input1);
        EditText input2 = (EditText) findViewById(R.id.input2);
        EditText input3 = (EditText) findViewById(R.id.input3);
        TextView result = (TextView) findViewById(R.id.result);

        double angka1, angka2, angka3;
        String hasil;
        angka1 = Double.parseDouble(input1.getText().toString());
        angka2 = Double.parseDouble(input2.getText().toString());
        angka3 = Double.parseDouble(input3.getText().toString());

        hasil="Tips       : "+((angka1 * angka2)/100)+"\n";
        hasil+="Total      : "+(((angka1 * angka2)/100)+angka1)+"\n";
        hasil+="Per Orang : "+((((angka1 * angka2)/100)+angka1)/angka3);

        result.setText(hasil);
    }

}
