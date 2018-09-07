package menupractica.com.menupractica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.pgn2:
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);


        }
        switch (item.getItemId()){
            case R.id.pgn3:
                Intent intent1 = new Intent(MainActivity.this, SegundaPagina.class);
                startActivity(intent1);

        }
         return super.onOptionsItemSelected(item);
    }
}

