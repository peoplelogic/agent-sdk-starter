package dev.peoplelogic.starter;

import ai.peoplelogic.agents.common.spring.PeoplelogicAgentApplication;
import ai.peoplelogic.agents.common.spring.shell.PeoplelogicAgentRunner;

@PeoplelogicAgentApplication
public class SampleAgentRunner extends PeoplelogicAgentRunner {
    public static void main(String[] args) {
        run(SampleAgentRunner.class, args);
    }
}