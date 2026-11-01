package oop1laba.model;

public record Courier(String name,  boolean isBusy) {
    public Courier withStatus(boolean busy) {
        return new Courier(this.name,  busy);
    }
}