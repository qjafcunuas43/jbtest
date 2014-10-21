package org.owb.decorator.sample;

import java.io.Serializable;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;

@Decorator
public abstract class ServiceDecorator<S extends Serializable> implements
        IExtendService<S> {

    @Inject
    @Delegate
    @Any
    private IExtendService<S> delegate;

    public static boolean called = false;

    @Override
    public boolean test(final S value) {
        called = true;
        return this.delegate.test(value);
    }

}
