package com.baeldung.baeldungspringreactiveapi.data.VO;

/**
 * Foo (VO)
 * @author Chris
 * @date 2023-01-10
 */
public class Foo {

    private String ID;
    private String name;

    /**
     * Constructor
     */
    public Foo() {
    }

    /**
     * Constructor
     * @param ID
     * @param name
     */
    public Foo(String ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Foo{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                '}';
    }
}
