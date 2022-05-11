package org.example.javaproblem.chapter2.p46_equals_and_hashcode;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;

@Data
@AllArgsConstructor
public class Player {

    private int id;
    private String name;

//    public Player(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//
//        if (this == null) {
//            return true;
//        }
//
//        if (obj == null) {
//            return false;
//        }
//
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//
//        final Player other = (Player) obj;
//
//        if (this.id != other.id) {
//            return false;
//        }
//
//        return Objects.equals(this.name, other.name);
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 79 * hash + this.id;
//        hash = 79 * hash + Objects.hashCode(this.name);
//        return hash;
//    }
}
