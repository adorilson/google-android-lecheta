package br.livro.android.cap4;

import android.os.Bundle;
import android.app.ListActivity;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ExemploListActivity1 extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// Array de Strings para visualizar na lista
		String[] itens = new String[]{"Nome 1", "Nome 2", "Nome 3"};
		//Utiliza o adaptador ArrayAdapter, para exibir o array de strings na tela
		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, itens);
		setListAdapter(arrayAdapter);
		
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id){
		super.onListItemClick(l, v, position, id);
		// Pega o item naquela posição
		Object o = this.getListAdapter().getItem(position);
		String item = o.toString();
		// Exibe um alerta
		Toast.makeText(this, "Você selecionou: " + item, Toast.LENGTH_SHORT).show();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_exemplo_list_activity1, menu);
		return true;
	}

}
