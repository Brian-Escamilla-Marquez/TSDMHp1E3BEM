package mx.edu.isc.tesoem.tsdmhp1e3bem;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PrincipalActivity extends AppCompatActivity {

    EditText txtsaludo;
    Button btnsaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_principal);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        txtsaludo = findViewById(R.id.txtsaludo);
        btnsaludo = findViewById(R.id.btnsaludo);

        btnsaludo.setOnClickListener(v->{
            Intent intent = new Intent(this,SaludoActivity.class);
            intent.putExtra("nombre",txtsaludo.getText().toString());
            startActivity(intent);
        });
    }
}