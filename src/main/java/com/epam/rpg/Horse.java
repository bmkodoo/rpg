package com.epam.rpg;

public class Horse<T extends Unit> extends Mount<T> {

    @Override
    protected String render() {
        return "на коне";
    }
}
