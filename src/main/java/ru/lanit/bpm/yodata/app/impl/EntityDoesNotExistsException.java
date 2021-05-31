package ru.lanit.bpm.yodata.app.impl;

public class EntityDoesNotExistsException extends Exception {
    public EntityDoesNotExistsException(String message) {
        super(message);
    }
}
