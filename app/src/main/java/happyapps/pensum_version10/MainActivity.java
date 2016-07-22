package happyapps.pensum_version10;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //iniciamos el banner ad cuando se crea la activity
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }


    //metodo para lanzar el la pantalla de sedes
    public void lanzarSedes(View view) {
        Intent i = new Intent(this, sedes.class );
        startActivity(i);
    }

    //metodo para lanzar el la pantalla de notificaciones
    public void lanzarNotificaciones(View view) {
        Intent i = new Intent(this, notificaciones.class );
        startActivity(i);
    }

    //metodo para lanzar el la pantalla de sia
    public void lanzarSia(View view) {
        Intent i = new Intent(this, sia.class );
        startActivity(i);
    }

    //metodo para lanzar el la pantalla de programas
    public void lanzarProgramas(View view) {
        Intent i = new Intent(this, programas.class );
        startActivity(i);
    }

}
