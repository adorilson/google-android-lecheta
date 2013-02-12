package br.livro.android.cap5;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;

public class Main extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		// Busca o TextView pelo id
		final EditText textNome = (EditText) findViewById(R.id.campoEndereco);
		Button button = (Button) findViewById(R.id.botaoOk);
		// Informa o listener
		button.setOnClickListener( new Button.OnClickListener(){
			@Override
			public void onClick(View v){
				EditText campoEndereco = (EditText) findViewById(R.id.campoEndereco);
				String endereco = campoEndereco.getText().toString();
				//Representa o endereço que desejamos abrir
				Uri uri = Uri.parse(endereco);
				// Cria a Intent com o endereco
				Intent intent = new Intent(Intent.ACTION_VIEW, uri);
				// Envia a mensagem ao sistema operacional
				startActivity(intent);
			}
		});
		
		// Busca o Button pelo id
		Button button_chamada = (Button) findViewById(R.id.botaoChamada);
		// Informa o listener
		button_chamada.setOnClickListener( new Button.OnClickListener(){
			@Override
			public void onClick(View v){
				final EditText campoTelefone = (EditText) findViewById(R.id.campoTelefone);
				String telefone = campoTelefone.getText().toString();
				//Representa o telefone que desejamos ligar
				Uri uri = Uri.parse("tel:" + telefone);
				// Cria a Intent com o telefoen
				Intent intent = new Intent(Intent.ACTION_CALL, uri);
				// Envia a mensagem ao sistema operacional
				startActivity(intent);
			}
		});
		
		// Busca o Button pelo id
		Button button_contato = (Button) findViewById(R.id.botaoVerContato);
		// Informa o listener
		button_contato.setOnClickListener( new Button.OnClickListener(){
			@Override
			public void onClick(View v){
				final EditText campoIdContato = (EditText) findViewById(R.id.campoIdContato);
				String idContato = campoIdContato.getText().toString();
				//Representa o contato que desejamos exibir
				Uri uri = Uri.parse("content://com.android.contacts/contacts/" + idContato);
				// Cria a Intent com o contato a ser exibido
				Intent intent = new Intent(Intent.ACTION_VIEW, uri);
				// Envia a mensagem ao sistema operacional
				startActivity(intent);
			}
		});		
		
		
	}

}
