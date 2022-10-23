package br.com.cicero.ednilson.prototype.implantation;

import br.com.cicero.ednilson.prototype.definition.Employee;

public class Manager extends Employee {
    public Manager(Integer id, String name) {
        super(id, name);
    }

    @Override
    public Employee copy() {
        return new Manager(this.getId(), this.getName());
    }
}
