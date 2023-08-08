package io.github.charlesanjos.exemplogsonhttp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  private TextView textViewID;
  private final String URL = "https://jsonplaceholder.typicode.com/posts";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  } //onCreate
}//class