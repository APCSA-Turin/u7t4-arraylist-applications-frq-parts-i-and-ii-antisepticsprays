package com.example.project.Delimiter;
import java.util.ArrayList;

public class Delimiters {
    /** The open and close delimiters **/
    private String openDel;
    private String closeDel;

    /** Constructs a Delimiters object where open is the open delimiter and close is the
     *  close delimiter.
     *  Precondition: open and close are non-empty strings.
     */
    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }

    /** Returns an ArrayList of delimiters from the array tokens, as described in part (a). */
    public ArrayList<String> getDelimitersList(String[] tokens) {
        ArrayList<String> delimList = new ArrayList<String>();
        for (String string : tokens) {
            if (string.equals(openDel) || string.equals(closeDel)) {
                delimList.add(string);
            }
        }
        return delimList;
    }
    

    /** Returns true if the delimiters are balanced and false otherwise, as described in part (b).
     *  Precondition: delimiters contains only valid open and close delimiters.
     */
    public boolean isBalanced(ArrayList<String> delimiters) {
        int openDelOcc = 0;
        int closedDelOcc = 0;
        for (String string : delimiters) {
            if (string.equals(openDel)) {
                openDelOcc++;
            }
            if (string.equals(closeDel)) {
                closedDelOcc++;
            }
            if (closedDelOcc > openDelOcc) {
                return false;
            }
        }
        if (openDelOcc != closedDelOcc) {
            return false;
        }else{
            return true;
        }
    }
}