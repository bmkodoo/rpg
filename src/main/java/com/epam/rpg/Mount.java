package com.epam.rpg;

public abstract class Mount<T extends Unit> extends Unit {
    private T rider;

    public Mount<T> withRider(T rider) {
        this.rider = rider;
        return this;
    }

    @Override
    public String toString() {
        return rider != null ?
                rider.toString() + " " + render() :
                render() + " никого нет";
    }
}
