/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package election.VoteSelection;

import java.io.File;

/**
 *
 * @author yufengliu
 */

public class Selfie {
    File selfie;

    public Selfie(File s) {
        this.selfie = s;
    }

    public File getSelfie() {
        return selfie;
    }

    public void setSelfie(File file) {
        this.selfie = file;
    }
    
}
