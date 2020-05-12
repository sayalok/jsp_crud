/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import javax.servlet.http.HttpSession;

/**
 *
 * @author me
 */
public class Session {
    private String sess_uname;

    public String getSess_uname() {
        return sess_uname;
    }

    public void setSess_uname(HttpSession sess, String sess_uname) {
        this.sess_uname = sess_uname;
        sess.setAttribute("uname", this.sess_uname);
    }
    
    
}
