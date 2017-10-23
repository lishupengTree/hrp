package com.lsp.his.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author lishupeng
 * @create 2017-10-23 下午 11:07
 **/
public class LogInfoSave {
    public static String strRight(String value) {
        return value.substring(value.length() - 2, value.length());
    }

    /*
     * @将日志保存到文件中
     * @newLog要添加进去的日志记录
     * @filePath文件的路径
     */
    public static synchronized void appendLog(String newLog,String filePath) {
        Scanner sc = null;
        PrintWriter pw = null;
        File log = new File(filePath);
        try {
            if(!log.exists()){//如果文件不存在,则新建.
                File parentDir = new File(log.getParent());
                if(!parentDir.exists()){//如果所在目录不存在,则新建.
                    parentDir.mkdirs();
                }
                log.createNewFile();
            }
            //  sc = new Scanner(log);
//            StringBuilder sb = new StringBuilder();
//            while(sc.hasNextLine()){//先读出旧文件内容,并暂存sb中;
//                sb.append(sc.nextLine());
//                sb.append("\r\n");//换行符作为间隔,扫描器读不出来,因此要自己添加.
//            }
//            sc.close();

            pw = new PrintWriter(new FileWriter(log), true);
            /*
             * A.
             */
            //  pw.print(sb.toString());//,写入旧文件内容.
            /*
             * B.
             */
            pw.println(newLog);//写入新日志.
            /*
             * 如果先写入A,最近日志在文件最后. 如是先写入B,最近日志在文件最前.
             */
            pw.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }

}
