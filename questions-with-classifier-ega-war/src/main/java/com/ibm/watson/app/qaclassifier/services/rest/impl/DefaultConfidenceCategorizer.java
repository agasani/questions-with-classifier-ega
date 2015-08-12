/* Copyright IBM Corp. 2015
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

package com.ibm.watson.app.qaclassifier.services.rest.impl;

import java.util.ArrayList;
import java.util.List;

import com.ibm.watson.app.qaclassifier.rest.model.Answer;
import com.ibm.watson.app.qaclassifier.rest.model.Answer.ConfidenceCategoryEnum;
import com.ibm.watson.app.qaclassifier.services.rest.ConfidenceCategorizer;

public class DefaultConfidenceCategorizer implements ConfidenceCategorizer {
    @Override
    public List<Answer> categorize(List<Answer> answersIn) {
        final List<Answer> answers = new ArrayList<>(answersIn);
        for(Answer answer : answers) {
            answer.setConfidenceCategory(ConfidenceCategoryEnum.HIGH);
        }
        return answers;
    }
}