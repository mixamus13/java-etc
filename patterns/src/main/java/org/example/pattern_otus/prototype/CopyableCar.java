package org.example.pattern_otus.prototype;

import java.util.Objects;

public class CopyableCar implements Copyable<CopyableCar> {

    private String model;

    public CopyableCar(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public CopyableCar copy() {
        return new CopyableCar(model);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CopyableCar that = (CopyableCar) o;
        return Objects.equals(model, that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model);
    }
}
