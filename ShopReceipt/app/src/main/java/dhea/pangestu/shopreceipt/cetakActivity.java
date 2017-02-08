package dhea.pangestu.shopreceipt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class cetakActivity extends AppCompatActivity {
    public final static String EXTRA = "dhea.pangestu.shopreceipt.Main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cetak);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA);
        TextView messageArea = (TextView) findViewById(R.id.show_text);
        messageArea.setText(message);
    }

}
