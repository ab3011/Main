package com.Gawdlee.firstjobapp.job.imp;


import com.Gawdlee.firstjobapp.job.Job;
import com.Gawdlee.firstjobapp.job.JobService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobServiceImp implements JobService {

    private  List<Job> jobs=new ArrayList<>();
    private Long nextId=1L;
    @Override
    public List<Job> findAll() {
        return jobs;
    }

    @Override
    public void createJob(Job job) {
        job.setId(nextId++);
        jobs.add(job);
    }

    @Override
    public Job getJobById(Long id) {
        for (Job job : jobs) {
            if (job.getId().equals(id)) {
                return job;
            }
        }
        return null;
    }

    @Override
    public Job deleteJobById(Long id) {
        for (Job job : jobs) {
            if (job.getId().equals(id)) {
                jobs.remove(job);
                return job;
            }
        }
        return null;
    }

    @Override
    public boolean updateJob(Long id, Job updateJob) {
        for (Job job : jobs) {
            if (job.getId().equals(id)) {
                jobs.set(jobs.indexOf(job), updateJob);
                return true;
            }
        }
        return false;
    }
}
