package ir.uploadprogress;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ir.muploadprogress.DownloadProgressView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DownloadProgressView _progress = (DownloadProgressView)findViewById(R.id.progress);

    }
}
