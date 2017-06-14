package shanyao.downloadmanager;

import android.os.Bundle;
import android.os.Process;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;
import android.widget.TextView;

import shanyao.downloadmanager.manager.UpdateManager;

public class MainActivity extends AppCompatActivity {

    static ProgressBar bar;
    static TextView tvProgress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new UpdateManager(this).checkUpdate(false);
        bar = (ProgressBar) findViewById(R.id.progress);
        tvProgress = (TextView) findViewById(R.id.tvProgress);


    }

    public static void updateProgress(long progress,long total){
        bar.setMax((int) total);
        bar.setProgress((int) progress);

        tvProgress.setText((progress*100/total)+"%");
    }
}
