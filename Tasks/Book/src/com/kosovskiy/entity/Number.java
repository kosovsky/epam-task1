package com.kosovskiy.entity;

/**
 * The class Number describes text entity of number in text
 * 
 * Created by Юрий on 28.04.14.
 */
public abstract class Number extends TextEntity {

    /**
     * The method return how many chars contains number
     *
     * @return
     */
    @Override
    public int lengthChar() {
        return toString().length();
    }
}
