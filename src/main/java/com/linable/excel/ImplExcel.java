package com.linable.excel;

import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.read.context.AnalysisContext;
import com.alibaba.excel.read.event.AnalysisEventListener;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.linable.excel.model.SysUserAcc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author HangYang.Lin
 *         on 2018-06-04.
 */
public class ImplExcel {

    public static void main(String[] args) throws Exception {
//        InputStream inputStream = getInputStream2("1.xlsx");
        //        System.out.println("------------------------");
        //        readExcel(inputStream);
        noModelMultipleSheet();
    }

    public static void noModelMultipleSheet() {
        InputStream inputStream = getInputStream("1.xlsx");
        try {
            ExcelReader reader = new ExcelReader(inputStream, ExcelTypeEnum.XLSX, null, new AnalysisEventListener<List<String>>() {
                @Override
                public void invoke(List<String> object, AnalysisContext context) {
                    System.out.println(
                        "当前sheet:" + context.getCurrentSheet().getSheetNo() + " 当前行：" + context.getCurrentRowNum() + " data:" + object);
                }

                @Override
                public void doAfterAllAnalysed(AnalysisContext context) {

                }
            });

            reader.read();
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static InputStream getInputStream2(String url) throws Exception {
        // 第1步、使用File类找到一个文件
        File f = new File("E:" + File.separator + url);    // 声明File对象
        // 第2步、通过子类实例化父类对象
        InputStream input = null;    // 准备好一个输入的对象
        input = new FileInputStream(f);    // 通过对象多态性，进行实例化
        // 第3步、进行读操作
        byte b[] = new byte[1024];        // 所有的内容都读到此数组之中
        input.read(b);        // 读取内容   网络编程中 read 方法会阻塞
        // 第4步、关闭输出流
        input.close();                        // 关闭输出流
        System.out.println("内容为：" + new String(b));    // 把byte数组变为字符串输出
        return input;
    }

    private static List<SysUserAcc> readExcel(InputStream inputStream) {

        try {
            // 解析每行结果在listener中处理
            AnalysisEventListener listener = new ExcelListener();

            ExcelReader excelReader = new ExcelReader(inputStream, ExcelTypeEnum.XLS, null, listener);

            excelReader.read(new Sheet(1, 2, SysUserAcc.class));
        } catch (Exception e) {

        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    private static InputStream getInputStream(String fileName) {
        return ImplExcel.class.getClassLoader().getResourceAsStream("" + fileName);

    }
}
