package br.livro.android.cap4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ExemploCicloVidaAbrirTela extends ExemploCicloVida implements OnClickListener{

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Button b = new Button(this);
		b.setText("Clique aqui para abrir a tela.");
		b.setOnClickListener(this);
		
		setContentView(b);
	}
	
	public void onClick(View v){
		
		Intent it = new Intent(this, Tela2.class);
		it.putExtra("msg", "Olá");
		startActivity(it);
	}

}
