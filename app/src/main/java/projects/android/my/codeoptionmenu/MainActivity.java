package projects.android.my.codeoptionmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add("About");
        menu.add("Contact");
        menu.add("Exit");
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);

        if (item.getTitle().equals("About"))
        {
            Toast.makeText(this, "Clicked on About", Toast.LENGTH_SHORT).show();
        }
        else if (item.getTitle().equals("Contact"))
        {
            Toast.makeText(this, "Clicked on Contact", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Exit", Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}

