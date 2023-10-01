package org.example.hello;

import jade.core.Agent;
import jade.core.Location;
import java.lang.String;

public abstract class HelloWorldAgent extends Agent implements Location {

    protected void setup() {
        System.out.println("Agent Started: Hello World!");
        System.out.println("-----About Me:-----");
        System.out.println("My local name is: " + getLocalName());
        System.out.println("My globally unique name is: " + getName());
        System.out.println("-----About Here:-----");
        System.out.println("I am running in a location called:" + getAddress());
        System.out.println("Which is identified uniquely as: " + getID());
        System.out.println("And is contactable at: " + getAddress());
        System.out.println("Using the protocol: " + getProtocol());

        //make this agent terminate
        doDelete();
    }
}
