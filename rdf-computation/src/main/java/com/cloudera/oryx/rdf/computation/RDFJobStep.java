/*
 * Copyright (c) 2013, Cloudera, Inc. All Rights Reserved.
 *
 * Cloudera, Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"). You may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * This software is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for
 * the specific language governing permissions and limitations under the
 * License.
 */

package com.cloudera.oryx.rdf.computation;

import com.cloudera.oryx.computation.common.JobStep;

public abstract class RDFJobStep extends JobStep {

  @Override
  protected final RDFJobStepConfig getConfig() {
    return (RDFJobStepConfig) super.getConfig();
  }

  @Override
  protected final RDFJobStepConfig parseConfig(String[] args) {
    return RDFJobStepConfig.fromArgsArray(args);
  }

}
