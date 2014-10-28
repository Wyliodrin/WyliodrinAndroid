package com.example.testmessage;

import com.wyliodrin.WylioBoard;
import com.wyliodrin.WylioMessage;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // Simple Message
        // WylioBoard robot = new WylioBoard("64ccf971-d762-4e0f-8580-da6c1b96f83d62722e99-1484-4432-aa06-a982a32c85a6c061a3f6-65f3-4dc4-9d7b-a623c2a34f61", "alexandru.radovici_rapiro@wyliodrin.com");
        // robot.sendMessage ("label", "a message");
        
        // Open Message
        WylioBoard robot = new WylioBoard("414eb761-513e-4495-9ab1-4cb136e43f8008f656f4-e2ed-4a68-9102-fecbfd7f07f5c37030ac-d043-4dd4-ad1e-e3d15f985016b255eb39-faf4-4dcf-b9e9-8b47b720b36d");
        robot.sendMessage ("label", "a message");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
        }
        return super.onOptionsItemSelected(item);
    }
}
