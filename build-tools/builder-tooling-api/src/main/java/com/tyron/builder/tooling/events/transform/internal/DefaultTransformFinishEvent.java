/*
 * Copyright 2018 the original author or authors.
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

package com.tyron.builder.tooling.events.transform.internal;

import com.tyron.builder.tooling.events.internal.DefaultFinishEvent;
import com.tyron.builder.tooling.events.transform.TransformFinishEvent;
import com.tyron.builder.tooling.events.transform.TransformOperationDescriptor;
import com.tyron.builder.tooling.events.transform.TransformOperationResult;

public class DefaultTransformFinishEvent extends DefaultFinishEvent<TransformOperationDescriptor, TransformOperationResult> implements TransformFinishEvent {

    public DefaultTransformFinishEvent(long eventTime, String displayName, TransformOperationDescriptor descriptor, TransformOperationResult result) {
        super(eventTime, displayName, descriptor, result);
    }
}
