package br.ufsc.fabricadesoftware.appfabricadesoftware.atendimento_medico;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import br.ufsc.fabricadesoftware.appfabricadesoftware.R;
import br.ufsc.fabricadesoftware.appfabricadesoftware.principal.Principal;

public class AtendimentoMedico_Principal extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atendimento_medico);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.atendimento_medico, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        } else if (id == R.id.action_voltar_atendimento) {
            Intent intent = new Intent(AtendimentoMedico_Principal.this, Principal.class);
            startActivity(intent);

            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
