package cristhoper.com.calificado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends AppCompatActivity {

    ListViewAdapter adapter;

    String[] maidenSongs = new String[]{
            "Caught Somewhere in Time",
            "Wasted Years",
            "Sea of Madness",
            "Heaven Can Wait",
            "The Loneliness of the Long Distance Runner",
            "Stranger in a Strange Land",
            "Deja-Vu",
            "Alexander the Great"
    };

    String[] dioSongs = new String[]{
            "Stand Up and Shout",
            "Holy Diver",
            "Gypsy",
            "Caught in the Middle",
            "Don't Talk to Strangers",
            "Straight Through the Heart",
            "Invisible",
            "Rainbow in the Dark",
            "Shame on the Night"
    };

    String[] zenobiaSongs = new String[]{
            "Borraré tu nombre",
            "La última vez",
            "El sueño de un loco",
            "Al pie del cañón",
            "Concédeme de una vida",
            "Supernova",
            "El conquistador",
            "La fiebre del oro",
            "Una de piratas"
    };

    String[] nightCoreSongs = new String[]{
            "The Phoenix",
            "My Demons",
            "Courtesy Call",
            "new Divide",
            "Warriors",
            "Thanks for the memories",
            "Get out Alive",
            "Bring Me To Live",
            "This is war"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        // Adaptador
        final ListView lista = (ListView) findViewById(R.id.listSongs);

        Bundle getKey = getIntent().getExtras();
        String key = getKey.getString("songKey");

        if(key.equals("1")){
            adapter = new ListViewAdapter(this, maidenSongs);
        }else if (key.equals("2")){
            adapter = new ListViewAdapter(this,dioSongs);
        }else if (key.equals("3")){
            adapter = new ListViewAdapter(this,zenobiaSongs);
        }else if (key.equals("4")){
            adapter = new ListViewAdapter(this,nightCoreSongs);
        }else{

        }

        lista.setAdapter(adapter);
    }
}
