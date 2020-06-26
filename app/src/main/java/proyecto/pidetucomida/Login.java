package proyecto.pidetucomida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity{
 EditText edtUsuario,edtPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edtUsuario = (EditText) findViewById(R.id.edtUsuario);
        edtPassword = (EditText) findViewById(R.id.edtPassword);


    }

    public void onClick(View v) {
        Intent intent =null;
        if(edtUsuario.getText().toString().equals("Hola") && edtPassword.getText().toString().equals("1234")){
            intent=new Intent(Login.this,MenuPrincipal.class);
            startActivity(intent);
        }else {
            Toast.makeText(getApplicationContext(), "contraseña incorrecta", Toast.LENGTH_LONG).show();
        }
    }

    }


