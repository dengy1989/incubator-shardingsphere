/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.orchestration.center.configuration;

import java.util.Properties;
import lombok.Getter;
import lombok.Setter;
import org.apache.shardingsphere.underlying.common.config.TypeBasedSPIConfiguration;

/**
 * Orchestration Instance Configuration.
 *
 * @author zhangliang
 * @author dongzonglei
 * @author wangguangyuan
 * @author sunbufu
 */
@Getter
@Setter
public class InstanceConfiguration extends TypeBasedSPIConfiguration {
    
    /**
     * Type of orchestration.
     */
    private String orchestrationType;
    
    /**
     * Server list of center.
     */
    private String serverLists;
    
    /**
     * Namespace of center.
     */
    private String namespace;
    
    /**
     * Constructor for InstanceConfiguration.
     * @param type  instance type
     */
    public InstanceConfiguration(final String type) {
        super(type);
    }
    
    /**
     * Constructor for InstanceConfiguration.
     * @param type instance type
     * @param properties extra properties
     */
    public InstanceConfiguration(final String type, final Properties properties) {
        super(type, properties);
    }
}
