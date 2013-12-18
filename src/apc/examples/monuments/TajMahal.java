package apc.examples.monuments;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class TajMahal extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taj_mahal);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_taj_mahal, menu);
        return true;
        
        
    }
    public void showAboutMessage(View v)
    {
     	Toast.makeText(this, "I am a white marble mausoleum located in INDIA. One of the Seven Wonders of The World",
     	Toast.LENGTH_LONG).show();
    }
}
