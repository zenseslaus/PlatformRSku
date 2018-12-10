/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.google.gson.Gson;
import helper.AntrianHelper;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import pojos.Antrian;

/**
 *
 * @author Wewen
 */
public class testAntrian2 {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        String tgl = "20181206";
        Date date;
        date = format.parse(tgl);
        AntrianHelper helper = new AntrianHelper();
        helper.addNewAntrian(date, "9876598765", "Alex", "Jogja", "Evan");
    }
}
