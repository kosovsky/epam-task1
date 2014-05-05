package com.kosovskiy.entity;

/**
 * The class Punctuation describes text entity of punctuation in text
 * 
 * Created by Юрий on 28.04.14.
 */
public class Punctuation extends TextEntity {

    private char value;

    /**
     * Constructor initializes a newly created {@code Car} object so that it
     * represents the same punctuation.
     *
     * @param punctuation
     */
    public Punctuation(char punctuation) {
        this.value = punctuation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null) {
            return false;
        }

        if (o.getClass().equals(String.class)) {
            String str = (String) o;
            if (str.length() == 1) {
                return str.charAt(0) == value;
            }
        }

        if (o.getClass().equals(Character.class)) {
            return o.equals(value);
        }

        if (o.getClass().equals(this.getClass())) {
            Punctuation that = (Punctuation) o;
            if (value != that.value) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode() {
        return (int) value;
    }

    /**
     *
     * @return value 1 for all objects
     */
    @Override
    public int lengthChar() {
        return 1;
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }
}
