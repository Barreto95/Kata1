/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person("David", new Date(95,7,2));
        System.out.println(person.getName() + " tiene " + person.getEdad() + " años");
    }
}
