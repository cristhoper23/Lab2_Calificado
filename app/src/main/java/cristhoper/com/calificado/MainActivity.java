package cristhoper.com.calificado;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    Bundle datos = new Bundle();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imgMaiden = (ImageView) findViewById(R.id.imageMaiden);
        imgMaiden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2 = new Intent(MainActivity.this, ListViewActivity.class);
                datos.putString("songKey", "1");
                act2.putExtras(datos);
                startActivity(act2);
            }
        });

        ImageView imgDio = (ImageView) findViewById(R.id.imageDio);
        imgDio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2 = new Intent(MainActivity.this, ListViewActivity.class);
                datos.putString("songKey", "2");
                act2.putExtras(datos);
                startActivity(act2);
            }
        });

        ImageView imgZenobia = (ImageView) findViewById(R.id.imageZenobia);
        imgZenobia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2 = new Intent(MainActivity.this, ListViewActivity.class);
                datos.putString("songKey", "3");
                act2.putExtras(datos);
                startActivity(act2);
            }
        });

        ImageView imgNightCore = (ImageView) findViewById(R.id.imageNightCore);
        imgNightCore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2 = new Intent(MainActivity.this, ListViewActivity.class);
                datos.putString("songKey", "4");
                act2.putExtras(datos);
                startActivity(act2);
            }
        });

    }
}
