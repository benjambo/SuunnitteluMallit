package com.company;

import com.company.adidas.AdidasConcreteFactory;
import com.company.adidas.AdidasLippis;
import com.company.boss.BossConcreteFactory;
import com.company.products.Lippis;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws Exception {

        AbstractVaateFactory adidas = new AdidasConcreteFactory();
        AbstractVaateFactory boss = new BossConcreteFactory();

        // Creating objects of Class
        Class c1 = adidas.getClass();
        //Class c2 = boss.getClass();

        // Getting methods of the class through the object
        // of the class by using getDeclaredMethods
        Method[] methods = c1.getDeclaredMethods();

        // Printing method names
        for (Method m : methods) {
            System.out.println("Method Name: " + m.getName());

            // get the access modifier of methods
            int modifier = m.getModifiers();
            System.out.println("Modifier: " + Modifier.toString(modifier));

            // get the return types of method
            System.out.println("Return Types: " + m.getReturnType());
            System.out.println(" ");
        }

        Jasper jasper = new Jasper();

        System.out.println("Ennen valmistumista:");
        jasper.valitseFactory(adidas);

        System.out.println("****************************************************************************");

        System.out.println("Valmistumisen jälkeen:");
        jasper.valitseFactory(boss);
    }
}

