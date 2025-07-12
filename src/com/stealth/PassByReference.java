package com.stealth;

public class PassByReference {
    public static void main(String[] args) {
        Temp temp1 = new Temp();
        temp1.name = "kutty";
        temp1.age = 22;

        //in this case the memory address has been passed to the new Reference Variable
        Temp temp2 = temp1;

//
//         temp1 ----------\
//                          \
//                          new temp();
//                         /
//        temp2 ----------/

        
        System.out.println(temp1);

        temp2.name = "Ranga";
        temp1.age = 31;
        //as we know the memory address has been passed so the original object values will be manipulated

        System.out.println(temp1.name +" "+temp1.age);
        System.out.println(temp2.name +" "+temp2.age);
    }
}
