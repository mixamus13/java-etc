package org.example.javaproblem.chapter2.p42_null_throw_spesified_exception;

import java.util.function.Supplier;

public class MyObjects {


    // 1)
    public static <T> T requireNotNullElseThrowIAE(T obj, String message) {
        if (obj == null) {
            throw new IllegalArgumentException(message);
        }

        return obj;
    }

    // 2)
    public static <T> T requireNotNullElseThrowIAE(T obj, Supplier<String> messageSupplier) {
        if (obj == null) {
            throw new IllegalArgumentException(messageSupplier == null ? null : messageSupplier.get());
        }

        return obj;
    }

    // 3) предпочтительно
    public static <T, X extends Throwable> T requireNonNullElseThrow(T obj, X exception) throws X {
        if (obj == null) {
            throw exception;
        }

        return obj;
    }

    // 4) предпочтительно
    public static <T, X extends Throwable> T requireNotNullElseThrow(T obj, Supplier<? extends X> exceptionSupplier) throws X {
        if (obj != null) {
            return obj;
        } else {
            throw exceptionSupplier.get();
        }
    }
}
