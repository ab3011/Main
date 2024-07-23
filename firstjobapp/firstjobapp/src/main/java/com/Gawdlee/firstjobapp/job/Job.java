package com.Gawdlee.firstjobapp.job;

public class Job {
    private Long id;
    private String title;
    private String description;
    private String location;
    private String maxSalary;
    private String minSalary;

    public Job(String description, Long id, String title, String location, String maxSalary, String minSalary) {
        this.description = description;
        this.id = id;
        this.title = title;
        this.location = location;
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(String maxSalary) {
        this.maxSalary = maxSalary;
    }

    public String getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(String minSalary) {
        this.minSalary = minSalary;
    }
}
