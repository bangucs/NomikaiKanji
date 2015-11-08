package com.bangucs.nomikaikanji;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

/**
 * Created by mitsuo on 15/11/07.
 */
class NomikaiKanji {
    private int kaihi = 0;
    private int ninzu = 0;
    private List members = new ArrayList<String>();

    public void setMembers(String value) {
        members.add(value);
    }

    public String calcWholeKaihi(){
        int wholeKaihi = kaihi * ninzu;
        int others = ninzu - members.size();
        if(members.size()==0){
            return "会費はお一人さま" + kaihi + "円です";
        } else {
            String returnString = null;
            for (int i = 0; i < members.size(); i++) {
                String member = members.get(i).toString();
                wholeKaihi = wholeKaihi - parseInt(member.substring(member.indexOf(':') + 1));
                returnString = returnString + "\n" + member;
            }
            int ohitorisama = wholeKaihi / others;
            returnString = returnString + "\n" + " 他の皆さんはお一人さま" + ohitorisama + "円です";
            return returnString;
        }
    }

    public int getKaihi() {
        return kaihi;
    }

    public void setKaihi(int kaihi) {
        this.kaihi = kaihi;
    }

    public int getNinzu() {
        return ninzu;
    }

    public void setNinzu(int ninzu) {
        this.ninzu = ninzu;
    }
}
