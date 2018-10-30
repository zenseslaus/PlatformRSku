/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.google.gson.Gson;
import helper.PasienHelper;
import java.util.List;
import pojos.Pasien;

/**
 *
 * @author wewen
 */
public class testPasien1 {

    public static void main(String[] args) {
        PasienHelper helper = new PasienHelper();
        List<Pasien> list = helper.getAllPasien();
        Gson gson = new Gson();
        String json = gson.toJson(list);
        System.out.println(json);
    }
}
