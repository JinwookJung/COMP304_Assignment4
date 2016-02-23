/* Android Programming Assignment_4
Student Name: Jinwook Jung
Student ID: 300801360

* */

package jinwook.jung;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

import java.util.Locale;


public class Jinwook11 extends AppCompatActivity {

    CanvasView canvasView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        canvasView = (CanvasView) findViewById(R.id.signature_canvas);
        colorChanger();

        /*
        //Change Language to 'french'++++++++++++++++++++++++++++++++++++++++++++++++++++
        String languageToLoad  = "fr"; // your language
        Locale locale = new Locale(languageToLoad);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config,
                getBaseContext().getResources().getDisplayMetrics());
*/
    }
//The color of rectangle changes when user click toggle button++++++++++++++++++++++++++++++++++++
    private void colorChanger() {
        ToggleButton toggle = (ToggleButton) findViewById(R.id.toggleButton);
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    //Change to Green
                    canvasView.changeColorGreen();
                } else {
                    //Change to Red
                    canvasView.changeColorRed();
                }
            }
        });
    }

    //Pop up Dialogmessagebox when clicked "Back button"++++++++++++++++++++++++++++++++++++++++++
    @Override
    public void onBackPressed() {
        super.onPause();

        new AlertDialog.Builder(this)
                .setTitle("Alert")
                .setMessage("You want to exist the app?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        //do something
                        finish();
                        System.exit(0);
                    }
                })
                .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // do nothing
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }
//Pizza Image Button++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public void callIntent(View view){

        switch (view.getId()){
        case R.id.pizzaImageButton:
        {
            Intent intent = new Intent(this, Jinwook22.class);
            startActivity(intent);
        }
    }

}




}


