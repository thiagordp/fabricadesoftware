package br.ufsc.fabricadesoftware.appfabricadesoftware.principal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

import br.ufsc.fabricadesoftware.appfabricadesoftware.R;

/**
 * Created by Thiago Raulino Dal Pont on 02/10/2014.
 */
public class Adapter extends BaseAdapter {

    private List<Item> itens = new ArrayList<Item>();
    private LayoutInflater inflater;

    public Adapter(Context context) {
        inflater = LayoutInflater.from(context);
        itens.add(new Item("UFSC", R.drawable.ufsc_tile));
        itens.add(new Item("Atendimento Médico", R.drawable.atendimento_medico_tile));
        itens.add(new Item("Locomoção", R.drawable.locomocao_tile));
        itens.add(new Item("Imobiliária", R.drawable.imobiliaria_tile));
        itens.add(new Item("Localização", R.drawable.location_tile));
        itens.add(new Item("Img6", R.drawable.img6));
    }

    @Override
    public int getCount() {
        return itens.size();
    }

    @Override
    public Object getItem(int position) {
        return itens.get(position);
    }

    @Override
    public long getItemId(int i) {
        return itens.get(i).drawableId;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = view;
        ImageView picture;
        TextView name;

        if (v == null) {
            v = inflater.inflate(R.layout.griditem_principal, viewGroup, false);
            v.setTag(R.id.picture, v.findViewById(R.id.picture));
            v.setTag(R.id.text, v.findViewById(R.id.text));
        }

        picture = (ImageView) v.getTag(R.id.picture);
        name = (TextView) v.getTag(R.id.text);

        Item item = (Item) getItem(i);

        picture.setImageResource(item.drawableId);
        name.setText(item.name);

        return v;
    }

    private class Item {
        private final String name;
        private final int drawableId;

        Item(String name, int drawableId) {
            this.name = name;
            this.drawableId = drawableId;
        }
    }
}