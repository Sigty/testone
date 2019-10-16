package com.effectivesoft.espoll.converter;

public interface Converter<R, T> {

    R convert(T object);
}
