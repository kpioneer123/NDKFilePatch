package com.haocai.ndktest;

/**
 * Created by Xionghu on 2017/11/9.
 * Desc:
 */

public class NDKFileUtils {

    /**
     * 拆分
     * @param path 完整包路径
     * @param path_pattern 分包路径
     * @param count
     */
    public native static void diff(String path,String path_pattern,int count);


    /**
     * 合并
     * @param path_pattern 分包路径
     * @param count
     * @param merge_path 完整包路径
     */
    public native static void patch(String path_pattern,int count,String merge_path);

    static {
        System.loadLibrary("mylibrary");
    }

}
