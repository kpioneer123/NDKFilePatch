package com.haocai.ndktest;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    private String SD_CARD_PATH;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SD_CARD_PATH = Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    /**
     * 拆分包
     *
     * @param v
     */
    public void diffPackage(View v) {
        String path = SD_CARD_PATH + File.separator+ "小苹果.mp3";
        String path_pattern = SD_CARD_PATH + File.separator +"小苹果_%d.mp3";
        NDKFileUtils.diff(path, path_pattern,3);
        Log.d("Main","拆分成功");
    }

    /**
     * 合并包
     *
     * @param v
     */
    public void patchPackage(View v) {
        String merge_path = SD_CARD_PATH + File.separator+ "小苹果_合并.mp3";
        String path_pattern = SD_CARD_PATH + File.separator +"小苹果_%d.mp3";
        NDKFileUtils.patch(path_pattern, 3,merge_path);
        Log.d("Main","合并成功");
    }
}
