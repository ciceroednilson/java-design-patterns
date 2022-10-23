package br.com.cicero.ednilson.prototype.definition;

public abstract class Employee {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(final Integer id, final String name) {
        this.id = id;
        this.name = name;
    }

    public abstract Employee copy();
}
