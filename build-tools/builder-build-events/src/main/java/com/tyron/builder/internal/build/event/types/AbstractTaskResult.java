/*
 * Copyright 2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tyron.builder.internal.build.event.types;

import com.tyron.builder.tooling.internal.protocol.events.InternalIncrementalTaskResult;

import java.util.List;

public abstract class AbstractTaskResult extends AbstractResult implements InternalIncrementalTaskResult {

    private final boolean incremental;
    private final List<String> executionReasons;

    protected AbstractTaskResult(long startTime, long endTime, String outcomeDescription, boolean incremental, List<String> executionReasons) {
        super(startTime, endTime, outcomeDescription);
        this.incremental = incremental;
        this.executionReasons = executionReasons;
    }

    @Override
    public boolean isIncremental() {
        return incremental;
    }

    @Override
    public List<String> getExecutionReasons() {
        return executionReasons;
    }

}
