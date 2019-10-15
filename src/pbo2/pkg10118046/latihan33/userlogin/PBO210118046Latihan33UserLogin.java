/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118046.latihan33.userlogin;

import java.util.Scanner;

/**
 *
 * @author
 *  Nama              : M. Hilmy Naufal
 *  Kelas             : IF2
 *  NIM               : 10118046
 *  Deskripsi Program : membuat user login dengan konsep pbo
 */
public class PBO210118046Latihan33UserLogin {

    /**
     * @param args the command line arguments
     */
    private static String usName, passWord;

    
    
    public static void main(String[] args) {
        // TODO code application logic here
        User user = new User();
        
        System.out.print("Masukkan Username: ");
        Scanner scanner = new Scanner(System.in);
        usName = scanner.next();
        System.out.print("Masukkan Password: ");
        passWord = scanner.next();
        user.pengecekanLogin(usName, passWord);
    }

}
