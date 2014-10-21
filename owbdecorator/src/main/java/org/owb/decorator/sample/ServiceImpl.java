package org.owb.decorator.sample;

import java.io.Serializable;

public class ServiceImpl implements IExtendService<Serializable> {

    @Override
    public boolean test(final Serializable value) {
        return false;
    }

    @Override
    public boolean another(final Serializable value) {
        return false;
    }

}
