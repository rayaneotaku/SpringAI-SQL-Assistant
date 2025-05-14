package antonBurshteyn.SpringAI.service;

import antonBurshteyn.SpringAI.model.QueryResult;

public interface SqlQueryService {
    /**
     * Processes a natural language question by generating SQL and executing it
     *
     * @param question the natural language question
     * @return a QueryResult containing SQL and result data
     */
    QueryResult processQuestion(String question);
}