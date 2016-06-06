/*
 * Licensed to Elasticsearch under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.elasticsearch.action.admin.indices.rollover;

import org.elasticsearch.action.support.master.MasterNodeOperationRequestBuilder;
import org.elasticsearch.client.ElasticsearchClient;
import org.elasticsearch.common.unit.TimeValue;


/**
 * TODO: Documentation
 */
public class RolloverRequestBuilder extends MasterNodeOperationRequestBuilder<RolloverRequest, RolloverResponse,
    RolloverRequestBuilder> {
    public RolloverRequestBuilder(ElasticsearchClient client, RolloverAction action) {
        super(client, action, new RolloverRequest());
    }

    public RolloverRequestBuilder setSourceAlias(String sourceAlias) {
        this.request.setSourceAlias(sourceAlias);
        return this;
    }

    public RolloverRequestBuilder addMaxIndexAgeCondition(TimeValue age) {
        this.request.addMaxIndexAgeCondition(age);
        return this;
    }

    public RolloverRequestBuilder addMaxIndexDocsCondition(long docs) {
        this.request.addMaxIndexDocsCondition(docs);
        return this;
    }
}
