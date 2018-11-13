package ricamae.gomez.devera.fieryph;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DOs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dos);
    }
    public void process (View v) {
        Intent i = null, chooser = null;

        if(v.getId()== R.id.emergencycall){
            i = new Intent(this, Location.class);
            startActivity(i);
        }

        if(v.getId()== R.id.safetytips){
            i = new Intent(this, DOs.class);
            startActivity(i);
        }

    }
}
