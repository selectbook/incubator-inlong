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

package org.apache.inlong.manager.common.pojo.cluster;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.inlong.manager.common.beans.PageRequest;

/**
 * Cluster paging query conditions
 */
@Deprecated
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel("Cluster paging query conditions")
public class ClusterPageRequest extends PageRequest {

    @ApiModelProperty(value = "Cluster type, including TUBE, PULSAR, etc.")
    private String type;

    @ApiModelProperty(value = "Cluster IP")
    private String ip;

    @ApiModelProperty(value = "Keyword, name, description, etc.")
    private String keyword;

    @ApiModelProperty(value = "Status")
    private Integer status;

    @ApiModelProperty(value = "Current user", hidden = true)
    private String currentUser;

    @ApiModelProperty(value = "Set name of MQ cluster", hidden = true)
    private String mqSetName;

}
