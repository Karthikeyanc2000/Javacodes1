package packages;

import java.util.ArrayList; // HERE IT IS IMPORTED.

import packages.others.*;

//import packages.others.calc.Calc;
//import packages.others.calc.AdvCalc;

//simply we can use * for importing all files from that pack but remember,
//*  bring only all that files not folders. 

import packages.others.calc.*; //here we importing all files from Calc package, but not all folders.


//import java.lang.*; this is defaultly imported in all java class but we cant see it,
//it is used for so many things example working of System. and etc........


//some time we need to give unique key word for our package so we will reverse our domain name,
//example com.google
//import com.google.calc.advcalc.mycalc.*; // it is an example.

public class Karthik {

    public static void main(String [] args)
    {
        ArrayList array = new ArrayList<>();
        AdvCalc adv = new AdvCalc();
        Calc cal = new Calc();
    }
    
}
