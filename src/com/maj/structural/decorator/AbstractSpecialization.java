package com.maj.structural.decorator;

public class AbstractSpecialization implements Job {
    private final Job job;

    public AbstractSpecialization(Job job) {
        this.job = job;
    }

    @Override
    public String attack() {
        return job.attack();
    }
}
