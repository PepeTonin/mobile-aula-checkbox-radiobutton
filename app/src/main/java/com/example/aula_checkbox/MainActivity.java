package com.example.aula_checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBoxVerde;
    private CheckBox checkBoxAzul;
    private CheckBox checkBoxVermelho;
    private TextView textoResultado;
    private RadioButton radioButtonMasc, radioButtonFem, radioButtonSexoNaoInformado;
    private RadioGroup radioGroupSexo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxVerde = findViewById(R.id.checkBoxVerde);
        checkBoxAzul = findViewById(R.id.checkBoxAzul);
        checkBoxVermelho = findViewById(R.id.checkBoxVermelho);
        textoResultado = findViewById(R.id.textoResultado);

        radioButtonMasc = findViewById(R.id.radioButtonMasc);
        radioButtonFem = findViewById(R.id.radioButtonFem);
        radioButtonSexoNaoInformado = findViewById(R.id.radioButtonSexoNaoInformado);
        radioGroupSexo = findViewById(R.id.radioGroupSexo);

        // chamar o listener no constructor para ele ser usado
        radioButtonListener();

    }
    
    public void enviar(View view){
        checkbox();
    }

    public void checkbox(){
        if(checkBoxVerde.isChecked()){
            textoResultado.setText("Verde");
        }
        if(checkBoxAzul.isChecked()){
            textoResultado.setText("Azul");
        }
        if(checkBoxVermelho.isChecked()){
            textoResultado.setText("Vermelho");
        }
    }

    // possibiidade de uso do radio button com um botao para fazer a checagem
    public void radioButton(){
        if(radioButtonMasc.isChecked()){
            textoResultado.setText("Masculino");
        } else if(radioButtonFem.isChecked()){
            textoResultado.setText("Feminino");
        } else if(radioButtonSexoNaoInformado.isChecked()){
            textoResultado.setText("Sexo não informado");
        }
    }

    // listener para o radio button ser atualizado sempre que ocorre alguma alteração
    public void radioButtonListener(){
        radioGroupSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radioButtonMasc){
                    textoResultado.setText("Masculino");
                } else if (checkedId == R.id.radioButtonFem){
                    textoResultado.setText("Feminino");
                } else if (checkedId == R.id.radioButtonSexoNaoInformado) {
                    textoResultado.setText("Sexo não informado");
                }
            }
        });
    }
}