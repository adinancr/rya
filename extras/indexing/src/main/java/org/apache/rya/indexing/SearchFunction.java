package org.apache.rya.indexing;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.eclipse.rdf4j.common.iteration.CloseableIteration;
import org.eclipse.rdf4j.model.Statement;
import org.eclipse.rdf4j.query.QueryEvaluationException;

/**
 * A function used to perform a search.
 */
public interface SearchFunction {

    /**
     * Search the indices for the given terms and return {@link Statement}s that meet the {@link StatementConstraints}
     * 
     * @param searchTerms
     *            the search terms
     * @param contraints
     *            the constraints on the returned {@link Statement}s
     * @return
     * @throws QueryEvaluationException
     */
    public CloseableIteration<Statement, QueryEvaluationException> performSearch(String searchTerms, StatementConstraints contraints)
            throws QueryEvaluationException;

}
