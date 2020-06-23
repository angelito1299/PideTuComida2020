package proyecto.pidetucomida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
   Button btnSesion,btnRegitrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onClick(View view){
        if(view.getId()==btnSesion.getId()){
            Intent miIntent = new Intent(MainActivity.this,Login.class);
            startActivity(miIntent);
        }else{

        }

    }

}