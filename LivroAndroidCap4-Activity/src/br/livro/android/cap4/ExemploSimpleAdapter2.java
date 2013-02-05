package br.livro.android.cap4;

import java.util.ArrayList;
import java.util.HashMap;

import android.os.Bundle;
import android.provider.Contacts;
import android.provider.ContactsContract;
import android.app.Activity;
import android.app.ListActivity;
import android.database.Cursor;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class ExemploSimpleAdapter2 extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
		// Cada item de uma linha precisa ser um HashMap
		// O HashMap contém as chaves e valrores necessários para preencher os elementos da tela
		for(int i = 0; i<10; i++){
			HashMap<String, String> item = new HashMap<String, String>();
			item.put("nome", "Nome " + i);
			item.put("fone", "Fone " + i);
			list.add(item);
		}
		
		// Utiliza o adaptador SimpleAdapter
		// Array que define as chaves do HashMap
		String[] from = new String[] {"nome", "fone"};
		
		// Nome e fone são definidos no layout_contatos
		int[] to = new int[]{R.id.nome, R.id.fone};
		
		setListAdapter(new SimpleAdapter(this, list, R.layout.layout_contatos, from, to));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id){
		super.onListItemClick(l, v, position, id);
		// Pega o item naquela posição
		Object o = this.getListAdapter().getItem(position);
		String item = o.toString();
		// Exive um alerta
		Toast.makeText(this, "Você selecionou: " + item, Toast.LENGTH_SHORT).show();
	}
}
