package mx.edu.isc.tesoem.tsdmhp1e3bem;


import android.os.Bundle;
import android.view.textclassifier.TextClassification;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SaludoActivity extends AppCompatActivity {

    TextView lblsaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_saludo);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        lblsaludo=findViewById(R.id.lblsaludo);
        Bundle elementos = getIntent().getExtras();
        String nombre = elementos.getString("nombre");
        lblsaludo.setText("Bienvenido \n" + nombre);

    }
}