package br.com.cicero.ednilson.prototype.implantation;

import br.com.cicero.ednilson.prototype.definition.Employee;

public class Administrator extends Employee {
    public Administrator(Integer id, String name) {
        super(id, name);
    }

    @Override
    public Employee copy() {
        return new Administrator(this.getId(), this.getName());
    }
}
