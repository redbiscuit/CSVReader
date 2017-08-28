package com.bj.basic;

import no.laukvik.csv.CSV;
import no.laukvik.csv.Row;
import no.laukvik.csv.columns.StringColumn;
import no.laukvik.csv.io.CsvReaderException;

import java.io.*;

/**
 * Created by JACKSON on 2017/8/28.
 */
public class CSVReader {

    public static void main(String[] args) throws CsvReaderException {

        CSV csv = new CSV(new File("loginId.csv") );
        StringColumn firstOne = (StringColumn) csv.getColumn(0);
        StringColumn SenondOne = (StringColumn) csv.getColumn(1);
        for (Row row : csv.findRows()) {
            System.out.println(row.get(firstOne));
            System.out.println(row.get(SenondOne));
        }
    }
}
