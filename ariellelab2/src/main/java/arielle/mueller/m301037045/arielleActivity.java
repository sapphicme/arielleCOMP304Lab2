package arielle.mueller.m301037045;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class arielleActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arielle);

        button = findViewById(R.id.arielleButton);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openHomeTypes();
            }
        });
    }

    public void openHomeTypes(){
        Intent intent = new Intent(this, muellerHomeTypes.class);
        startActivity(intent);
    }
}
