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
package org.apache.rocketmq.studio.instance.group;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConsumerGroupSettingsVO {
    private String groupName;
    private Integer retryQueueNums;
    private Integer retryMaxTimes;
    private Boolean consumeEnable;
    private Boolean consumeMessageOrderly;
    private Boolean consumeBroadcastEnable;
    private String retryPolicy;
    private Integer fixedIntervalRetryTime;
    private String deadLetterTargetTopic;
    private Long maxReceiveTps;
    private String remark;
    @Builder.Default
    private List<String> editableFields = List.of();

    public boolean isConsumeEnable() {
        return Boolean.TRUE.equals(consumeEnable);
    }

    public boolean isConsumeMessageOrderly() {
        return Boolean.TRUE.equals(consumeMessageOrderly);
    }

    public boolean isConsumeBroadcastEnable() {
        return Boolean.TRUE.equals(consumeBroadcastEnable);
    }
}
