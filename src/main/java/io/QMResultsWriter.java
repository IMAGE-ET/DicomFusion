/*
 * Copyright 2014 Arthur Henning.
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

package io;

import exception.DicomFusionException;
import java.io.IOException;
import java.util.ArrayList;
import jxl.write.WriteException;
import quality_metrics.QualityMetricsOutput;

/**
 *
 * @author Arthur Henning
 */
public interface QMResultsWriter {

    public void setOutputFolder(String path);

    public void setOutputFile(String filename);

    public void write(ArrayList<ArrayList<QualityMetricsOutput>> results) throws DicomFusionException;
}
