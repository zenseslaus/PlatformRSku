/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.google.gson.Gson;
import helper.AntrianHelper;
import java.util.List;
import pojos.Antrian;

/**
 *
 * @author Wewen
 */
public class testAntrian1 {

    public static void main(String[] args) {
        AntrianHelper helper = new AntrianHelper();
        List<Antrian> list = helper.getAllAntrian();
        Gson gson = new Gson();
        String json = gson.toJson(list);
        System.out.println(json);
    }
}
