package main.java.com.conceptcoding.creationalpatterns.builder.solution;

import java.util.ArrayList;
import java.util.List;

// Step 4: Concrete Builder for MBA Students
public class MBAStudentBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setSubjects() {
        List<String> mbaSubjectsList = new ArrayList<>();
        mbaSubjectsList.add("Micro Economics");
        this.subjects = mbaSubjectsList;
        return this;
    }
}
