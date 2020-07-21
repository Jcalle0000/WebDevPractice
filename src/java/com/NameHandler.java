package com;

/**
 *
 * @author jasoncalle
 */
/** What is the package name?*/

public class NameHandler 
{
    private String name;
    public NameHandler(){
        name=null;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
//    public static void main(String[] args) 
//    {  
//        String packName = new NameHandler(){}.getClass().getPackage().getName();        
//        System.out.println(packName);
//    }  

    
    
            
}
