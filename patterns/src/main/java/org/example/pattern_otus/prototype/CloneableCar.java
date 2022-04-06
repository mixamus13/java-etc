package org.example.pattern_otus.prototype;

import java.util.Objects;

public class CloneableCar implements Cloneable {

    private String model;

    public CloneableCar(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    protected CloneableCar clone() throws CloneNotSupportedException {
        CloneableCar car = (CloneableCar) super.clone();
        // .........
        return car;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CloneableCar that = (CloneableCar) o;
        return Objects.equals(model, that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model);
    }
}
