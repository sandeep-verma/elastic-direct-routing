package org.elasticsearch.plugin.direct;

import java.util.Collection;
import com.google.common.collect.Lists;
import org.elasticsearch.common.component.LifecycleComponent;

import java.util.Collection;
import org.elasticsearch.common.inject.Module;
import org.elasticsearch.plugins.Plugin;
import org.elasticsearch.rest.RestModule;

public class DirectRoutingPlugin  extends Plugin {
    @Override
    public String name() {
        return "elasticsearch-direct-routing-plugin";
    }

    @Override
    public String description() {
        return "Elasticsearch Direct Routing Plugin.";
    }


    @Override
    public Collection<Module> nodeModules() {
        final Collection<Module> modules = Lists.newArrayList();
        modules.add(new DirectRoutingModule());
        return modules;
    }









    
}
