package org.owb.decorator.sample;

import java.io.Serializable;

public interface IExtendService<S extends Serializable> extends
        IService<S, Number> {
    boolean another(final S value);

}
