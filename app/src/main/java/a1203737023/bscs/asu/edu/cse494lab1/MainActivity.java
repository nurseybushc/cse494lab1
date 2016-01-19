package a1203737023.bscs.asu.edu.cse494lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    String movieJson;
    Movie m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);

        movieJson = "{\"Title\":\"Memento\",\"Year\":\"2000\",\"Rated\":\"R\",\"Released\":\"25 May 2001\",\"Runtime\":\"113 min\",\"Genre\":\"Mystery, Thriller\", \"Actors\":\"Guy Pearce, Carrie-Anne Moss, Joe Pantoliano, Mark Boone Junior\",\"Plot\":\"A man creates a strange system to help him remember things; so he can hunt for the murderer of his wife without his short-term memory loss being an obstacle.\"}";
        m = new Movie(movieJson);

    }
    public void onButtonClick(View v) {
        textView.setText(m.toJsonString());
    }
}
