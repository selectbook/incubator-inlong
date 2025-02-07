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

package org.apache.inlong.sort.protocol.transformation.relation;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.List;

/**
 * Union relationship class which defines the union relationship
 */
@JsonTypeName("union")
@EqualsAndHashCode(callSuper = true)
@Data
public class UnionNodeRelationShip extends NodeRelationShip {

    private static final long serialVersionUID = 6602357131254518291L;

    /**
     * UnionNodeRelationShip Constructor
     *
     * @param inputs The inputs is a list of input node id
     * @param outputs The outputs is a list of output node id
     */
    public UnionNodeRelationShip(@JsonProperty("inputs") List<String> inputs,
            @JsonProperty("outputs") List<String> outputs) {
        super(inputs, outputs);
    }

    public String format() {
        return "UNION ALL";
    }
}
