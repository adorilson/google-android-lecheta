package br.livro.android.cap5;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import android.content.Intent;
import android.content.res.Resources;
import android.content.res.Resources;


import android.content.res.Resources;

public class ExemploAbrirBrowser extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_browser);
		final Button button  = (Button) findViewById(R.id.botaoOk);
		button.setOnClickListener(this);
	}
	
	@Override
	public void onClick(View view) {
		EditText campoEndereco = (EditText) findViewById(R.id.campoEndereco);
		String endereco = campoEndereco.getText().toString();
		//Representa o endereço que desejamos abrir
		Uri uri = Uri.parse(endereco);
		// Cria a Intent com o endereco
		Intent intent = new Intent(Intent.ACTION_VIEW, uri);
		// Envia a mensagem ao sistema operacional
		startActivity(intent);
	}
}
