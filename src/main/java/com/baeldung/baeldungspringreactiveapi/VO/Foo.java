package com.baeldung.baeldungspringreactiveapi.VO;

/**
 * Foo (VO)
 * @author Chris
 * @date 2023-01-10
 */
public class Foo {

    private long ID;
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
    public Foo(long ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
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
