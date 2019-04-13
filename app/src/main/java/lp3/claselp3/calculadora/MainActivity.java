package lp3.claselp3.calculadora;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.mariuszgromada.math.mxparser.Expression;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class MainActivity extends AppCompatActivity {

    public String texto;
    TextView textoResultado;
    TextView textoResultadoOp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        texto = "";
        textoResultado = (TextView) findViewById(R.id.textView);
        textoResultadoOp = (TextView) findViewById(R.id.resultado);


        //script engine



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void setTexto(CharSequence numero) {

    }


    public void crearString(View vista) {

        if(vista.getId()==R.id.btn0){
            textoResultado.setText(textoResultado.getText()+""+0);
        }else if(vista.getId()==R.id.button1){
            textoResultado.setText(textoResultado.getText()+""+1);
        }else if(vista.getId()==R.id.button2){
            textoResultado.setText(textoResultado.getText()+""+2);
        }else if(vista.getId()==R.id.button3){
            textoResultado.setText(textoResultado.getText()+""+3);
        }else if(vista.getId()==R.id.button4){
            textoResultado.setText(textoResultado.getText()+""+4);
        }else if(vista.getId()==R.id.button5){
            textoResultado.setText(textoResultado.getText()+""+5);
        }else if(vista.getId()==R.id.button6){
            textoResultado.setText(textoResultado.getText()+""+6);
        }else if(vista.getId()==R.id.button7){
            textoResultado.setText(textoResultado.getText()+""+7);
        }else if(vista.getId()==R.id.button7){
            textoResultado.setText(textoResultado.getText()+""+8);
        }else if(vista.getId()==R.id.button9){
            textoResultado.setText(textoResultado.getText()+""+9);
        }else if(vista.getId()==R.id.suma){
            textoResultado.setText(textoResultado.getText()+""+"+");
        }else if(vista.getId()==R.id.resta){
            textoResultado.setText(textoResultado.getText()+""+"-");
        }else if(vista.getId()==R.id.mul){
            textoResultado.setText(textoResultado.getText()+""+"*");
        }else if(vista.getId()==R.id.divide){
            textoResultado.setText(textoResultado.getText()+""+"/");
        }




    }

    public void operacion(View vista){
        String op=textoResultado.getText().toString();
//        ScriptEngineManager mgr = new ScriptEngineManager();
//        ScriptEngine scriptEngine = mgr.getEngineByName("JavaScript");
//        String expression = "12+5-1";
        System.out.println(op);
        String n = op;
        Expression e = new Expression(n);
        double v = e.calculate();
        System.out.println(v);
        System.out.println(v);
        //textoResultadoOp.setText(""+op);
        textoResultadoOp.setText(""+v);
    }

    public void restart(View vista){
        textoResultado.setText("");
        textoResultadoOp.setText("");
    }

}
