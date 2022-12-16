package com.example.sqlitebooster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    //=============================================
    //
    // Methods and class to extend the capabilities of a standard SQLite database
    // - allows you to split one record field into several fields without adding
    //   new tables and links, use different data types in one record field, etc.
    //
    //
    //=============================================
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    } // OnCreate


    // ============================================================
    //
    // This method takes 5 strings and generates one <shmelev> delimited
    // new string from them. New line is placed in one field of a SQLite database record
    //
    // In the following method, the string is divided by the <shmelev> tag into its component parts
    // (pseudo-fields of the database record)
    //
    // v 1.0
    //
    // ============================================================
    public String textBoost(String e1Text, String e2Text, String e3Text, String e4Text, String e5Text) { // TEXT fragments
        String nText ="";
        nText = "<shmelev>" + e1Text + "<shmelev>" + e2Text + "<shmelev>" + e3Text + "<shmelev>" + e4Text + "<shmelev>" + e5Text;
            // SQLite Booster (c) by Valery Shmelev https://www.linkedin.com/in/valery-shmelev-479206227/
        Log.d("= Boosted text =","== == == == == ==| BOOSTED |== == == == " +  nText);
        return nText; //Return Text array - Fragments array

    } // textBoost()


    // ============================================================
    //
    // Restored Text Array
    //
    // v 1.0
    //
    // ============================================================
    public String[] unBooster(String unBoosted) {
        // ============================================================
        // Convert Boosted Text to unBoosted (Splitter)
        // ============================================================
        String[] splitted = unBoosted.split("<shmelev>"); // Split encrypted string by delimiter and write to array
        Log.d("= unBoosted text =","== == == == == ==| UNBOOSTED |== == == == " +  unBoosted);
        return splitted; //Return Text array
    }


} // MainActivity