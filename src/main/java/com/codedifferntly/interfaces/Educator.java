package com.codedifferntly.interfaces;

public enum Educator implements Teacher, Identifiable {
    TARIQ(543L, "Tariq"),
    FRANKIE(542L, "Frankie"),
    FAITH (541L, "Faith");

    double timeWorked;
    final Instructor instructor;

    Educator( Long id, String name){
        instructor = new Instructor(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
    instructor.teach(learner, numberOfHours);
    this.timeWorked += numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
    instructor.lecture(learners,numberOfHours);
    this.timeWorked += numberOfHours;
    }
    public double getTimeWorked(){
        return timeWorked;

    }

    @Override
    public Long getId() {
        return instructor.getId();
    }
}
