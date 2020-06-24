package proyecto.pidetucomida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import javax.xml.validation.Validator;

public class Login extends AppCompatActivity {
 EditText edtUsuario,edtPasword;
 String usu,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edtUsuario=(EditText) findViewById(R.id.edtUsuario);
        edtUsuario=(EditText) findViewById(R.id.edtUsuario);
    }

    public void onClick(View v) {
        Intent intent =null;
        if(edtUsuario.getText().equals("Angel") && edtPasword.getText().equals("12345")){
            intent=new Intent(Login.this,MenuPrincipal.class);

        }else{
            Toast.makeText(getApplicationContext(),"su contraseña es incorrecto",Toast.LENGTH_SHORT).show();
        }
        startActivity(intent);

        }

    }

