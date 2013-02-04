package br.livro.android.cap4;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.widget.TextView;

public class ExemploCicloVida extends Activity {

	protected static final String CATEGORIA = "livro";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.i(CATEGORIA, getClassName() + ".onCreate() chamado: " + savedInstanceState);
		TextView t = new TextView(this);
		t.setText("Exemplo do ciclo de vida.\nConsole os logs no LogCat");
		setContentView(t);
	}

	protected void onStart(){
		super.onStart();
		Log.i(CATEGORIA, getClassName() + ".onStart() chamado.");
	}
	
	protected void onRestart(){
		super.onRestart();
		Log.i(CATEGORIA, getClassName() + ".onRestart() chamado.");
	}
	
	protected void onResume(){
		super.onResume();
		Log.i(CATEGORIA, getClassName() + ".onResume() chamado.");
	}
	
	protected void onPause(){
		super.onPause();
		Log.i(CATEGORIA, getClassName() + ".onPause() chamado.");
	}
	
	protected void onStop(){
		super.onStop();
		Log.i(CATEGORIA, getClassName() + ".onStop() chamado.");
	}
	
	protected void onDestroy(){
		super.onDestroy();
		Log.i(CATEGORIA, getClassName() + ".onDestroy() chamado.");
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_exemplo_ciclo_vida, menu);
		return true;
	}
	
	private String getClassName(){
		// Retirna o nome da classe sem o pacote
		String s = getClass().getName();
		return s.substring(s.lastIndexOf("."));
	}

}
