package main.java.com.conceptcoding.creationalpatterns.builder.solution;

// Step 3: Concrete Builder for Engineering Students

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends  StudentBuilder{
    // Engineering-specific methods
    @Override
    public StudentBuilder setSubjects() {
        List<String> enggSubjectsList = new ArrayList<>();
        enggSubjectsList.add("OS");
        enggSubjectsList.add("DBMS");
        this.subjects = enggSubjectsList;
        return this;
    }
}
