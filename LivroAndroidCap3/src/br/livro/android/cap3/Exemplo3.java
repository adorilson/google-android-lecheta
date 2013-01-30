package br.livro.android.cap3;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ImageView;

public class Exemplo3 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_exemplo3);
		
		// busca a ImageView pelo id
		ImageView img2 = (ImageView) findViewById(R.id.imagem2);
		img2.setImageResource(R.drawable.smile2);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_exemplo3, menu);
		return true;
	}

}
