package br.livro.android.cap4;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;

public class Menu extends ListActivity {

	private static final String[] nomes = new String[]{
		"Ciclo de Vida", 
		"ArrayAdapter", "SimpleAdapter1 - Contatos  ", 
		"SimpleAdapter2 - Contatos com nome e fone",
		"CursorAdapter 1", "CursorAdapter 2", "Cursor de Carros", "Customizado - Smile",
		"MapActivity", "MapActivity - Cristo", "Sair"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nomes));
		// Show the Up button in the action bar.
		//getActionBar().setDisplayHomeAsUpEnabled(true);
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id){
		switch(position){
			case 0:
				startActivity(new Intent(this, ExemploCicloVida.class));
				break;
			case 1:
				startActivity(new Intent(this, ExemploListActivity1.class));
				break;
			case 2:
				startActivity(new Intent(this, ExemploListaContatos2.class));
				break;
			case 3:
				startActivity(new Intent(this, ExemploSimpleAdapter1.class));
				break;
				
				
			default:
				// Encerra a activity (encerra o ciclo de vida)
				finish();
		}
	}
	
	/*

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
*/
}
