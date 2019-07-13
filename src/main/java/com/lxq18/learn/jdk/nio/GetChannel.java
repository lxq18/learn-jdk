package com.lxq18.learn.jdk.nio;

import com.lxq18.learn.jdk.util.DateUtils;

import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author lxq
 * @create 2019/7/13 18:19
 */
public class GetChannel {
    private static final int BSIZE = 1024;

    public static void main(String[] args) throws Exception {
        FileChannel fc = new FileOutputStream("testdata/data.txt").getChannel();
        fc.write(ByteBuffer.wrap((DateUtils.nowString() + "Some text").getBytes()));
        fc.close();
    }
}
