package com;

class x{
    x(){
    System.out.println("X Constructor");
    }
}

class y extends x{
    y(){
    System.out.println("Y Constructor");
    }
}

class z extends y{
    z(){
    System.out.println("Z Constructor");
    }
}



public class MultiLevelInheritance {
    public static void main(String args[]) {
        
        z z_ref = new z();
        
        System.out.println(z_ref);
        
        
    }
}
