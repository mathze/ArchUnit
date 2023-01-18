/*
 * Copyright 2014-2023 TNG Technology Consulting GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tngtech.archunit.core.importer;

import java.net.URI;

class SourceDescriptor {
    private final URI sourceUri;
    private final boolean md5InClassSourcesEnabled;

    SourceDescriptor(URI sourceUri, boolean md5InClassSourcesEnabled) {
        this.sourceUri = sourceUri;
        this.md5InClassSourcesEnabled = md5InClassSourcesEnabled;
    }

    URI getUri() {
        return sourceUri;
    }

    boolean isMd5InClassSourcesEnabled() {
        return md5InClassSourcesEnabled;
    }
}
