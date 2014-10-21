package org.owb.decorator.sample;

public interface IService<O extends Object, T extends Object> {

    boolean test(final O value);
}
