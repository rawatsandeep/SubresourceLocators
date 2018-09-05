package com.app.test.resource;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;

/*
 * @author SANDEEP RAWAT
 */
public class ApplicationConfig extends Application {
    
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> set = new HashSet<>();
        return set;
    }
    
    @Override
    public Set<Object> getSingletons() {
        Set<Object> set = new HashSet<>();
        return set;
    }
    
}
