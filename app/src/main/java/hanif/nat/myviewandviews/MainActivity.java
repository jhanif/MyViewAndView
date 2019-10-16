package hanif.nat.myviewandviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btndonasi = findViewById(R.id.btnDonasi);
        btndonasi.setOnClickListener(this);

        if (getSupportActionBar()!=null){
            getSupportActionBar().setTitle("Google Pixel");
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnDonasi:
                Intent donasi = new Intent(MainActivity.this,Donation.class);
                startActivity(donasi);
        }

    }
}
