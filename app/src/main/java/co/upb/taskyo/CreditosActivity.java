package co.upb.taskyo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import co.upb.taskyo.R;

public class CreditosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditos);

        Button buttonInicio = findViewById(R.id.buttonInicio);
        buttonInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CreditosActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}