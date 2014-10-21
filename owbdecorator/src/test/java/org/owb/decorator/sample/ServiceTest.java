package org.owb.decorator.sample;

import java.io.Serializable;

import javax.inject.Inject;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class ServiceTest extends
        org.apache.myfaces.extensions.cdi.test.junit4.AbstractCdiAwareTest {

    @Inject
    ServiceImpl service;

    @Test
    public void test() {
        Assert.assertNotNull("Inject service is null", this.service);
        Assert.assertFalse("Value should be false before calling service",ServiceDecorator.called);
        this.service.test(new Serializable() {
        });
        Assert.assertTrue("Value should be true after calling service",
                ServiceDecorator.called);
    }
}
