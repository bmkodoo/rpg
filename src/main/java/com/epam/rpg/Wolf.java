package com.epam.rpg;

/**
 * Created by kodoo on 09.10.16.
 */
public class Wolf<T extends Unit> extends Mount<T> {
    @Override
    protected String render() {
        return "на волке";
    }
}
