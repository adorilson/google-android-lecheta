package br.livro.android.cap3;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Exemplo4 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_exemplo4);
		
		// Busca o TextView pelo id
		final EditText textNome = (EditText) findViewById(R.id.campoNome);
		final TextView textResultado = (TextView) findViewById(R.id.campoResultado);
		Button button = (Button) findViewById(R.id.botaoOK);
		// Informa o listener
		button.setOnClickListener( new Button.OnClickListener(){
			@Override
			public void onClick(View v){
				String nome = textNome.getText().toString();
				//atualiza o texto
				textResultado.setText("Obrigado " + nome);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_exemplo4, menu);
		return true;
	}

}
