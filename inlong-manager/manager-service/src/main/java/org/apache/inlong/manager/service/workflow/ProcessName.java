/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.inlong.manager.service.workflow;

/**
 * WorkflowProcess name
 */
public enum ProcessName {

    /**
     * New business access application process
     */
    NEW_BUSINESS_WORKFLOW("New-Business-Access"),

    /**
     * Startup business application process
     */
    STARTUP_BUSINESS_WORKFLOW("Startup-Business"),

    /**
     * Suspend business application process
     */
    SUSPEND_BUSINESS_WORKFLOW("Suspend-Business"),

    /**
     * Restart business application process
     */
    RESTART_BUSINESS_WORKFLOW("Restart-Business"),

    /**
     * Delete business application process
     */
    DELETE_BUSINESS_WORKFLOW("Delete-Business"),

    /**
     * New data consumption application process
     */
    NEW_CONSUMPTION_WORKFLOW("New-Data-Consumption"),

    /**
     * New business resource creation
     */
    CREATE_BUSINESS_RESOURCE("Business-Access-Resource"),

    /**
     * Single data stream resource creation
     */
    CREATE_DATASTREAM_RESOURCE("Data-Stream-Resource");

    private final String displayName;

    ProcessName(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

}
