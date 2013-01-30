package br.livro.android.cap3;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class Exemplo5 extends Activity {

	private static final String CATEGORIA = "livro";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_exemplo5);
		
		// Verbose
		Log.v(CATEGORIA, "log de verbose");
		
		// Debug
		Log.d(CATEGORIA, "log de debug");
		
		// Info
		Log.i(CATEGORIA, "log de info");
		
		// Warning
		Log.w(CATEGORIA, "log de alerta");
		
		// Error
		Log.e(CATEGORIA, "log de erro", new RuntimeException("teste de erro"));
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_exemplo5, menu);
		return true;
	}

}
