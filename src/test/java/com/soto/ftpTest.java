package com.soto;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import static com.soto.FtpService.uploadFile;

public class ftpTest {
    public static void main(String[] args) {
        try {
            FileInputStream in=new FileInputStream(new File("E:/aaa.gif"));
            boolean flag = uploadFile("192.168.1.103", 22, "admin", "admin", "E:\\Tools\\FtpServer\\ftpfile", "aaa.gif", in);
            System.out.println(flag);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
