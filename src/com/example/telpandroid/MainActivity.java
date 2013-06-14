package com.example.telpandroid;

import java.util.ArrayList;
import java.util.List;

import com.example.telpandroid.entity.Aluno;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends Activity {
	
	private List<Aluno> alunos;
	private Button btnGravar;
	private EditText nome, sobrenome;
	private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("","ActivityCreated");
        
        btnGravar = (Button) findViewById(R.id.btn_gravar);
        nome = (EditText) findViewById(R.id.nome);
        sobrenome = (EditText) findViewById(R.id.sobrenome);
        lista = (ListView) findViewById(R.id.lista);
        
        alunos = new ArrayList<Aluno>();
        
        btnGravar.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				alunos.add(new Aluno()
								.setNome(nome.getText().toString())
								.setSobrenome(sobrenome.getText().toString()));
				populateAlunoListView();
			}
		});
    }
    
    @Override
    protected void onResume() {
    	super.onResume();
    	populateAlunoListView();
    }
    
    private void populateAlunoListView() {
		lista.setAdapter(new ArrayAdapter<Aluno>(this, android.R.layout.simple_list_item_1, alunos));
	}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
