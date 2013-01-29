package br.livro.android.cap3;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class Exemplo2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// Cria o TextView para exibir na tela
		TextView view = new TextView(this);
		view.setText("Exemplo de layout feito com a API Java");
		
		setContentView(view);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.layout_exemplo2, menu);
		return true;
	}

}
