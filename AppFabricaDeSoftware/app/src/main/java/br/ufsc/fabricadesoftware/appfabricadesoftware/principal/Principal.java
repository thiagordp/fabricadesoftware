package br.ufsc.fabricadesoftware.appfabricadesoftware.principal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import br.ufsc.fabricadesoftware.appfabricadesoftware.R;
import br.ufsc.fabricadesoftware.appfabricadesoftware.atendimento_medico.hospital.HospitalArarangua;


public class Principal extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);
        GridView gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(new Adapter(this));
        registerForContextMenu(gridView);


        /*Event opens an Activity when an item is clicked*/
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                try {
                    Intent novaIntent;
                    Toast.makeText(Principal.this, position + "#Selected " + id + " " + R.drawable.img2,
                            Toast.LENGTH_SHORT).show();

                    switch ((int) id) {
                        case R.drawable.img1: {

                            break;
                        }

                        case R.drawable.img2: {
                            novaIntent = new Intent(Principal.this, HospitalArarangua.class);
                            startActivity(novaIntent);
                            break;
                        }

                        case R.drawable.img3: {
                            break;
                        }
                        case R.drawable.img4: {
                            break;
                        }
                        case R.drawable.img5: {
                            break;
                        }
                        case R.drawable.img6: {
                            break;
                        }
                    }
                } catch (Exception e) {
                    Toast t = Toast.makeText(Principal.this, e.getMessage(), Toast.LENGTH_SHORT);
                    t.show();
                }

            }
        });
    }


    /*Creates the option menu which is located at the top right of the screen*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.principal, menu);
        return true;
    }


    /*Creates a list o option at the right top of screen*/
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}