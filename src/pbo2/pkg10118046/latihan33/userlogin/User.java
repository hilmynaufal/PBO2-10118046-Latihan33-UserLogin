/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118046.latihan33.userlogin;

/**
 *
 * @author ASUS
 */
public class User {
    private final String username = "RizkiAdam", password = "terbaikselalu";
    private boolean statusAkun;
    
    private boolean cekAkun(String parUserName, String parPassword) {
        return (parUserName.equals(username)) && (parPassword.equals(password));
    }
    
    private void hasilLogin(boolean status, String parUserName) {
        parUserName = parUserName.toUpperCase();
        if (status) System.out.println("\n******HALLO " + parUserName +"******\nSelamat Datang di Aplikasi Ini");
        else System.out.println("\nOopps, Username atau Password anda salah");
    }
    
    public void pengecekanLogin(String parUserName, String parPassword) {
        statusAkun = cekAkun(parUserName, parPassword);
        hasilLogin(statusAkun, parUserName);
    }
}
