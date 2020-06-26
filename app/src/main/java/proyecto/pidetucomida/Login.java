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
 Button btnLogin,btnOlvide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edtUsuario = (EditText) findViewById(R.id.edtUsuario);
        edtPassword = (EditText) findViewById(R.id.edtPassword);
        btnLogin =(Button) findViewById(R.id.btnLogin);
        btnOlvide =(Button) findViewById(R.id.btnOlvide);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((edtUsuario.getText().toString().equals("Admin") )&& (edtPassword.getText().toString().equals("1234"))){
                   Intent intent = new Intent(Login.this, MenuPrincipal.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(getApplicationContext(), "contraseña incorrecta", Toast.LENGTH_LONG).show();
                }
            }
        });


    }

    public void onClick(View v) {
        if(v.getId()==R.id.btnOlvide){
            Intent intent=new Intent(Login.this,RecuperContra.class);
            startActivity(intent);
        }else{
            Toast.makeText(getApplicationContext(),"algo falla",Toast.LENGTH_LONG).show();
        }

    }
    }


