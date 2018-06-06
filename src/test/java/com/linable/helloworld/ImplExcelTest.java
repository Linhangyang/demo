package com.linable.helloworld;

import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.read.context.AnalysisContext;
import com.alibaba.excel.read.event.AnalysisEventListener;
import com.alibaba.excel.support.ExcelTypeEnum;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author HangYang.Lin
 *         on 2018-06-04.
 */
public class ImplExcelTest {

    @Test
    public void noModelMultipleSheet() {
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

    private static InputStream getInputStream(String fileName) {
        return ImplExcelTest.class.getClassLoader().getResourceAsStream("" + fileName);

    }
}
