package com.kodcu.rapid.app;

import com.kodcu.rapid.path.*;
import com.kodcu.rapid.provider.JsonProvider;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Set;

/**
 * Created by Hakan on 2/10/2016.
 */
@ApplicationPath("docker")
public class AppConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        resources.add(Container.class);
        resources.add(Image.class);
        resources.add(Volume.class);
        resources.add(Network.class);
        resources.add(Misc.class);
        resources.add(JsonProvider.class);
        return resources;
    }


}