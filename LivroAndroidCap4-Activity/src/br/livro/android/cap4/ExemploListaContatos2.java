package br.livro.android.cap4;

import android.os.Bundle;
import android.provider.Contacts;
import android.provider.ContactsContract;
import android.app.Activity;
import android.app.ListActivity;
import android.database.Cursor;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class ExemploListaContatos2 extends ListActivity {

	private ListAdapter adaptador;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// TODO migrar para API mais nova
		
		// Recupera o cursor dos contatos
		Cursor c = getContentResolver().query(Contacts.People.CONTENT_URI, null, null, null, null);
		startManagingCursor(c);
		// Listar o nome e telefone do contato
		String[] colunas = new String[] {Contacts.People.NAME, Contacts.People.NUMBER};
		//String[] colunas = new String[] {ContactsContract.Contacts.DISPLAY_NAME, ContactsContract.CommonDataKinds.Phone.NUMBER};
		int[] campos = new int[]{R.id.nome}; // R.id.fone}; // ????
		
		// Informe o adapter para ligar os valores ao XML da View
		adaptador = new SimpleCursorAdapter(this, R.layout.layout_contatos, c, colunas, campos);
		
		setListAdapter(adaptador);
		// Show the Up button in the action bar.
		//getActionBar().setDisplayHomeAsUpEnabled(true);
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id){
		super.onListItemClick(l, v, position, id);
		// Recupera o cursor na posição selecionada
		Cursor c = (Cursor) adaptador.getItem(position);
		// Recupera o Nome e Telefone
		String nome = c.getString(c.getColumnIndexOrThrow(Contacts.People.NAME));
		//String fone = c.getString(c.getColumnIndexOrThrow(Contacts.People.NUMBER));
		Toast.makeText(this, "Contato selecionado: " + nome, Toast.LENGTH_SHORT).show();
	}
	
}
