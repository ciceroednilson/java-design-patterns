package br.com.cicero.ednilson.prototype;

import br.com.cicero.ednilson.prototype.definition.Employee;
import br.com.cicero.ednilson.prototype.implantation.Administrator;
import br.com.cicero.ednilson.prototype.implantation.Manager;

public class Main {

    public static void main(String[] args) {
        final Employee manager = new Manager(1, "Cícero");
        final Employee newManager = manager.copy();
        newManager.setName("Yuri");
        final Employee administrator = new Administrator(10, "Cícero Ednilson");
        final Employee newAdministrator = administrator.copy();
        newAdministrator.setName("Yuri Silva");
        System.out.println(manager.getName());
        System.out.println(newManager.getName());
        System.out.println(administrator.getName());
        System.out.println(newAdministrator.getName());
    }
}
