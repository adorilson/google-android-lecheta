package br.livro.android.cap4;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class SmileAdapter extends BaseAdapter {

	private Context context;
	private List<Smile> lista;
	
	public SmileAdapter(Context context, List<Smile> lista){
		this.context = context;
		this.lista = lista;
	}

	@Override
	public int getCount() {
		return lista.size();
	}

	@Override
	public Object getItem(int position) {
		return lista.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int posicao, View convertView, ViewGroup parent) {
		
		// Recupera o Smile da posição atual
		Smile smile = lista.get(posicao);
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View v = inflater.inflate(R.layout.smile_detalhes, null);
		// Atualiza o valro do Text para o nom do smile
		TextView textNome = (TextView) v.findViewById(R.id.nome);
		textNome.setText(smile.nome);
		
		// Atualiza a imagem para a imagem do smile
		// A imagem é definida poara um recurso no @drawable
		ImageView img = (ImageView) v.findViewById(R.id.img);
		img.setImageResource(smile.getImagem());
		
		return v;
	}
}
