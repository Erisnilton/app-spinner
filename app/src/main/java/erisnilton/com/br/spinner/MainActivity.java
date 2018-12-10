package erisnilton.com.br.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.componentes, android.R.layout.simple_dropdown_item_1line );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (position){
            case 1:
                Toast.makeText(this, "Voce escolheu Button", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(this, "Voce escolheu Spinner", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(this, "Voce escolheu SickBar", Toast.LENGTH_SHORT).show();
                break;
            case 4:
                Toast.makeText(this, "Voce escolheu CheckBox", Toast.LENGTH_SHORT).show();
                break;
            case 5:
                Toast.makeText(this, "Voce escolheu Tooltips", Toast.LENGTH_SHORT).show();
                break;
            case 6:
                Toast.makeText(this, "Voce escolheu Pickers", Toast.LENGTH_SHORT).show();
                break;
            case 7:
                Toast.makeText(this, "Voce escolheu ImageView", Toast.LENGTH_SHORT).show();
                break;
            case 8:
                Toast.makeText(this, "Voce escolheu ToogleButton", Toast.LENGTH_SHORT).show();
                break;


            
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        Toast.makeText(this, "Voce deve escolher um item da lista", Toast.LENGTH_SHORT).show();
    }
}
