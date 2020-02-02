package eu.sdaacademy.pl.projektspringweb;

import model.Project;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class ProjectRepository {

    public List<Project> getProjects(){
        return Arrays.asList(
                Project.builder()
                .name("pierwszy")
                .team(1)
                .startDate(new Date())
                .build()
                ,
                Project.builder()
                        .name("drugi")
                        .team(2)
                        .startDate(new Date())
                        .build()
                ,
                Project.builder()
                        .name("trzeci")
                        .team(3)
                        .startDate(new Date())
                        .build()
        );
    }
}
