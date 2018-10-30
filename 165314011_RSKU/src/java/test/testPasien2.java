/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import helper.PasienHelper;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wewen
 */
public class testPasien2 {

    public static void main(String[] args) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
            String tglLahir = "19970717";
            Date date;
            date = format.parse(tglLahir);
            String noRm = "165314011";
            String nama = "Tyas";
            String alamat = "Magelang";
            String kelamin = "Lelaki";
            PasienHelper helper = new PasienHelper();
            helper.addNewPasien(noRm, nama, alamat, noRm, date, kelamin);
        } catch (ParseException ex) {
            Logger.getLogger(testPasien2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
