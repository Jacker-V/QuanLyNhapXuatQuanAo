/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pttkhttt;

import com.database.DB;
import com.login.LoginFrame;

/**
 *
 * @author Jacker
 */
public class PTTKHTTT {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        LoginFrame LoginObj = new LoginFrame();
        LoginObj.show();
                
        DB.loadConnection();
    }
}
