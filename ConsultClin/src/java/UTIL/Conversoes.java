/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTIL;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author Aluno
 */
public class Conversoes {

    public static Date converterData(String data) {
        try {
            DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
            if (data != null || !data.trim().equals("")) {
                return fmt.parse(data);
            } else {
                return null;
            }
        } catch (Exception ex) {
            System.out.println("Problemas ao converter data!"
                    + "\n Erro: " + ex.getMessage());
            ex.printStackTrace();
            return null;
        }
    }

}
