/*
 * Copyright (c) 2016, WSO2 Inc. (http://wso2.com) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.business.messaging.admin.services.managers.bean.utils;

/**
 * Stores cluster management constants which are used to contact through MBeans.
 */
public class BrokerManagementConstants {

    /**
     * Attribute name for 'ClusteringEnabled'
     */
    public static final String IS_CLUSTERING_ENABLED = "ClusteringEnabled";

    /**
     * Attribute name for 'MyNodeID'
     */
    public static final String MY_NODE_ID = "MyNodeID";

    /**
     * Attribute name for 'AllClusterNodeAddresses'
     */
    public static final String ALL_CLUSTER_NODE_ADDRESSES =  "AllClusterNodeAddresses";

    /**
     * Attribute name for 'CoordinatorNodeAddress'
     */
    public static final String COORDINATOR_NODE_ADDRESS = "CoordinatorNodeAddress";

    /**
     * Attribute name for 'StoreHealth'
     */
    public static final String STORE_HEALTH = "StoreHealth";
}
