/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.stratos.manager.composite.application.beans;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "groups")
public class GroupDefinition {

    private String name;

    private String alias;

    private int groupMinInstances;

    private int groupMaxInstances;

    private boolean isGroupScalingEnabled;

    private boolean isGroupInstanceMonitoringEnabled;

    private String autoscalingPolicy;

    private List<SubscribableDefinition> subscribables;

    private List<GroupDefinition> subGroups;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getAutoscalingPolicy() {
        return autoscalingPolicy;
    }

    public void setAutoscalingPolicy(String autoscalingPolicy) {
        this.autoscalingPolicy = autoscalingPolicy;
    }

    public List<SubscribableDefinition> getSubscribables() {
        return subscribables;
    }

    public void setSubscribables(List<SubscribableDefinition> subscribableDefinitions) {
        this.subscribables = subscribableDefinitions;
    }

    public List<GroupDefinition> getSubGroups() {
        return subGroups;
    }

    public void setSubGroups(List<GroupDefinition> subGroups) {
        this.subGroups = subGroups;
    }

    public int getGroupMinInstances() {
        return groupMinInstances;
    }

    public void setGroupMinInstances(int groupMinInstances) {
        this.groupMinInstances = groupMinInstances;
    }

    public int getGroupMaxInstances() {
        return groupMaxInstances;
    }

    public void setGroupMaxInstances(int groupMaxInstances) {
        this.groupMaxInstances = groupMaxInstances;
    }

    public boolean isGroupScalingEnabled() {
        return isGroupScalingEnabled;
    }

    public void setGroupScalingEnabled(boolean isGroupScalingEnabled) {
        this.isGroupScalingEnabled = isGroupScalingEnabled;
    }

    public boolean isGroupInstanceMonitoringEnabled() {
        return isGroupInstanceMonitoringEnabled;
    }

    public void setGroupInstanceMonitoringEnabled(boolean isGroupInstanceMonitoringEnabled) {
        this.isGroupInstanceMonitoringEnabled = isGroupInstanceMonitoringEnabled;
    }
}
