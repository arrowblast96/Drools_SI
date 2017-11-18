package com.sample;

public enum Kategoria {
A(0),B(1),D(2),NULL(3);
private final int value;

private Kategoria(int value) {
    this.value = value;
}

public int getValue() {
    return value;
}



}
