package br.livro.android.cap4;

import java.util.ArrayList;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class ExemploSmileAdapter extends ListActivity {

	@Override
	public void onCreate(Bundle icicle){
		super.onCreate(icicle);
		
		ArrayList<Smile> list = new ArrayList<Smile>();
		list.add(new Smile("Feliz", Smile.FELIZ));
		list.add(new Smile("Triste", Smile.TRISTE));
		list.add(new Smile("Louco", Smile.LOUCO));
		setListAdapter(new SmileAdapter(this, list));
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id){
		super.onListItemClick(l, v, position, id);
		
		// Pega o smile naquela posição
		Smile smile = (Smile) this.getListAdapter().getItem(position);
		//Exibe um alerta
		Toast.makeText(this, "Você selecionou o smile: " + smile.nome , Toast.LENGTH_SHORT).show();
	}
}
